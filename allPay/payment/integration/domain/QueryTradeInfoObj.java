package allPay.payment.integration.domain;

/**
 * 查詢訂單物件
 * @author mark.chiu
 *
 */
public class QueryTradeInfoObj {
	
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
	 * TimeStamp
	 * 驗證時間
	 */
	private String TimeStamp = "";
	
	/**
	 * PlatformID
	 * 特約合作平台商代號(由allPay提供)
	 */
	private String PlatformID = "";
	
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
	 * 取得TimeStamp 驗證時間
	 * @return TimeStamp
	 */
	public String getTimeStamp() {
		return TimeStamp;
	}
	/**
	 * 設定TimeStamp 驗證時間
	 * @param timeStamp
	 */
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
	/**
	 * 取得PlatformID 特約合作平台商代號(由O’Pay提供)
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * 設定PlatformID 特約合作平台商代號(由O’Pay提供)
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	@Override
	public String toString() {
		return "QueryTradeInfoObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", TimeStamp="
				+ TimeStamp + ", PlatformID=" + PlatformID + "]";
	}
}
