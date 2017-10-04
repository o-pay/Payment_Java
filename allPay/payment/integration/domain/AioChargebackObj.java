package allPay.payment.integration.domain;

/**
 * 會員通知退款物件
 * @author mark.chiu
 *
 */
public class AioChargebackObj {
	
	/**
	 * MerchantID
	 * 會員編號(由allPay提供)
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * 會員交易編號
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * TradeNo
	 * allPay的交易編號
	 */
	private String TradeNo = "";
	
	/**
	 * ChargeBackTotalAmount
	 * 退款金額
	 */
	private String ChargeBackTotalAmount = "";
	
	/**
	 * Remark
	 * 備註欄位
	 */
	private String Remark = "";
	
	/**
	 * PlatformID
	 * 特約合作平台商代號(由allPay提供)
	 */
	private String PlatformID = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得MerchantID 會員編號(由O'Pay提供)
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 設定MerchantID 會員編號(由O'Pay提供)
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * 取得MerchantTradeNo 會員交易編號，訂單成立時的會員交易編號。
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * 設定MerchantTradeNo 會員交易編號，訂單成立時的會員交易編號。
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * 取得TradeNo O'Pay的交易編號，歐付寶在付款成功時，回傳的O’Pay交易編號。
	 * @return TradeNo
	 */
	public String getTradeNo() {
		return TradeNo;
	}
	/**
	 * 設定TradeNo O'Pay的交易編號，歐付寶在付款成功時，回傳的O’Pay交易編號。
	 * @param tradeNo
	 */
	public void setTradeNo(String tradeNo) {
		TradeNo = tradeNo;
	}
	/**
	 * 取得ChargeBackTotalAmount 退款金額
	 * @return ChargeBackTotalAmount
	 */
	public String getChargeBackTotalAmount() {
		return ChargeBackTotalAmount;
	}
	/**
	 * 設定ChargeBackTotalAmount 退款金額
	 * @param chargeBackTotalAmount
	 */
	public void setChargeBackTotalAmount(String chargeBackTotalAmount) {
		ChargeBackTotalAmount = chargeBackTotalAmount;
	}
	/**
	 * 取得Remark 備註欄位
	 * @return Remark
	 */
	public String getRemark() {
		return Remark;
	}
	/**
	 * 設定Remark 備註欄位
	 * @param remark
	 */
	public void setRemark(String remark) {
		Remark = remark;
	}
	/**
	 * 取得PlatformID 特約合作平台商代號(由allPay提供)
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定PlatformID 特約合作平台商代號(由allPay提供)
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	@Override
	public String toString() {
		return "AioChargebackObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", TradeNo="
				+ TradeNo + ", ChargeBackTotalAmount=" + ChargeBackTotalAmount + ", Remark=" + Remark + ", PlatformID="
				+ PlatformID + "]";
	}
}
