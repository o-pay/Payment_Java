package allPay.payment.integration.domain;

/**
 * 當ChoosePayment為CVS時的取號結果通知物件
 * @author mark.chiu
 *
 */
public class CVSRequestObj {
	
	/**
	 * MerchantID
	 * 會員編號
	 */
	private String MerchantID;
	
	/**
	 * MerchantTradeNo
	 * 會員交易編號
	 */
	private String MerchantTradeNo;
	
	/**
	 * RtnCode
	 * 交易狀態
	 */
	private String RtnCode;
	
	/**
	 * RtnMsg
	 * 交易訊息
	 */
	private String RtnMsg;
	
	/**
	 * TradeNo
	 * allPay的交易編號
	 */
	private String TradeNo;
	
	/**
	 * TradeAmt
	 * 交易金額
	 */
	private String TradeAmt;
	
	/**
	 * PayAmt
	 * 實際付款金額
	 */
	private String PayAmt;
	
	/**
	 * RedeemAmt
	 * 折抵金額
	 */
	private String RedeemAmt;
	
	/**
	 * PaymentType
	 * 會員選擇的付款方式
	 */
	private String PaymentType;
	
	/**
	 * TradeDate
	 * 訂單成立時間
	 */
	private String TradeDate;
	
	/**
	 * Barcode1
	 * 條碼第一段號碼
	 */
	private String Barcode1;
	
	/**
	 * Barcode2
	 * 條碼第二段號碼
	 */
	private String Barcode2;
	
	/**
	 * Barcode3
	 * 條碼第三段號碼
	 */
	private String Barcode3;
	
	/**
	 * CheckMacValue
	 * 檢查碼
	 */
	private String CheckMacValue;
	
	/**
	 * PaymentNo
	 * 繳費代碼
	 */
	private String PaymentNo;
	
	/**
	 * ExpireDate
	 * 繳費期限
	 */
	private String ExpireDate;
	
	/********************* getters and setters *********************/

	/**
	 * 取得MerchantID 會員編號
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}

	/**
	 * 設定MerchantID 會員編號
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}

	/**
	 * 取得MerchantTradeNo 會員交易編號
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}

	/**
	 * 設定MerchantTradeNo 會員交易編號
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}

	/**
	 * 取得RtnCode 交易狀態
	 * @return RtnCode
	 */
	public String getRtnCode() {
		return RtnCode;
	}

	/**
	 * 設定RtnCode 交易狀態
	 * @param rtnCode
	 */
	public void setRtnCode(String rtnCode) {
		RtnCode = rtnCode;
	}

	/**
	 * 取得RtnMsg 交易訊息
	 * @return RtnMsg
	 */
	public String getRtnMsg() {
		return RtnMsg;
	}

	/**
	 * 設定RtnMsg 交易訊息
	 * @param rtnMsg
	 */
	public void setRtnMsg(String rtnMsg) {
		RtnMsg = rtnMsg;
	}

	/**
	 * 取得TradeNo allPay的交易編號
	 * @return TradeNo
	 */
	public String getTradeNo() {
		return TradeNo;
	}

	/**
	 * 設定TradeNo allPay的交易編號
	 * @param tradeNo
	 */
	public void setTradeNo(String tradeNo) {
		TradeNo = tradeNo;
	}

	/**
	 * 取得TradeAmt 交易金額
	 * @return TradeAmt
	 */
	public String getTradeAmt() {
		return TradeAmt;
	}

	/**
	 * 設定TradeAmt 交易金額
	 * @param tradeAmt
	 */
	public void setTradeAmt(String tradeAmt) {
		TradeAmt = tradeAmt;
	}

	/**
	 * 取得PaymentType 會員選擇的付款方式
	 * @return PaymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}

	/**
	 * 設定PaymentType 會員選擇的付款方式
	 * @param paymentType
	 */
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}

	/**
	 * 取得TradeDate 訂單成立時間
	 * @return TradeDate
	 */
	public String getTradeDate() {
		return TradeDate;
	}

	/**
	 * 設定TradeDate 訂單成立時間
	 * @param tradeDate
	 */
	public void setTradeDate(String tradeDate) {
		TradeDate = tradeDate;
	}

	/**
	 * 取得CheckMacValue 檢查碼
	 * @return CheckMacValue
	 */
	public String getCheckMacValue() {
		return CheckMacValue;
	}

	/**
	 * 設定CheckMacValue 檢查碼
	 * @param checkMacValue
	 */
	public void setCheckMacValue(String checkMacValue) {
		CheckMacValue = checkMacValue;
	}

	/**
	 * 取得PaymentNo 繳費代碼
	 * @return PaymentNo
	 */
	public String getPaymentNo() {
		return PaymentNo;
	}

	/**
	 * 設定PaymentNo 繳費代碼
	 * @param paymentNo
	 */
	public void setPaymentNo(String paymentNo) {
		PaymentNo = paymentNo;
	}

	/**
	 * 取得ExpireDate 繳費期限
	 * @return ExpireDate
	 */
	public String getExpireDate() {
		return ExpireDate;
	}

	/**
	 * 設定ExpireDate 繳費期限
	 * @param expireDate
	 */
	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}

	/**
	 * 取得Barcode1 條碼第一段號碼
	 * @return Barcode1
	 */
	public String getBarcode1() {
		return Barcode1;
	}

	/**
	 * 設定Barcode1 條碼第一段號碼
	 * @param barcode1
	 */
	public void setBarcode1(String barcode1) {
		Barcode1 = barcode1;
	}

	/**
	 * 取得Barcode2 條碼第二段號碼
	 * @return Barcode2
	 */
	public String getBarcode2() {
		return Barcode2;
	}

	/**
	 * 設定Barcode2 條碼第二段號碼
	 * @param barcode2
	 */
	public void setBarcode2(String barcode2) {
		Barcode2 = barcode2;
	}

	/**
	 * 取得Barcode3 條碼第三段號碼
	 * @return Barcode3
	 */
	public String getBarcode3() {
		return Barcode3;
	}

	/**
	 * 設定Barcode3 條碼第三段號碼
	 * @param barcode3
	 */
	public void setBarcode3(String barcode3) {
		Barcode3 = barcode3;
	}
	/**
	 * 取得PayAmt 實際付款金額
	 * @return PayAmt
	 */
	public String getPayAmt() {
		return PayAmt;
	}
	/**
	 * 設定PayAmt 實際付款金額
	 * @param payAmt
	 */
	public void setPayAmt(String payAmt) {
		PayAmt = payAmt;
	}
	/**
	 * 取得RedeemAmt 折抵金額
	 * @return RedeemAmt
	 */
	public String getRedeemAmt() {
		return RedeemAmt;
	}
	/**
	 * 設定RedeemAmt 折抵金額
	 * @param redeemAmt
	 */
	public void setRedeemAmt(String redeemAmt) {
		RedeemAmt = redeemAmt;
	}
}
