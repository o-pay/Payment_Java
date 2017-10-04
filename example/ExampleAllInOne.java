package example;

import java.util.Hashtable;

import allPay.payment.integration.AllInOne;
import allPay.payment.integration.domain.AioChargebackObj;
import allPay.payment.integration.domain.AioCheckOutALL;
import allPay.payment.integration.domain.AioCheckOutATM;
import allPay.payment.integration.domain.AioCheckOutCVS;
import allPay.payment.integration.domain.AioCheckOutDevide;
import allPay.payment.integration.domain.AioCheckOutOneTime;
import allPay.payment.integration.domain.AioCheckOutPeriod;
import allPay.payment.integration.domain.AioCheckOutTenpay;
import allPay.payment.integration.domain.AioCheckOutTopUpUsed;
import allPay.payment.integration.domain.AioCheckOutWebATM;
import allPay.payment.integration.domain.CaptureObj;
import allPay.payment.integration.domain.DoActionObj;
import allPay.payment.integration.domain.FundingReconDetailObj;
import allPay.payment.integration.domain.InvoiceObj;
import allPay.payment.integration.domain.QueryCreditCardPeriodInfoObj;
import allPay.payment.integration.domain.QueryTradeInfoObj;
import allPay.payment.integration.domain.QueryTradeObj;
import allPay.payment.integration.domain.TradeNoAioObj;
import allPay.payment.integration.exception.AllPayException;

public class ExampleAllInOne {
	public static AllInOne all;
	public static void main(String[] args) {
		initial();
		System.out.println("compare CheckMacValue method testing result: " + cmprChkMacValue());
		System.out.println("doAction: " + postDoAction());
		System.out.println("queryTradeInfo: " + postQueryTradeInfo());
		System.out.println("queryCreditCardPeriodInfo: " + postQueryCreditCardPeriodInfo());
		System.out.println("capture: " +postCapture());
		System.out.println("queryTrade: " + postQueryTrade());
		System.out.println("tradeNoAio: " + postTradeNoAio());
		System.out.println("fundingReconDetail: " + postFundingReconDetail());
		System.out.println("aioChargeback: " + postAioChargeback());
		System.out.println("aioCheckOutALL: " + genAioCheckOutALL());
		System.out.println("aioCheckOutATM: " + genAioCheckOutATM());
		System.out.println("aioCheckOutCVS: " + genAioCheckOutCVS());
		System.out.println("aioCheckOutDevide: " + genAioCheckOutDevide());
		System.out.println("aioCheckOutOneTime: " + genAioCheckOutOneTime());
		System.out.println("aioCheckOutPeriod: " + genAioCheckOutPeriod());
		System.out.println("aioCheckOutWebATM: " + genAioCheckOutWebATM());
		System.out.println("aioCheckOutTenpay: " + genAioCheckOutTenpay());
		System.out.println("aioCheckOutTopUpUsed: " + genAioCheckOutTopUpUsed());
	}
	private static void initial(){
		all = new AllInOne("");
	}
	
	public static boolean cmprChkMacValue(){
		Hashtable<String, String> dict = new Hashtable<String, String>();
		dict.put("MerchantID", "2000132");
		dict.put("CheckMacValue", "50BE3989953C1734E32DD18EB23698241E035F9CBCAC74371CCCF09E0E15BD61");
		return all.compareCheckMacValue(dict);
	}
	
	public static String postDoAction(){
		DoActionObj obj = new DoActionObj();
		obj.setMerchantTradeNo("b0fac40057364c0894b");
		obj.setTotalAmount("100");
		obj.setTradeNo("16054565489");
		obj.setAction("C");
		String result = "";
		try{
			result = all.doAction(obj);
		} catch(AllPayException e){
			// to do whatever you need
			e.ShowExceptionMessage();
		}
		return result;
	}
	
	public static String postFundingReconDetail(){
		FundingReconDetailObj obj = new FundingReconDetailObj();
		obj.setPayDateType("close");
		obj.setStartDate("2017-03-03");
		obj.setEndDate("2017-03-03");
		return all.fundingReconDetail(obj);
	}
	
	public static String postAioChargeback(){
		AioChargebackObj obj = new AioChargebackObj();
		obj.setMerchantTradeNo("b0fac40057364c0894b");
		obj.setTradeNo("16054565489");
		obj.setChargeBackTotalAmount("100");
		return all.aioChargeback(obj);
	}
	
	public static String postCapture(){
		CaptureObj obj = new CaptureObj();
		obj.setMerchantTradeNo("testCompany0003");
		obj.setCaptureAMT("100");
		obj.setUserRefundAMT("0");
		String result = "";
		try{
			result = all.capture(obj);
		} catch(AllPayException e){
			e.ShowExceptionMessage();
		}
		return result;
	}
	
	public static String postQueryTrade(){
		QueryTradeObj obj = new QueryTradeObj();
		obj.setCreditRefundId("10123456");
		obj.setCreditAmount("100");
		obj.setCreditCheckCode("59997889");
		return all.queryTrade(obj);
	}
	
