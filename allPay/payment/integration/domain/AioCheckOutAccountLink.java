package allPay.payment.integration.domain;

/**
 * 產生訂單物件(不指定付款方式，由歐付寶顯示)
 * @author mark.chiu
 *
 */
public class AioCheckOutAccountLink {
	
	/**
	 * MerchantID
	 * 會員編號(由O'Pay提供)，當此平台為特約合作平台欲建立訂單時，該欄位才有效。一般平台商請忽略此欄位
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * 會員交易編號，必須為唯一值，建議使用20碼UID
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * StoreID
	 * 會員商店代碼，提供會員填入店家代碼使用
	 */
	private String StoreID = "";
	
	/**
	 * MerchantTradeDate
	 * 會員交易時間，格式為yyyy/MM/dd HH:mm:ss
	 */
	private String MerchantTradeDate = "";
	
	/**
	 * PaymentType
	 * 交易類型
	 */
	private String PaymentType = "aio";
	
	/**
	 * TotalAmount
	 * 交易金額
	 */
	private String TotalAmount = "";
	
	/**
	 * TradeDesc
	 * 交易描述
	 */
	private String TradeDesc = "";
	
	/**
	 * ItemName
	 * 商品名稱
	 */
	private String ItemName = "";
	
	/**
	 * ReturnURL
	 * 付款完成通知回傳網址
	 */
	private String ReturnURL = "";
	
	/**
	 * ChoosePayment
	 * 選擇預設付款方式
	 */
	private String ChoosePayment = "AccountLink";
	
	/**
	 * ClientBackURL
	 * Client端返回會員系統的按鈕連結
	 */
	private String ClientBackURL = "";
	
	/**
	 * ItemURL
	 * 商品銷售網址
	 */
	private String ItemURL = "";
	
	/**
	 * Remark
	 * 備註欄位
	 */
	private String Remark = "";
	
	/**
	 * ChooseSubPayment
	 * 選擇預設付款子項目
	 */
	private String ChooseSubPayment = "";
	
	/**
	 * OrderResultURL
	 * Client端回傳付款結果網址
	 */
	private String OrderResultURL = "";
	
	/**
	 * NeedExtraPaidInfo
	 * 是否需要額外的付款資訊
	 */
	private String NeedExtraPaidInfo = "";
	
	/**
	 * DeviceSource
	 * 裝置來源，請帶空值，由allPay自動判定。
	 */
	private String DeviceSource = "";
	
	/**
	 * IgnorePayment
	 * 隱藏付款方式，設定檔自動帶入
	 */
	private String IgnorePayment = "";
	
	/**
	 * PlatformID
	 * 特約合作平台商代號(由allPay提供)，設定檔自動帶入
	 */
	private String PlatformID = "";
	
	/**
	 * InvoiceMark
	 * 電子發票開立註記，程式自動判斷
	 */
	private String InvoiceMark = "";
	
	/**
	 * HoldTradeAMT
	 * 是否延遲撥款
	 */
	private String HoldTradeAMT = "";
	
	/**
	 * EncryptType
	 * CheckMacValue加密類型
	 */
	private String EncryptType = "1";
	
	/**
	 * UseRedeem
	 * 是否可以使用購物金/紅包折抵
	 */
	private String UseRedeem = "";
	
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
	 * 取得MerchantTradeNo 會員交易編號，英數字大小寫混合，該交易編號不可重複，如有使用PlatformID，平台商底下所有商家之訂單編號亦不可重複。
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * 設定MerchantTradeNo 會員交易編號，英數字大小寫混合，該交易編號不可重複，如有使用PlatformID，平台商底下所有商家之訂單編號亦不可重複。
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * 取得MerchantTradeDate 會員交易時間，格式為yyyy/MM/dd HH:mm:ss
	 * @return MerchantTradeDate
	 */
	public String getMerchantTradeDate() {
		return MerchantTradeDate;
	}
	/**
	 * 設定MerchantTradeDate 會員交易時間，請以 yyyy/MM/dd HH:mm:ss格式帶入
	 * @param merchantTradeDate
	 */
	public void setMerchantTradeDate(String merchantTradeDate) {
		MerchantTradeDate = merchantTradeDate;
	}
	/**
	 * 取得PaymentType 交易類型
	 * @return PaymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}
	/**
	 * 設定PaymentType 交易類型
	 * @param paymentType
	 */
//	public void setPaymentType(String paymentType) {
//		PaymentType = paymentType;
//	}
	/**
	 * 取得TotalAmount 交易金額，須為正整數
	 * @return TotalAmount
	 */
	public String getTotalAmount() {
		return TotalAmount;
	}
	/**
	 * 設定TotalAmount 交易金額，須為正整數
	 * @param totalAmount
	 */
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}
	/**
	 * 取得TradeDesc 交易描述
	 * @return TradeDesc
	 */
	public String getTradeDesc() {
		return TradeDesc;
	}
	/**
	 * 設定TradeDesc 交易描述
	 * @param tradeDesc
	 */
	public void setTradeDesc(String tradeDesc) {
		TradeDesc = tradeDesc;
	}
	/**
	 * 取得ItemName 商品名稱，若有多筆，需在金流選擇頁 一行一行顯示商品名稱的話，商品名稱請以符號#分隔。
	 * @return ItemName
	 */
	public String getItemName() {
		return ItemName;
	}
	/**
	 * 設定ItemName 商品名稱，若有多筆，需在金流選擇頁 一行一行顯示商品名稱的話，商品名稱請以符號#分隔。
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	/**
	 * 取得ReturnURL 付款完成通知回傳網址，當消費者付款完成後，歐付寶會將付款 結果參數以幕後(Server POST)回傳到 該網址。
	 * @return ReturnURL
	 */
	public String getReturnURL() {
		return ReturnURL;
	}
	/**
	 * 設定ReturnURL 付款完成通知回傳網址，當消費者付款完成後，歐付寶會將付款 結果參數以幕後(Server POST)回傳到 該網址。
	 * @param returnURL
	 */
	public void setReturnURL(String returnURL) {
		ReturnURL = returnURL;
	}
	/**
	 * 取得ChoosePayment 選擇預設付款方式
	 * @return ChoosePayment
	 */
	public String getChoosePayment() {
		return ChoosePayment;
	}
	/**
	 * 設定ChoosePayment 選擇預設付款方式
	 * @param choosePayment
	 */
