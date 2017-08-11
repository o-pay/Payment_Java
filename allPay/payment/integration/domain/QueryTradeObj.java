package allPay.payment.integration.domain;

/**
 * 查詢信用卡單筆明細記錄
 * @author mark.chiu
 *
 */
public class QueryTradeObj {
	
	/**
	 * MerchantID
	 * 會員編號(由allPay提供)
	 */
	private String MerchantID = "";
	
	/**
	 * CreditRefundId
	 * 信用卡授權單號
	 */
	private String CreditRefundId = "";
	
	/**
	 * CreditAmount
	 * 金額
	 */
	private String CreditAmount = "";
	
	/**
	 * CreditCheckCode
	 * 商家檢查碼在廠商後台->信用卡收單->信用卡授權資訊中可查到
	 */
	private String CreditCheckCode = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得MerchantID 會員編號(由O’Pay提供)
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 設定MerchantID 會員編號(由O’Pay提供)
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * 取得CreditRefundId 信用卡授權單號
	 * @return CreditRefundId
	 */
	public String getCreditRefundId() {
		return CreditRefundId;
	}
	/**
	 * 設定CreditRefundId 信用卡授權單號
	 * @param creditRefundId
	 */
	public void setCreditRefundId(String creditRefundId) {
		CreditRefundId = creditRefundId;
	}
	/**
	 * 取得CreditAmount 金額
	 * @return CreditAmount
	 */
	public String getCreditAmount() {
		return CreditAmount;
	}
	/**
	 * 設定CreditAmount 金額
	 * @param creditAmount
	 */
	public void setCreditAmount(String creditAmount) {
		CreditAmount = creditAmount;
	}
	/**
	 * 取得CreditCheckCode 商家檢查碼在廠商後台->信用卡收單->信用卡授權資訊中可查到
	 * @return CreditCheckCode
	 */
	public String getCreditCheckCode() {
		return CreditCheckCode;
	}
	/**
	 * 設定CreditCheckCode 商家檢查碼在廠商後台->信用卡收單->信用卡授權資訊中可查到
	 * @param creditCheckCode
	 */
	public void setCreditCheckCode(String creditCheckCode) {
		CreditCheckCode = creditCheckCode;
	}
	@Override
	public String toString() {
		return "QueryTradeObj [MerchantID=" + MerchantID + ", CreditRefundId=" + CreditRefundId + ", CreditAmount="
				+ CreditAmount + ", CreditCheckCode=" + CreditCheckCode + "]";
	}
}
