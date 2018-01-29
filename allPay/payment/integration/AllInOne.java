package allPay.payment.integration;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import allPay.payment.integration.allPayOperator.AllPayFunction;
import allPay.payment.integration.domain.ATMRequestObj;
import allPay.payment.integration.domain.AioChargebackObj;
import allPay.payment.integration.domain.AioCheckOutALL;
import allPay.payment.integration.domain.AioCheckOutATM;
import allPay.payment.integration.domain.AioCheckOutAccountLink;
import allPay.payment.integration.domain.AioCheckOutCVS;
import allPay.payment.integration.domain.AioCheckOutDevide;
import allPay.payment.integration.domain.AioCheckOutOneTime;
import allPay.payment.integration.domain.AioCheckOutPeriod;
import allPay.payment.integration.domain.AioCheckOutTenpay;
import allPay.payment.integration.domain.AioCheckOutTopUpUsed;
import allPay.payment.integration.domain.AioCheckOutWebATM;
import allPay.payment.integration.domain.AioCheckOutWeiXinpay;
import allPay.payment.integration.domain.CVSRequestObj;
import allPay.payment.integration.domain.CaptureObj;
import allPay.payment.integration.domain.DoActionObj;
import allPay.payment.integration.domain.FundingReconDetailObj;
import allPay.payment.integration.domain.InvoiceObj;
import allPay.payment.integration.domain.QueryCreditCardPeriodInfoObj;
import allPay.payment.integration.domain.QueryTradeInfoObj;
import allPay.payment.integration.domain.QueryTradeObj;
import allPay.payment.integration.domain.TradeNoAioObj;
import allPay.payment.integration.errorMsg.ErrorMessage;
import allPay.payment.integration.exception.AllPayException;
import allPay.payment.integration.verification.VerifyAioChargeback;
import allPay.payment.integration.verification.VerifyAioCheckOut;
import allPay.payment.integration.verification.VerifyCapture;
import allPay.payment.integration.verification.VerifyDoAction;
import allPay.payment.integration.verification.VerifyFundingReconDetail;
import allPay.payment.integration.verification.VerifyQueryCreditTrade;
import allPay.payment.integration.verification.VerifyQueryTrade;
import allPay.payment.integration.verification.VerifyQueryTradeInfo;
import allPay.payment.integration.verification.VerifyTradeNoAio;

/**
 * 全功能無履約保證類別
 * @author mark.chiu
 *
 */
public class AllInOne extends AllInOneBase{
	
	private final static Logger log = Logger.getLogger(AllInOne.class.getName());
	
	/**
	 * AllInOne Constructor 
	 * 參數帶入log4j.properties的路徑，若帶入空字串則預設不產生log
	 * @param log4jPropertiesPath
	 */
	public AllInOne(String log4jPropertiesPath){
		super();
		if(log4jPropertiesPath != "" && log4jPropertiesPath != null){
			if(log4jPropertiesPath.substring(log4jPropertiesPath.length()-1).equals("/"))
				PropertyConfigurator.configure(log4jPropertiesPath + "log4j.properties");
			else
				PropertyConfigurator.configure(log4jPropertiesPath + "/log4j.properties");
		} else{
			Logger.getRootLogger().setLevel(Level.OFF);
		}
	}
	
