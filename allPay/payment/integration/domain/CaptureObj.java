package allPay.payment.integration.domain;

/**
 * 會員申請撥款/退款物件
 * @author mark.chiu
 *
 */
public class CaptureObj {
	
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
	 * CaptureAMT
	 * 會員申請撥款金額
	 */
	private String CaptureAMT = "";
	
	/**
	 * UserRefundAMT
	 * 要退款給買方的金額
	 */
	private String UserRefundAMT = "";
	
	/**
	 * PlatformID
	 * 特約合作平台商代號(由allPay提供)
	 */
	private String PlatformID = "";
	
	/**
	 * UpdatePlatformChargeFee
	 * 是否更改特約合作平台商手續費
	 */
	private String UpdatePlatformChargeFee = "";
	
	/**
	 * PlatformChargeFee
	 * 特約合作平台商手續費
	 */
	private String PlatformChargeFee = "";
	
	/**
	 * Remark
	 * 備註
	 */
	private String Remark = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * 取得MerchantID 會員編號(由O'Pay提供)，當此平台為特約合作平台欲建立訂單時，該欄位才有效。一般平台商請忽略此欄位
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * 設定MerchantID 會員編號(由O'Pay提供)，當此平台為特約合作平台欲建立訂單時，該欄位才有效。一般平台商請忽略此欄位
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * 取得MerchantTradeNo 會員交易編號，訂單產生時傳送給O’Pay的會員交易編號。
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * 設定MerchantTradeNo 會員交易編號，訂單產生時傳送給O’Pay的會員交易編號。
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * 取得CaptureAMT 會員申請撥款金額
	 * @return CaptureAMT
	 */
	public String getCaptureAMT() {
		return CaptureAMT;
	}
	/**
	 * 設定CaptureAMT 會員申請撥款金額
	 * @param captureAMT
	 */
	public void setCaptureAMT(String captureAMT) {
		CaptureAMT = captureAMT;
	}
	/**
	 * 取得UserRefundAMT 要退款給買方的金額，若不需要處理退款給買方，請帶0，
	 * 「訂單交易金額」扣除「必要手續費」後，撥款給平台會員。
	 *  注意事項：
	 *   ※若需要處理全額或部份退款給買方時，請帶此參數。有效範圍為0～訂單交易金額。 
	 *   ※會員申請撥款金額[CaptureAMT] +要退款給買方的金額[UserRefundAMT] = 訂單交易金額。
	 * @return UserRefundAMT
	 */
	public String getUserRefundAMT() {
		return UserRefundAMT;
	}
	/**
	 * 設定UserRefundAMT 要退款給買方的金額，若不需要處理退款給買方，請帶0，
	 * 「訂單交易金額」扣除「必要手續費」後，撥款給平台會員。
	 *  注意事項：
	 *   ※若需要處理全額或部份退款給買方時，請帶此參數。有效範圍為0～訂單交易金額。 
	 *   ※會員申請撥款金額[CaptureAMT] +要退款給買方的金額[UserRefundAMT] = 訂單交易金額。
	 * @param userRefundAMT
	 */
	public void setUserRefundAMT(String userRefundAMT) {
		UserRefundAMT = userRefundAMT;
	}
	/**
	 * 取得PlatformID 特約合作平台商代號(由O'Pay提供)
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定PlatformID 特約合作平台商代號(由O'Pay提供)
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	/**
	 * 取得UpdatePlatformChargeFee 是否更改特約合作平台商手續費，預設為N。
	 * 若平台有需要更改「訂單產生」時的特約合作平台商手續費[PlatformChargeFee]時： 
	 * 若不更改時，參數請帶：N。 
	 * 若要更改時，參數請帶：Y。 
	 * 注意事項： ※此參數為專案合作的平台商使用，一般會員介接請放空值。
	 * @return UpdatePlatformChargeFee
	 */
	public String getUpdatePlatformChargeFee() {
		return UpdatePlatformChargeFee;
	}
	/**
	 * 設定UpdatePlatformChargeFee 是否更改特約合作平台商手續費，預設為N。
	 * 若平台有需要更改「訂單產生」時的特約合作平台商手續費[PlatformChargeFee]時： 
	 * 若不更改時，參數請帶：N。 
	 * 若要更改時，參數請帶：Y。 
	 * 注意事項： ※此參數為專案合作的平台商使用，一般會員介接請放空值。
	 * @param updatePlatformChargeFee
	 */
	public void setUpdatePlatformChargeFee(String updatePlatformChargeFee) {
		UpdatePlatformChargeFee = updatePlatformChargeFee;
	}
	/**
	 * 取得PlatformChargeFee 特約合作平台商手續費，若[UpdatePlatformChargeFee]設定為Y時，請帶此參數。
	 * 例如：若因為全額退款給買方，如果此筆訂單的「特約合作平台商手續費」不收的話，請帶0。
	 * 注意事項：
	 * ※有效範圍為0～訂單產生時的特約合作平台商手續費。
	 * ※此參數為專案合作的平台商使用，一般會員介接請放空值。
	 * @return PlatformChargeFee
	 */
	public String getPlatformChargeFee() {
		return PlatformChargeFee;
	}
	/**
	 * 設定PlatformChargeFee 特約合作平台商手續費，若[UpdatePlatformChargeFee]設定為Y時，請帶此參數。
	 * 例如：若因為全額退款給買方，如果此筆訂單的「特約合作平台商手續費」不收的話，請帶0。
	 * 注意事項：
	 * ※有效範圍為0～訂單產生時的特約合作平台商手續費。
	 * ※此參數為專案合作的平台商使用，一般會員介接請放空值。
	 * @param platformChargeFee
	 */
	public void setPlatformChargeFee(String platformChargeFee) {
		PlatformChargeFee = platformChargeFee;
	}
	/**
	 * 取得Remark 備註
	 * @return Remark
	 */
	public String getRemark() {
		return Remark;
	}
	/**
	 * 設定Remark 備註
	 * @param remark
	 */
	public void setRemark(String remark) {
		Remark = remark;
	}
	@Override
	public String toString() {
		return "CaptureObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", CaptureAMT="
				+ CaptureAMT + ", UserRefundAMT=" + UserRefundAMT + ", PlatformID=" + PlatformID
				+ ", UpdatePlatformChargeFee=" + UpdatePlatformChargeFee + ", PlatformChargeFee=" + PlatformChargeFee
				+ ", Remark=" + Remark + "]";
	}
}