//	public void setChoosePayment(String choosePayment) {
//		ChoosePayment = choosePayment;
//	}
	/**
	 * 取得ClientBackURL Client端返回會員系統的按鈕連結。設定此參數，歐付寶會在付款完成 或取號完成頁面上顯示[返回商店] 的按鈕。
	 *消費者點選此按鈕後，會將頁面導回到此設定的網址。 
	 *注意事項：本參數僅控制將頁面導回，不會將付款結果資訊POST到設定值內的URL。發生簡訊 OTP 驗證失敗而此參數有值時，頁面上亦會顯示按鈕。
	 *若導回網址未使用 https 時，部份 瀏覽器可能會出現警告訊息。
	 * @return ClientBackURL
	 */
	public String getClientBackURL() {
		return ClientBackURL;
	}
	/**
	 * 設定ClientBackURL Client端返回會員系統的按鈕連結。設定此參數，歐付寶會在付款完成 或取號完成頁面上顯示[返回商店] 的按鈕。
	 *消費者點選此按鈕後，會將頁面導回到此設定的網址。 
	 *注意事項：本參數僅控制將頁面導回，不會將付款結果資訊POST到設定值內的URL。發生簡訊 OTP 驗證失敗而此參數有值時，頁面上亦會顯示按鈕。
	 *若導回網址未使用 https 時，部份 瀏覽器可能會出現警告訊息。
	 * @param clientBackURL
	 */
	public void setClientBackURL(String clientBackURL) {
		ClientBackURL = clientBackURL;
	}
	/**
	 * 取得ItemURL 商品銷售網址
	 * @return ItemURL
	 */
	public String getItemURL() {
		return ItemURL;
	}
	/**
	 * 設定 ItemURL 商品銷售網址
	 * @param itemURL
	 */
	public void setItemURL(String itemURL) {
		ItemURL = itemURL;
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
	 * 取得ChooseSubPayment 選擇預設付款子項目。若設定此參數，使用者則無法看見金流 選擇頁，且使用者必須要已登入歐付寶。
	 *  例如：付款方式[ChoosePayment]設定 WebATM，付款子項目 [ChooseSubPayment]設定 TAISHIN，
	 *  此次交易僅會以台新銀行的 網路 ATM 付款。請參考付款方式一覽表
	 * @return ChooseSubPayment
	 */
	public String getChooseSubPayment() {
		return ChooseSubPayment;
	}
	/**
	 * 設定ChooseSubPayment 選擇預設付款子項目。若設定此參數，使用者則無法看見金流 選擇頁，且使用者必須要已登入歐付寶。
	 *  例如：付款方式[ChoosePayment]設定 WebATM，付款子項目 [ChooseSubPayment]設定 TAISHIN，
	 *  此次交易僅會以台新銀行的 網路 ATM 付款。請參考付款方式一覽表
	 * @param chooseSubPayment
	 */
//	public void setChooseSubPayment(String chooseSubPayment) {
//		ChooseSubPayment = chooseSubPayment;
//	}
	/**
	 * 取得OrderResultURL Client端回傳付款結果網址。付款完成後，歐付寶將頁面導回到會 員網址，並將付款結果帶回 
	 * 注意事項：
	 * 1.	沒帶此參數則會顯示歐付寶的付 款完成頁。
	 * 2.	如果要將付款結果頁顯示在會員 系統內，請設定此參數。
	 * 3.	若設定此參數，將會使設定的 Client 端返回會員系統的按鈕連 結[ClientBackURL]失效。
	 * 4.	部分銀行 WebATM 在交易成功 後,會停留在銀行的頁面,並不會導 回給歐付寶,所以歐付寶也不會將 頁面導回到[OrderResultURL]的頁面
	 * 5.	財付通和非及時交易(ATM、CVS) 不支援此參數。
	 * 6.	建議在測試階段時先不要設定此 參數，可將畫面停留在歐付寶，看 見歐付寶所提供的錯誤訊息，便可 以有效除錯。
	 * 7.	若有設定此參數，請務必根據回傳 的交易狀態來判斷顯示付款成功 與否的頁面。
	 * 8.	若導回網址未使用 https 時，部份 瀏覽器可能會出現警告訊息。
	 * @return OrderResultURL
	 */
	public String getOrderResultURL() {
		return OrderResultURL;
	}
	/**
	 * 設定OrderResultURL Client端回傳付款結果網址。付款完成後，歐付寶將頁面導回到會 員網址，並將付款結果帶回 
	 * 注意事項：
	 * 1.	沒帶此參數則會顯示歐付寶的付 款完成頁。
	 * 2.	如果要將付款結果頁顯示在會員 系統內，請設定此參數。
	 * 3.	若設定此參數，將會使設定的 Client 端返回會員系統的按鈕連 結[ClientBackURL]失效。
	 * 4.	部分銀行 WebATM 在交易成功 後,會停留在銀行的頁面,並不會導 回給歐付寶,所以歐付寶也不會將 頁面導回到[OrderResultURL]的頁面
	 * 5.	財付通和非及時交易(ATM、CVS) 不支援此參數。
	 * 6.	建議在測試階段時先不要設定此 參數，可將畫面停留在歐付寶，看 見歐付寶所提供的錯誤訊息，便可 以有效除錯。
	 * 7.	若有設定此參數，請務必根據回傳 的交易狀態來判斷顯示付款成功 與否的頁面。
	 * 8.	若導回網址未使用 https 時，部份 瀏覽器可能會出現警告訊息。
	 * @param orderResultURL
	 */
	public void setOrderResultURL(String orderResultURL) {
		OrderResultURL = orderResultURL;
	}
	/**
	 * 取得NeedExtraPaidInfo 是否需要額外的付款資訊。回傳更詳細的付款資訊至ReturnURL參數指定的URL。預設為N。
	 * @return NeedExtraPaidInfo
	 */
	public String getNeedExtraPaidInfo() {
		return NeedExtraPaidInfo;
	}
	/**
	 * 設定NeedExtraPaidInfo 是否需要額外的付款資訊 。回傳更詳細的付款資訊至ReturnURL參數指定的URL。預設為N。
	 * @param needExtraPaidInfo
	 */
	public void setNeedExtraPaidInfo(String needExtraPaidInfo) {
		NeedExtraPaidInfo = needExtraPaidInfo;
	}
	/**
	 * 取得DeviceSource 裝置來源
	 * @return DeviceSource
	 */
	public String getDeviceSource() {
		return DeviceSource;
	}
	/**
	 * 設定DeviceSource 裝置來源
	 * @param deviceSource
	 */
//	public void setDeviceSource(String deviceSource) {
//		DeviceSource = deviceSource;
//	}
	/**
	 * 取得IgnorePayment 隱藏付款方式
	 * @return IgnorePayment
	 */
	public String getIgnorePayment() {
		return IgnorePayment;
	}
	/**
	 * 設定IgnorePayment 隱藏付款方式
	 * @param ignorePayment
	 */
	public void setIgnorePayment(String ignorePayment) {
		IgnorePayment = ignorePayment;
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
	/**
	 * 取得InvoiceMark 電子發票開立註記
	 * @return InvoiceMark
	 */
	public String getInvoiceMark() {
		return InvoiceMark;
	}
	/**
	 * 設定InvoiceMark 電子發票開立註記
	 * @param invoiceMark
	 */
	public void setInvoiceMark(String invoiceMark) {
		InvoiceMark = invoiceMark;
	}
	/**
	 * 取得HoldTradeAMT 是否延遲撥款
	 * 1. 若為不延遲撥款，請帶：0，買方付款完成後，歐付寶依合約約定之時間，撥款給會員 
	 * 2. 若為延遲撥款，請帶：1，買方付 款完成後，需再呼叫「會員申請撥 款退款」API，讓歐付寶撥款給會 員，或退款給買方。
	 * 注意事項： ※倘若會員一直不申請撥款，此筆訂單 款項會一直放在歐付寶，直到會員申請 撥款。
	 * 		       ※延遲撥款不適用「信用卡」、「財付通」 之付款方式。
	 * @return HoldTradeAMT
	 */
	public String getHoldTradeAMT() {
		return HoldTradeAMT;
	}
	/**
	 * 設定HoldTradeAMT 是否延遲撥款
	 * 1. 若為不延遲撥款，請帶：0，買方付款完成後，歐付寶依合約約定之時間，撥款給會員 
	 * 2. 若為延遲撥款，請帶：1，買方付 款完成後，需再呼叫「會員申請撥 款退款」API，讓歐付寶撥款給會 員，或退款給買方。
	 * 注意事項： ※倘若會員一直不申請撥款，此筆訂單 款項會一直放在歐付寶，直到會員申請 撥款。
	 * 		       ※延遲撥款不適用「信用卡」、「財付通」 之付款方式。
	 * @param holdTradeAMT
	 */
	public void setHoldTradeAMT(String holdTradeAMT) {
		HoldTradeAMT = holdTradeAMT;
	}
	/**
	 * 取得EncryptType CheckMacValue加密類型
	 * @return EncryptType
	 */
	public String getEncryptType() {
		return EncryptType;
	}
	/**
	 * 設定EncryptType CheckMacValue加密類型
	 * @param encryptType
	 */
//	public void setEncryptType(String encryptType) {
//		EncryptType = encryptType;
//	}
	/**
	 * 取得UseRedeem 是否可以使用購物金/紅包折抵。用來設定此筆交易是否可以使用購物 金/紅包折抵。 
	 * 1. 若為可使用時，請帶：Ｙ
	 * 2. 若為不可使用時，請帶：N
	 * 注意事項： 
	 * 1. 折抵方式可於「廠商後台／紅包折 抵設定」功能新增您的折抵條件， 若已開啟折抵設定，需再配合此參 數，來決定此筆交易是否可以使用 購物金/紅包折抵。 
	 * 2. 配合折抵購物金/紅包會員，歐付 寶將協助進行免費曝光，折抵之金 額，則由會員負擔。 
	 * 3. 若可使用購物金/紅包折抵時，需 注意接收付款結果通知時，請以交 易金額[TradeAmt]做訂單金額的檢查。
	 * @return UseRedeem
	 */
	public String getUseRedeem() {
		return UseRedeem;
	}
	/**
	 * 設定UseRedeem 是否可以使用購物金/紅包折抵。用來設定此筆交易是否可以使用購物 金/紅包折抵。 
	 * 1. 若為可使用時，請帶：Ｙ
	 * 2. 若為不可使用時，請帶：N
	 * 注意事項： 
	 * 1. 折抵方式可於「廠商後台／紅包折 抵設定」功能新增您的折抵條件， 若已開啟折抵設定，需再配合此參 數，來決定此筆交易是否可以使用 購物金/紅包折抵。 
	 * 2. 配合折抵購物金/紅包會員，歐付 寶將協助進行免費曝光，折抵之金 額，則由會員負擔。 
	 * 3. 若可使用購物金/紅包折抵時，需 注意接收付款結果通知時，請以交 易金額[TradeAmt]做訂單金額的檢查。
	 * @param useRedeem
	 */
	public void setUseRedeem(String useRedeem) {
		UseRedeem = useRedeem;
	}
	/**
	 * 取得StoreID 會員商店代碼，提供會員填入店家代碼使用
	 * @return StoreID
	 */
	public String getStoreID() {
		return StoreID;
	}
	/**
	 * 設定StoreID 會員商店代碼，提供會員填入店家代碼使用
	 * @param storeID
	 */
	public void setStoreID(String storeID) {
		StoreID = storeID;
	}
	@Override
	public String toString() {
		return "AioCheckOutAccountLink [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo
				+ ", StoreID=" + StoreID + ", MerchantTradeDate=" + MerchantTradeDate + ", PaymentType=" + PaymentType
				+ ", TotalAmount=" + TotalAmount + ", TradeDesc=" + TradeDesc + ", ItemName=" + ItemName
				+ ", ReturnURL=" + ReturnURL + ", ChoosePayment=" + ChoosePayment + ", ClientBackURL=" + ClientBackURL
				+ ", ItemURL=" + ItemURL + ", Remark=" + Remark + ", ChooseSubPayment=" + ChooseSubPayment
				+ ", OrderResultURL=" + OrderResultURL + ", NeedExtraPaidInfo=" + NeedExtraPaidInfo + ", DeviceSource="
				+ DeviceSource + ", IgnorePayment=" + IgnorePayment + ", PlatformID=" + PlatformID + ", InvoiceMark="
				+ InvoiceMark + ", HoldTradeAMT=" + HoldTradeAMT + ", EncryptType=" + EncryptType + ", UseRedeem="
				+ UseRedeem + "]";
	}
}
