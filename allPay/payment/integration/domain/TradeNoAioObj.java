package allPay.payment.integration.domain;

/**
 * 下載會員對帳媒體檔物件
 * @author mark.chiu
 *
 */
public class TradeNoAioObj {
	
	/**
	 * MerchantID
	 * 會員編號(由allPay提供)
	 */
	private String MerchantID = "";
	
	/**
	 * DateType
	 * 查詢日期類別
	 */
	private String DateType = "";
	
	/**
	 * BeginDate
	 * 查詢開始日期
	 */
	private String BeginDate = "";
	
	/**
	 * EndDate
	 * 查詢結束日期
	 */
	private String EndDate = "";
	
	/**
	 * PaymentType
	 * 付款方式
	 */
	private String PaymentType = "";
	
	/**
	 * PlatformStatus
	 * 訂單類型
	 */
	private String PlatformStatus = "";
	
	/**
	 * PaymentStatus
	 * 付款狀態
	 */
	private String PaymentStatus = "";
	
	/**
	 * AllocateStatus
	 * 撥款狀態
	 */
	private String AllocateStatus = "";
	
	/**
	 * MediaFormated
	 * CSV格式
	 */
	private String MediaFormated = "";
	
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
	 * 取得DateType 查詢日期類別，要查詢的日期類別
	 * 若為查詢付款日期時，則參數請帶２
	 * 若為查詢撥款日期時，則參數請帶４
	 * 若為查詢退款日期時，則參數請帶５
	 * 若為查詢訂單日期時，則參數請帶６
	 * @return DateType
	 */
	public String getDateType() {
		return DateType;
	}
	/**
	 * 設定DateType 查詢日期類別，要查詢的日期類別
	 * 若為查詢付款日期時，則參數請帶２
	 * 若為查詢撥款日期時，則參數請帶４
	 * 若為查詢退款日期時，則參數請帶５
	 * 若為查詢訂單日期時，則參數請帶６
	 * @param dateType
	 */
	public void setDateType(String dateType) {
		DateType = dateType;
	}
	/**
	 * 取得BeginDate 查詢開始日期，日期格式為「yyyy-MM-dd」
	 * @return BeginDate
	 */
	public String getBeginDate() {
		return BeginDate;
	}
	/**
	 * 設定BeginDate 查詢開始日期，日期格式為「yyyy-MM-dd」
	 * @param beginDate
	 */
	public void setBeginDate(String beginDate) {
		BeginDate = beginDate;
	}
	/**
	 * 取得EndDate 查詢結束日期，日期格式為「yyyy-MM-dd」
	 * @return EndDate
	 */
	public String getEndDate() {
		return EndDate;
	}
	/**
	 * 設定EndDate 查詢結束日期，日期格式為「yyyy-MM-dd」
	 * @param endDate
	 */
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	/**
	 * 取得PaymentType 付款方式，要查詢訂單的付款方式 
	 * 若為信用卡時，則參數請帶01 
	 * 若為網路ATM時，則參數請帶02 
	 * 若為ATM 櫃員機時，則參數請帶03 
	 * 若為超商代碼時，則參數請帶04 
	 * 若為財付通時，則參數請帶07 
	 * 若為信用卡(OTP)時，則參數請帶08 
	 * 若為歐付寶帳戶時，則參數請帶09 
	 * 若為全部時，請忽略此一參數
	 * @return PaymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}
	/**
	 * 設定PaymentType 付款方式，要查詢訂單的付款方式 
	 * 若為信用卡時，則參數請帶01 
	 * 若為網路ATM時，則參數請帶02 
	 * 若為ATM 櫃員機時，則參數請帶03 
	 * 若為超商代碼時，則參數請帶04 
	 * 若為財付通時，則參數請帶07 
	 * 若為信用卡(OTP)時，則參數請帶08 
	 * 若為歐付寶帳戶時，則參數請帶09 
	 * 若為全部時，請忽略此一參數
	 * @param paymentType
	 */
	public void setPaymentType(String paymentType) {
		PaymentType = paymentType;
	}
	/**
	 * 取得PlatformStatus 訂單類型，要查詢的訂單類型
	 * 若為一般時，則參數請帶1
	 * 若為平台時，則參數請帶2
	 * 若為全部時，請忽略此一參數
	 * @return PlatformStatus
	 */
	public String getPlatformStatus() {
		return PlatformStatus;
	}
	/**
	 * 設定PlatformStatus 訂單類型，要查詢的訂單類型
	 * 若為一般時，則參數請帶1
	 * 若為平台時，則參數請帶2
	 * 若為全部時，請忽略此一參數
	 * @param platformStatus
	 */
	public void setPlatformStatus(String platformStatus) {
		PlatformStatus = platformStatus;
	}
	/**
	 * 取得PaymentStatus 付款狀態，要查詢的訂單付款狀態 
	 * 若為未付款時，則參數請帶0 
	 * 若為已付款時，則參數請帶1
	 * 若為訂單失敗時，則參數請帶2 
	 * 若為全部時，請忽略此一參數
	 * @return PaymentStatus
	 */
	public String getPaymentStatus() {
		return PaymentStatus;
	}
	/**
	 * 設定PaymentStatus 付款狀態，要查詢的訂單付款狀態 
	 * 若為未付款時，則參數請帶0 
	 * 若為已付款時，則參數請帶1
	 * 若為訂單失敗時，則參數請帶2 
	 * 若為全部時，請忽略此一參數
	 * @param paymentStatus
	 */
	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}
	/**
	 * 取得AllocateStatus 撥款狀態，要查詢的訂單撥款狀態
	 * 若為未撥款時，則參數請帶0
	 * 若為已撥款時，則參數請帶1
	 * 若為全部時，請忽略此一參數
	 * @return AllocateStatus
	 */
	public String getAllocateStatus() {
		return AllocateStatus;
	}
	/**
	 * 設定AllocateStatus 撥款狀態，要查詢的訂單撥款狀態
	 * 若為未撥款時，則參數請帶0
	 * 若為已撥款時，則參數請帶1
	 * 若為全部時，請忽略此一參數
	 * @param allocateStatus
	 */
	public void setAllocateStatus(String allocateStatus) {
		AllocateStatus = allocateStatus;
	}
	/**
	 * 取得MediaFormated CSV格式，要下載的檔案格式 
	 * 若為舊版格式時，則參數請帶0 
	 * 若為新版格式時，則參數請帶1
	 * @return MediaFormated
	 */
	public String getMediaFormated() {
		return MediaFormated;
	}
	/**
	 * 設定MediaFormated CSV格式，要下載的檔案格式 
	 * 若為舊版格式時，則參數請帶0 
	 * 若為新版格式時，則參數請帶1
	 * @param mediaFormated
	 */
	public void setMediaFormated(String mediaFormated) {
		MediaFormated = mediaFormated;
	}
	@Override
	public String toString() {
		return "TradeNoAioObj [MerchantID=" + MerchantID + ", DateType=" + DateType + ", BeginDate=" + BeginDate
				+ ", EndDate=" + EndDate + ", PaymentType=" + PaymentType + ", PlatformStatus=" + PlatformStatus
				+ ", PaymentStatus=" + PaymentStatus + ", AllocateStatus=" + AllocateStatus + ", MediaFormated="
				+ MediaFormated + "]";
	}
}