	/**
	 * 檢查Hashtable中的檢查碼是否正確(確保資料未被竄改)
	 * @param Hashtable params
	 * @return boolean 
	 */
	public boolean compareCheckMacValue(Hashtable<String, String> params){
		String checkMacValue = "";
		if(!params.containsKey("CheckMacValue")){
			throw new AllPayException(ErrorMessage.HASHTABLE_WITHOUT_CHKMACVALUE);
		}
		try {
			checkMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, params);
		} catch (AllPayException e) {
			throw new AllPayException(ErrorMessage.GEN_CHECK_MAC_VALUE_FAIL);
		}
		if(checkMacValue.equals(params.get("CheckMacValue"))){
			return true;
		} else{
			return false;
		}
	}
	
	/**
	 * 會員申請撥款/退款的方法
	 * @param captureObj
	 * @return response string
	 */
	public String capture(CaptureObj captureObj){
		captureObj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && captureObj.getMerchantID().isEmpty()){
			captureObj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !captureObj.getMerchantID().isEmpty()){
		} else {
			captureObj.setMerchantID(MerchantID);
		}
		log.info("capture params: " + captureObj.toString());
		String result = "";
		String CheckMacValue = "";
		try {
			VerifyCapture verify = new VerifyCapture();
			captureUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(captureObj);
			CheckMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, captureObj);
			log.info("capture generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllPayFunction.genHttpValue(captureObj, CheckMacValue);
			log.info("capture post String: " + httpValue);
			result = AllPayFunction.httpPost(captureUrl, httpValue, "UTF-8");
		} catch (AllPayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new AllPayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 下載信用卡撥款對帳資料檔的方法
	 * @param fundingReconDetailObj
	 * @return response string
	 */
	public String fundingReconDetail(FundingReconDetailObj fundingReconDetailObj){
		fundingReconDetailObj.setMerchantID(MerchantID);
		log.info("fundingReconDetail params: " + fundingReconDetailObj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyFundingReconDetail verify = new VerifyFundingReconDetail();
			fundingReconDetailUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(fundingReconDetailObj);
			CheckMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, fundingReconDetailObj);
			log.info("fundingReconDetail generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllPayFunction.genHttpValue(fundingReconDetailObj, CheckMacValue);
			log.info("fundingReconDetail post String: " + httpValue);
			result = AllPayFunction.httpPost(fundingReconDetailUrl, httpValue, "BIG5");
			List<String> subRE = new ArrayList<String>();
			Pattern pattern = Pattern.compile("\\d{8}\\,\\d{6}\\,\\d{5}");
			Matcher matcher = pattern.matcher(result);
			while(matcher.find()){
				subRE.add(matcher.group());
			}
			pattern = Pattern.compile("\\,+\\u6bcf\\u65e5\\u5c0f\\u8a08");
			matcher = pattern.matcher(result);
			while(matcher.find()){
				subRE.add(matcher.group());
				break;
			}
			pattern = Pattern.compile("\\,+\\u5408\\u8a08");
			matcher = pattern.matcher(result);
			while(matcher.find()){
				subRE.add(matcher.group());
				break;
			}
			pattern = Pattern.compile("\\u6388\\u6b0a\\u55ae\\u865f");
			matcher = pattern.matcher(result);
			while(matcher.find()){
				subRE.add(matcher.group());
				break;
			}
			for(String tmp : subRE){
				result = result.replace(tmp, "\r\n"+tmp);
			}
			result = result.substring(2);
		} catch (AllPayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new AllPayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 會員通知退款的方法
	 * @param aioChargebackObj
	 * @return response string
	 */
	public String aioChargeback(AioChargebackObj aioChargebackObj){
		aioChargebackObj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && aioChargebackObj.getMerchantID().isEmpty()){
			aioChargebackObj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !aioChargebackObj.getMerchantID().isEmpty()){
		} else {
			aioChargebackObj.setMerchantID(MerchantID);
		}
		log.info("aioChargeback params: " + aioChargebackObj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyAioChargeback verify = new VerifyAioChargeback();
			aioChargebackUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(aioChargebackObj);
			CheckMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, aioChargebackObj);
			log.info("aioChargeback generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllPayFunction.genHttpValue(aioChargebackObj, CheckMacValue);
			log.info("aioChargeback post String: " + httpValue);
			result = AllPayFunction.httpPost(aioChargebackUrl, httpValue, "UTF-8");
		} catch (AllPayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new AllPayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 查詢信用卡單筆明細記錄的方法
	 * @param queryTradeObj
	 * @return response string
	 */
	public String queryTrade(QueryTradeObj queryTradeObj){
		queryTradeObj.setMerchantID(MerchantID);
		log.info("queryTrade params: " + queryTradeObj.toString());
		String result = "";
		String CheckMacValue = "";
		try {
			VerifyQueryTrade verify = new VerifyQueryTrade();
			queryTradeUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(queryTradeObj);
			CheckMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, queryTradeObj);
			log.info("queryTrade generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllPayFunction.genHttpValue(queryTradeObj, CheckMacValue);
			log.info("queryTrade post String: " + httpValue);
			result = AllPayFunction.httpPost(queryTradeUrl, httpValue, "UTF-8");
		} catch (AllPayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new AllPayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 下載會員對帳媒體檔的方法
	 * @param tradeNoAioObj
	 * @return response string
	 */
	public String tradeNoAio(TradeNoAioObj tradeNoAioObj){
		tradeNoAioObj.setMerchantID(MerchantID);
		log.info("tradeNoAio params: " + tradeNoAioObj.toString());
		String result = "";
		String CheckMacValue = "";
		try{
			VerifyTradeNoAio verify = new VerifyTradeNoAio();
			tradeNoAioUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(tradeNoAioObj);
			CheckMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, tradeNoAioObj);
			log.info("tradeNoAio generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllPayFunction.genHttpValue(tradeNoAioObj, CheckMacValue);
			log.info("tradeNoAio post String: " + httpValue);
			result = AllPayFunction.httpPost(tradeNoAioUrl, httpValue, "BIG5");
			List<String> subRE = new ArrayList<String>();
			if(tradeNoAioObj.getMediaFormated().equals("0")){
				Pattern pattern = Pattern.compile("\\d{4}\\-\\d{2}\\-\\d{2} \\d{2}:\\d{2}:\\d{2},\\d{16}");
				Matcher matcher = pattern.matcher(result);
				while(matcher.find()){
					subRE.add(matcher.group());
				}
				for(String tmp : subRE){
					result = result.replace(tmp, "\r\n"+tmp);
				}
			} else if(tradeNoAioObj.getMediaFormated().equals("1")){
				result = result.replace("=", "");
				Pattern pattern = Pattern.compile("\"\\d{4}\\/\\d{2}\\/\\d{2} \\d{2}:\\d{2}:\\d{2}\"");
				Matcher matcher = pattern.matcher(result);
				while(matcher.find()){
					subRE.add(matcher.group());
				}
				for(String tmp : subRE){
					result = result.replace(tmp, "\r\n"+tmp);
				}
			}
		} catch (AllPayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new AllPayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 信用卡關帳/退刷/取消/放棄的方法
	 * @param doActionObj
	 * @return response string
	 */
	public String doAction(DoActionObj doActionObj){
		doActionObj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && doActionObj.getMerchantID().isEmpty()){
			doActionObj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !doActionObj.getMerchantID().isEmpty()){
		} else {
			doActionObj.setMerchantID(MerchantID);
		}
		log.info("doAction params: " + doActionObj.toString());
		String result = "";
		String CheckMacValue = "";
		try {
			VerifyDoAction verify = new VerifyDoAction();
			doActionUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(doActionObj);
			CheckMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, doActionObj);
			log.info("doAction generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllPayFunction.genHttpValue(doActionObj, CheckMacValue);
			log.info("doAction post String: " + httpValue);
			result = AllPayFunction.httpPost(doActionUrl, httpValue, "UTF-8");
		} catch (AllPayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new AllPayException(e2.getNewExceptionMessage());
		} 
		return result;
	}
	
	/**
	 * 查詢訂單資料的方法
	 * @param queryTradeInfoObj
	 * @return response string
	 */
	public String queryTradeInfo(QueryTradeInfoObj queryTradeInfoObj){
		queryTradeInfoObj.setPlatformID(PlatformID);
		if(!PlatformID.isEmpty() && queryTradeInfoObj.getMerchantID().isEmpty()){
			queryTradeInfoObj.setMerchantID(MerchantID);
		} else if(!PlatformID.isEmpty() && !queryTradeInfoObj.getMerchantID().isEmpty()){
		} else {
			queryTradeInfoObj.setMerchantID(MerchantID);
		}
		queryTradeInfoObj.setTimeStamp(AllPayFunction.genUnixTimeStamp());
		log.info("queryTradeInfo params: " + queryTradeInfoObj.toString());
		String result = "";
		String CheckMacValue = "";
		try {
			VerifyQueryTradeInfo verify = new VerifyQueryTradeInfo();
			queryTradeInfoUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(queryTradeInfoObj);
			CheckMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, queryTradeInfoObj);
			log.info("queryTradeInfo generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllPayFunction.genHttpValue(queryTradeInfoObj, CheckMacValue);
			log.info("queryTradeInfo post String: " + httpValue);
			result = AllPayFunction.httpPost(queryTradeInfoUrl, httpValue, "UTF-8");
		} catch (AllPayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new AllPayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	/**
	 * 信用卡定期定額訂單查詢
	 * @param queryCreditCardPeriodInfoObj
	 * @return response JSON string
	 */
	public String queryCreditCardPeriodInfo(QueryCreditCardPeriodInfoObj queryCreditCardPeriodInfoObj) {
		queryCreditCardPeriodInfoObj.setMerchantID(MerchantID);
		queryCreditCardPeriodInfoObj.setTimeStamp(AllPayFunction.genUnixTimeStamp());
		log.info("queryCreditCardPeriodeInfo params: " + queryCreditCardPeriodInfoObj.toString());
		String result = "";
		String CheckMacValue = "";
		try {
			VerifyQueryCreditTrade verify = new VerifyQueryCreditTrade();
			queryCreditTradeUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(queryCreditCardPeriodInfoObj);
			CheckMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, queryCreditCardPeriodInfoObj);
			log.info("queryCreditCardPeriodInfo generate CheckMacValue: " + CheckMacValue);
			String httpValue = AllPayFunction.genHttpValue(queryCreditCardPeriodInfoObj, CheckMacValue);
			log.info("queryCreditCardPeriodInfo post String: " + httpValue);
			result = AllPayFunction.httpPost(queryCreditTradeUrl, httpValue, "UTF-8");
		} catch (AllPayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new AllPayException(e2.getNewExceptionMessage());
		}
		return result;
	}
	
	
	/**
	 * 產生訂單Html Form的方法
	 * @param obj AioCheckOut類型的物件
	 * @param invoice
	 * @return String
	 */
	public String aioCheckOut(Object obj, InvoiceObj invoice){
		StringBuilder out = new StringBuilder();
		String ignoreParam = "";
		if(obj instanceof AioCheckOutALL){
			((AioCheckOutALL) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutALL) obj).getMerchantID().isEmpty()){
				((AioCheckOutALL) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutALL) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutALL) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutALL) obj).setInvoiceMark(invoice == null? "N" : "Y");
			if(ignorePayment.length > 0){
				ignoreParam = Arrays.toString(ignorePayment);
				ignoreParam = ignoreParam.replaceAll(", ", "#");
				ignoreParam = ignoreParam.substring(1, ignoreParam.length()-1);
				((AioCheckOutALL) obj).setIgnorePayment(ignoreParam);
			}
			log.info("aioCheckOutALL params: " + ((AioCheckOutALL) obj).toString());
		} else if(obj instanceof AioCheckOutAccountLink){
			((AioCheckOutAccountLink) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutAccountLink) obj).getMerchantID().isEmpty()){
				((AioCheckOutAccountLink) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutAccountLink) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutAccountLink) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutAccountLink) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutAccountLink params: " + ((AioCheckOutAccountLink) obj).toString());
		} else if(obj instanceof AioCheckOutWeiXinpay){
			((AioCheckOutWeiXinpay) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutWeiXinpay) obj).getMerchantID().isEmpty()){
				((AioCheckOutWeiXinpay) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutWeiXinpay) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutWeiXinpay) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutWeiXinpay) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutWeiXinpay params: " + ((AioCheckOutWeiXinpay) obj).toString());
		}else if(obj instanceof AioCheckOutTopUpUsed){
			((AioCheckOutTopUpUsed) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutTopUpUsed) obj).getMerchantID().isEmpty()){
				((AioCheckOutTopUpUsed) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutTopUpUsed) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutTopUpUsed) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutTopUpUsed) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutTopUpUsed params: " + ((AioCheckOutTopUpUsed) obj).toString());
		}else if(obj instanceof AioCheckOutATM){
			((AioCheckOutATM) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutATM) obj).getMerchantID().isEmpty()){
				((AioCheckOutATM) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutATM) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutATM) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutATM) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutATM params: " + ((AioCheckOutATM) obj).toString());
		} else if(obj instanceof AioCheckOutCVS){
			((AioCheckOutCVS) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutCVS) obj).getMerchantID().isEmpty()){
				((AioCheckOutCVS) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutCVS) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutCVS) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutCVS) obj).setInvoiceMark(invoice == null? "N" : "Y");
			String TotalAmount = ((AioCheckOutCVS) obj).getTotalAmount();
			if(Integer.parseInt(TotalAmount) < 27 || Integer.parseInt(TotalAmount) > 20000){
				throw new AllPayException(ErrorMessage.CVS_TOTALAMT_ERROR);
			}
			log.info("aioCheckOutCVS params: " + ((AioCheckOutCVS) obj).toString());
		} else if(obj instanceof AioCheckOutDevide){
			((AioCheckOutDevide) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutDevide) obj).getMerchantID().isEmpty()){
				((AioCheckOutDevide) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutDevide) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutDevide) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutDevide) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutDevide params: " + ((AioCheckOutDevide) obj).toString());
		} else if(obj instanceof AioCheckOutOneTime){
			((AioCheckOutOneTime) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutOneTime) obj).getMerchantID().isEmpty()){
				((AioCheckOutOneTime) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutOneTime) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutOneTime) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutOneTime) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutOneTime params: " + ((AioCheckOutOneTime) obj).toString());
		} else if(obj instanceof AioCheckOutPeriod){
			((AioCheckOutPeriod) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutPeriod) obj).getMerchantID().isEmpty()){
				((AioCheckOutPeriod) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutPeriod) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutPeriod) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutPeriod) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutPeriod params: " + ((AioCheckOutPeriod) obj).toString());
		} else if(obj instanceof AioCheckOutTenpay){
			((AioCheckOutTenpay) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutTenpay) obj).getMerchantID().isEmpty()){
				((AioCheckOutTenpay) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutTenpay) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutTenpay) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutTenpay) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutTenpay params: " + ((AioCheckOutTenpay) obj).toString());
		} else if(obj instanceof AioCheckOutWebATM){
			((AioCheckOutWebATM) obj).setPlatformID(PlatformID);
			if(!PlatformID.isEmpty() && ((AioCheckOutWebATM) obj).getMerchantID().isEmpty()){
				((AioCheckOutWebATM) obj).setMerchantID(MerchantID);
			} else if(!PlatformID.isEmpty() && !((AioCheckOutWebATM) obj).getMerchantID().isEmpty()){
			} else {
				((AioCheckOutWebATM) obj).setMerchantID(MerchantID);
			}
			((AioCheckOutWebATM) obj).setInvoiceMark(invoice == null? "N" : "Y");
			log.info("aioCheckOutWebATM params: " + ((AioCheckOutWebATM) obj).toString());
		} else{
			throw new AllPayException(ErrorMessage.UNDIFINED_OBJECT);
		}
		try {
			VerifyAioCheckOut verify = new VerifyAioCheckOut();
			aioCheckOutUrl = verify.getAPIUrl(operatingMode);
			verify.verifyParams(obj);
			if(invoice != null){
				log.info("aioCheckOut invoice params: " + invoice.toString());
				verify.verifyParams(invoice);
				verify.verifyInvoice(invoice);
				invoice.setCustomerName(AllPayFunction.urlEncode(invoice.getCustomerName()));
				invoice.setCustomerAddr(AllPayFunction.urlEncode(invoice.getCustomerAddr()));
				invoice.setCustomerEmail(AllPayFunction.urlEncode(invoice.getCustomerEmail()));
				invoice.setInvoiceItemName(AllPayFunction.urlEncode(invoice.getInvoiceItemName()));
				invoice.setInvoiceItemWord(AllPayFunction.urlEncode(invoice.getInvoiceItemWord()));
				invoice.setInvoiceRemark(AllPayFunction.urlEncode(invoice.getInvoiceRemark()));
				
			}
			out.append(genCheckOutHtmlCode(obj, invoice));
		} catch (AllPayException e2) {
			e2.ShowExceptionMessage();
			log.error(e2.getNewExceptionMessage());
			throw new AllPayException(e2.getNewExceptionMessage());
		}
		return out.toString();
	}
	
	/**
	 * ATM, CVS取號結果通知方法，接收傳送至PaymentInfoURL的資料。回傳物件分為ATMRequestObj, CVSRequestObj二種，請用適當的物件承接以免出錯
	 * @param req
	 * @return obj
	 */
	public Object aioCheckOutFeedback(HttpServletRequest req){
		List<String> parameterNames = new ArrayList<String>(req.getParameterMap().keySet());
		if(parameterNames.contains("BankCode")){
			ATMRequestObj obj = new ATMRequestObj();
			for(String name: parameterNames){
				Method method;
				try {
					method = obj.getClass().getMethod("set"+name, null);
					method.invoke(obj, req.getParameter(name));
				} catch (Exception e) {
					throw new AllPayException(ErrorMessage.OBJ_MISSING_FIELD);
				}
			}
			log.info("ATMRequest params: " + obj.toString());
			String checkMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("ATMRequest self generate CheckMacValue: " + checkMacValue + ", received CheckMacValue: " + obj.getCheckMacValue());
			if(!checkMacValue.equals(obj.getCheckMacValue())){
				log.error(ErrorMessage.CHECK_MAC_VALUE_NOT_EQUALL_ERROR);
				throw new AllPayException(ErrorMessage.CHECK_MAC_VALUE_NOT_EQUALL_ERROR);
			}
			return obj;
		}else{
			CVSRequestObj obj = new CVSRequestObj();
			for(String name: parameterNames){
				Method method;
				try {
					method = obj.getClass().getMethod("set"+name, null);
					method.invoke(obj, req.getParameter(name));
				} catch (Exception e) {
					throw new AllPayException(ErrorMessage.OBJ_MISSING_FIELD);
				}
			}
			log.info("CVSRequest params: " + obj.toString());
			String checkMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, obj);
			log.info("CVSRequest self generate CheckMacValue: " + checkMacValue + ", received CheckMacValue: " + obj.getCheckMacValue());
			if(!checkMacValue.equals(obj.getCheckMacValue())){
				log.error(ErrorMessage.CHECK_MAC_VALUE_NOT_EQUALL_ERROR);
				throw new AllPayException(ErrorMessage.CHECK_MAC_VALUE_NOT_EQUALL_ERROR);
			}
			return obj;
		}
	}
	
	/**
	 * 產生HTML code
	 * @param aio object
	 * @param invoice object
	 * @return string
	 */
	private String genCheckOutHtmlCode(Object aio, InvoiceObj invoice) {
		StringBuilder builder = new StringBuilder();
		Hashtable<String, String> fieldValue = AllPayFunction.objToHashtable(aio);
		Hashtable<String, String> invoiceField = new Hashtable<String, String>();
		if(invoice != null){
			invoiceField = AllPayFunction.objToHashtable(invoice);
			fieldValue.putAll(invoiceField);
		}
		String CheckMacValue = AllPayFunction.genCheckMacValue(HashKey, HashIV, fieldValue);
		log.info("aioCheckOut generate CheckMacValue: " + CheckMacValue);
		fieldValue.put("CheckMacValue", CheckMacValue);
		Set<String> key = fieldValue.keySet();
		String name[] = key.toArray(new String[key.size()]);
		builder.append("<form id=\"allPayAPIForm\" action=\""+ aioCheckOutUrl + "\" method=\"post\">");
		for(int i = 0 ; i < name.length ; i++) {
			builder.append("<input type=\"hidden\" name=\""+name[i]+"\" value=\""+fieldValue.get(name[i])+"\">");
		}
		builder.append("<script language=\"JavaScript\">");
		builder.append("allPayAPIForm.submit()");
		builder.append("</script>");
		builder.append("</form>");
		return builder.toString();
	}
}
