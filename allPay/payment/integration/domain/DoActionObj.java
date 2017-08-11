package allPay.payment.integration.domain;

/**
 * 信用卡關帳/退刷/取消/放棄物件
 * @author mark.chiu
 *
 */
public class DoActionObj {
	
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
	 * Action
	 * 執行動作
	 */
	private String Action = "";
	
	/**
	 * TotalAmount
	 * 金額
	 */
	private String TotalAmount = "";
	
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
	 * 取得TradeNo O’Pay的交易編號
	 * @return TradeNo
	 */
	public String getTradeNo() {
		return TradeNo;
	}
	/**
	 * 設定TradeNo O’Pay的交易編號
	 * @param tradeNo
	 */
	public void setTradeNo(String tradeNo) {
		TradeNo = tradeNo;
	}
	/**
	 * 取得Action 執行動作，針對訂單做處理的動作，例如要對訂單做關帳時，請帶C。
	 * １.若要執行關帳時，參數請帶：C
	 * ２.若要執行退刷時，參數請帶：R
	 * ３.若要執行取消時，參數請帶：E
	 * ４.若要執行放棄時，參數請帶：N
	 * @return Action
	 */
	public String getAction() {
		return Action;
	}
	/**
	 * 設定Action 執行動作，針對訂單做處理的動作，例如要對訂單做關帳時，請帶C。
	 * １.若要執行關帳時，參數請帶：C
	 * ２.若要執行退刷時，參數請帶：R
	 * ３.若要執行取消時，參數請帶：E
	 * ４.若要執行放棄時，參數請帶：N
	 * @param action
	 */
	public void setAction(String action) {
		Action = action;
	}
	/**
	 * 取得TotalAmount 金額
	 * @return TotalAmount
	 */
	public String getTotalAmount() {
		return TotalAmount;
	}
	/**
	 * 設定TotalAmount 金額
	 * @param totalAmount
	 */
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
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
		return "DoActionObj [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", TradeNo=" + TradeNo
				+ ", Action=" + Action + ", TotalAmount=" + TotalAmount + ", PlatformID=" + PlatformID + "]";
	}
	
}