	public static String postQueryTradeInfo(){
		QueryTradeInfoObj obj = new QueryTradeInfoObj();
		obj.setMerchantTradeNo("fdgfdhdhfghgf");
		return all.queryTradeInfo(obj);
	}
	
	public static String postTradeNoAio(){
		TradeNoAioObj obj = new TradeNoAioObj();
		obj.setDateType("6");
		obj.setBeginDate("2017-03-03");
		obj.setEndDate("2017-03-03");
		obj.setMediaFormated("1");
		return all.tradeNoAio(obj);
	}
	
	public static String postQueryCreditCardPeriodInfo(){
		QueryCreditCardPeriodInfoObj obj = new QueryCreditCardPeriodInfoObj();
		obj.setMerchantTradeNo("5a093fdb504743e2863");
		return all.queryCreditCardPeriodInfo(obj);
	}
	
	public static String genAioCheckOutWebATM(){
		AioCheckOutWebATM obj = new AioCheckOutWebATM();
		obj.setMerchantTradeNo("testCompany0003");
		obj.setMerchantTradeDate("2017/01/01 08:05:08");
		obj.setTotalAmount("100");
		obj.setTradeDesc("test Description");
		obj.setItemName("Test Item");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setHoldTradeAMT("0");
		obj.setUseRedeem("N");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutALL(){
		AioCheckOutALL obj = new AioCheckOutALL();
		obj.setMerchantTradeNo("testCompany0004");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setHoldTradeAMT("0");
		obj.setUseRedeem("N");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutATM(){
		AioCheckOutATM obj = new AioCheckOutATM();
		obj.setMerchantTradeNo("testCompany0005");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setHoldTradeAMT("0");
		obj.setUseRedeem("N");
		obj.setExpireDate("6");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutCVS(){
		AioCheckOutCVS obj = new AioCheckOutCVS();
		InvoiceObj invoice = new InvoiceObj();
		obj.setMerchantTradeNo("testCompany0007");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setHoldTradeAMT("0");
		obj.setUseRedeem("N");
		obj.setStoreExpireDate("3");
		
		invoice.setRelateNumber("asdfghhb");
		invoice.setCustomerID("123456");
		invoice.setCarruerType("1");
		invoice.setTaxType("1");
		invoice.setCarruerNum("");
		invoice.setDonation("2");
		invoice.setLoveCode("X123456");
		invoice.setPrint("0");
		invoice.setCustomerName("Mark");
		invoice.setCustomerAddr("台北");
		invoice.setCustomerPhone("0911429215");
		invoice.setDelayDay("1");
		invoice.setInvType("07");
		invoice.setInvoiceItemName("電視");
		invoice.setInvoiceItemCount("1");
		invoice.setInvoiceItemWord("台");
		invoice.setInvoiceItemPrice("50");
		invoice.setInvoiceItemTaxType("1");
		String form = all.aioCheckOut(obj, invoice);
		return form;
	}
	
	public static String genAioCheckOutDevide(){
		AioCheckOutDevide obj = new AioCheckOutDevide();
		obj.setMerchantTradeNo("testCompany0007");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setHoldTradeAMT("0");
		obj.setUseRedeem("N");
		obj.setCreditInstallment("3");
		obj.setInstallmentAmount("10");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutOneTime(){
		AioCheckOutOneTime obj = new AioCheckOutOneTime();
		obj.setMerchantTradeNo("testCompany0008");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setHoldTradeAMT("0");
		obj.setUseRedeem("N");
		obj.setRedeem("Y");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutPeriod(){
		AioCheckOutPeriod obj = new AioCheckOutPeriod();
		obj.setMerchantTradeNo("testCompany0009");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setHoldTradeAMT("0");
		obj.setUseRedeem("N");
		obj.setPeriodAmount("50");
		obj.setPeriodType("D");
		obj.setFrequency("1");
		obj.setExecTimes("12");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutTenpay(){
		AioCheckOutTenpay obj = new AioCheckOutTenpay();
		obj.setMerchantTradeNo("testCompany0010");
		obj.setMerchantTradeDate("2017/01/01 08:05:23");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test Description");
		obj.setItemName("TestItem");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setHoldTradeAMT("0");
		obj.setUseRedeem("N");
		obj.setExpireTime("2017/02/20 10:04:04");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
	
	public static String genAioCheckOutTopUpUsed(){
		AioCheckOutTopUpUsed obj = new AioCheckOutTopUpUsed();
		obj.setMerchantTradeNo("sdggrerrr");
		obj.setMerchantTradeDate("2017/01/01 08:04:04");
		obj.setTotalAmount("50");
		obj.setTradeDesc("test");
		obj.setItemName("name");
		obj.setReturnURL("http://211.23.128.214:5000");
		obj.setNeedExtraPaidInfo("N");
		obj.setHoldTradeAMT("0");
		obj.setUseRedeem("N");
		String form = all.aioCheckOut(obj, null);
		return form;
	}
}
