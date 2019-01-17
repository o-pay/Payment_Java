package allPay.payment.integration.domain;

/**
 * ���ͭq�檫��(�����w�I�ڤ覡�A�ѼڥI�_���)
 * @author mark.chiu
 *
 */
public class AioCheckOutALL {
	
	/**
	 * MerchantID
	 * �|���s��(��O'Pay����)�A�����x���S���X�@���x���إ߭q��ɡA�����~���ġC�@�륭�x�ӽЩ��������
	 */
	private String MerchantID = "";
	
	/**
	 * MerchantTradeNo
	 * �|������s���A�������ߤ@�ȡA��ĳ�ϥ�20�XUID
	 */
	private String MerchantTradeNo = "";
	
	/**
	 * StoreID
	 * �|���ө��N�X�A���ѷ|����J���a�N�X�ϥ�
	 */
	private String StoreID = "";
	
	/**
	 * MerchantTradeDate
	 * �|������ɶ��A�榡��yyyy/MM/dd HH:mm:ss
	 */
	private String MerchantTradeDate = "";
	
	/**
	 * PaymentType
	 * �������
	 */
	private String PaymentType = "aio";
	
	/**
	 * TotalAmount
	 * ������B
	 */
	private String TotalAmount = "";
	
	/**
	 * TradeDesc
	 * ����y�z
	 */
	private String TradeDesc = "";
	
	/**
	 * ItemName
	 * �ӫ~�W��
	 */
	private String ItemName = "";
	
	/**
	 * ReturnURL
	 * �I�ڧ����q���^�Ǻ��}
	 */
	private String ReturnURL = "";
	
	/**
	 * ChoosePayment
	 * ��ܹw�]�I�ڤ覡
	 */
	private String ChoosePayment = "ALL";
	
	/**
	 * ClientBackURL
	 * Client�ݪ�^�|���t�Ϊ����s�s��
	 */
	private String ClientBackURL = "";
	
	/**
	 * ItemURL
	 * �ӫ~�P����}
	 */
	private String ItemURL = "";
	
	/**
	 * Remark
	 * �Ƶ����
	 */
	private String Remark = "";
	
	/**
	 * ChooseSubPayment
	 * ��ܹw�]�I�ڤl����
	 */
	private String ChooseSubPayment = "";
	
	/**
	 * OrderResultURL
	 * Client�ݦ^�ǥI�ڵ��G���}
	 */
	private String OrderResultURL = "";
	
	/**
	 * NeedExtraPaidInfo
	 * �O�_�ݭn�B�~���I�ڸ�T
	 */
	private String NeedExtraPaidInfo = "";
	
	/**
	 * DeviceSource
	 * �˸m�ӷ��A�бa�ŭȡA��allPay�۰ʧP�w�C
	 */
	private String DeviceSource = "";
	
	/**
	 * IgnorePayment
	 * ���åI�ڤ覡�A�]�w�ɦ۰ʱa�J
	 */
	private String IgnorePayment = "";
	
	/**
	 * PlatformID
	 * �S���X�@���x�ӥN��(��allPay����)�A�]�w�ɦ۰ʱa�J
	 */
	private String PlatformID = "";
	
	/**
	 * HoldTradeAMT
	 * �O�_���𼷴�
	 */
	private String HoldTradeAMT = "";
	
	/**
	 * EncryptType
	 * CheckMacValue�[�K����
	 */
	private String EncryptType = "1";
	
	/**
	 * UseRedeem
	 * �O�_�i�H�ϥ��ʪ���/���]���
	 */
	private String UseRedeem = "";
	
	/**
	 * ExpireDate
	 * ���\ú�O���ĤѼơA�Y�ݳ]�w�̪� 60 �ѡA�̵u1�ѡC���]�w���Ѽƫh�w�]��3��
	 */
	private String ExpireDate = "";
	
	/**
	 * PaymentInfoURL
	 * Server�ݦ^�ǥI�ڬ�����T
	 */
	private String PaymentInfoURL = "";
	
	/**
	 * ClientRedirectURL
	 * Client�ݦ^�ǥI�ڬ�����T
	 */
	private String ClientRedirectURL = "";
	
	/**
	 * StoreExpireDate
	 * �W��ú�O�I��ɶ�
	 */
	private String StoreExpireDate = "";
	
	/**
	 * Desc_1
	 * ����y�z1
	 */
	private String Desc_1 = "";
	
	/**
	 * Desc_2
	 * ����y�z2
	 */
	private String Desc_2 = "";
	
	/**
	 * Desc_3
	 * ����y�z3
	 */
	private String Desc_3 = "";
	
	/**
	 * Desc_4
	 * ����y�z4
	 */
	private String Desc_4 = "";
	
	/**
	 * ExpireTime
	 * �I�ںI��ɶ��A�榡��yyyy/MM/dd HH:mm:ss�C�u��a�J�e�X����᪺72�p��(�T��)�����ɶ��C����h�w�]���e�X����᪺72�p�ɡC
	 */
	private String ExpireTime = "";
	
	/**
	 * Redeem
	 * �H�Υd�O�_�ϥά��Q���A�]��Y�ɡA��ڥI�_�|����ܫH�Υd�I�ڮɡA�|�i�J���Q��誺����y�{
	 */
	private String Redeem = "";
	
	/**
	 * CreditInstallment
	 * ��d�������ơA���Ѩ�d�������ơA���o�p��2
	 */
	private String CreditInstallment = "";
	
	/**
	 * InstallmentAmount
	 * �ϥΨ�d�������`�I�ڪ��B�A��d�������`�I�ڪ��B�C�Y�P������B��TotalAmount��ۦP�ɡA���ݶǤJ���ѼơC
	 */
//	private String InstallmentAmount = "";
	
	/**
	 * PeriodAmount
	 * �C�����v���B
	 */
	private String PeriodAmount = "";
	
	/**
	 * PeriodType
	 * �g������   D�G�H�Ѭ��g���AM�G�H�묰�g���AY�G�H�~���g��
	 */
	private String PeriodType = "";
	
	/**
	 * Frequency
	 * �����W�v�A���ѼƥΨөw�q�h�[�n����@��
	 */
	private String Frequency = "";
	
	/**
	 * ExecTimes
	 * ���榸��
	 */
	private String ExecTimes = "";
	
	/**
	 * PeriodReturnURL
	 * �w���w�B�����浲�G�^��URL
	 */
	private String PeriodReturnURL = "";
	
	/********************* getters and setters *********************/
	
	/**
	 * ���oMerchantID �|���s��(��O'Pay����)�A�����x���S���X�@���x���إ߭q��ɡA�����~���ġC�@�륭�x�ӽЩ��������
	 * @return MerchantID
	 */
	public String getMerchantID() {
		return MerchantID;
	}
	/**
	 * �]�wMerchantID �|���s��(��O'Pay����)�A�����x���S���X�@���x���إ߭q��ɡA�����~���ġC�@�륭�x�ӽЩ��������
	 * @param merchantID
	 */
	public void setMerchantID(String merchantID) {
		MerchantID = merchantID;
	}
	/**
	 * ���oMerchantTradeNo �|������s���A�^�Ʀr�j�p�g�V�X�A�ӥ���s�����i���ơA�p���ϥ�PlatformID�A���x�ө��U�Ҧ��Ӯa���q��s���礣�i���ơC
	 * @return MerchantTradeNo
	 */
	public String getMerchantTradeNo() {
		return MerchantTradeNo;
	}
	/**
	 * �]�wMerchantTradeNo �|������s���A�^�Ʀr�j�p�g�V�X�A�ӥ���s�����i���ơA�p���ϥ�PlatformID�A���x�ө��U�Ҧ��Ӯa���q��s���礣�i���ơC
	 * @param merchantTradeNo
	 */
	public void setMerchantTradeNo(String merchantTradeNo) {
		MerchantTradeNo = merchantTradeNo;
	}
	/**
	 * ���oMerchantTradeDate �|������ɶ��A�榡��yyyy/MM/dd HH:mm:ss
	 * @return MerchantTradeDate
	 */
	public String getMerchantTradeDate() {
		return MerchantTradeDate;
	}
	/**
	 * �]�wMerchantTradeDate �|������ɶ��A�ХH yyyy/MM/dd HH:mm:ss�榡�a�J
	 * @param merchantTradeDate
	 */
	public void setMerchantTradeDate(String merchantTradeDate) {
		MerchantTradeDate = merchantTradeDate;
	}
	/**
	 * ���oPaymentType �������
	 * @return PaymentType
	 */
	public String getPaymentType() {
		return PaymentType;
	}
	/**
	 * �]�wPaymentType �������
	 * @param paymentType
	 */
//	public void setPaymentType(String paymentType) {
//		PaymentType = paymentType;
//	}
	/**
	 * ���oTotalAmount ������B�A���������
	 * @return TotalAmount
	 */
	public String getTotalAmount() {
		return TotalAmount;
	}
	/**
	 * �]�wTotalAmount ������B�A���������
	 * @param totalAmount
	 */
	public void setTotalAmount(String totalAmount) {
		TotalAmount = totalAmount;
	}
	/**
	 * ���oTradeDesc ����y�z
	 * @return TradeDesc
	 */
	public String getTradeDesc() {
		return TradeDesc;
	}
	/**
	 * �]�wTradeDesc ����y�z
	 * @param tradeDesc
	 */
	public void setTradeDesc(String tradeDesc) {
		TradeDesc = tradeDesc;
	}
	/**
	 * ���oItemName �ӫ~�W�١A�Y���h���A�ݦb���y��ܭ� �@��@����ܰӫ~�W�٪��ܡA�ӫ~�W�ٽХH�Ÿ�#���j�C
	 * @return ItemName
	 */
	public String getItemName() {
		return ItemName;
	}
	/**
	 * �]�wItemName �ӫ~�W�١A�Y���h���A�ݦb���y��ܭ� �@��@����ܰӫ~�W�٪��ܡA�ӫ~�W�ٽХH�Ÿ�#���j�C
	 * @param itemName
	 */
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	/**
	 * ���oReturnURL �I�ڧ����q���^�Ǻ��}�A����O�̥I�ڧ�����A�ڥI�_�|�N�I�� ���G�ѼƥH����(Server POST)�^�Ǩ� �Ӻ��}�C
	 * @return ReturnURL
	 */
	public String getReturnURL() {
		return ReturnURL;
	}
	/**
	 * �]�wReturnURL �I�ڧ����q���^�Ǻ��}�A����O�̥I�ڧ�����A�ڥI�_�|�N�I�� ���G�ѼƥH����(Server POST)�^�Ǩ� �Ӻ��}�C
	 * @param returnURL
	 */
	public void setReturnURL(String returnURL) {
		ReturnURL = returnURL;
	}
	/**
	 * ���oChoosePayment ��ܹw�]�I�ڤ覡
	 * @return ChoosePayment
	 */
	public String getChoosePayment() {
		return ChoosePayment;
	}
	/**
	 * �]�wChoosePayment ��ܹw�]�I�ڤ覡
	 * @param choosePayment
	 */
//	public void setChoosePayment(String choosePayment) {
//		ChoosePayment = choosePayment;
//	}
	/**
	 * ���oClientBackURL Client�ݪ�^�|���t�Ϊ����s�s���C�]�w���ѼơA�ڥI�_�|�b�I�ڧ��� �Ψ������������W���[��^�ө�] �����s�C
	 *���O���I�惡���s��A�|�N�����ɦ^�즹�]�w�����}�C 
	 *�`�N�ƶ��G���Ѽƶȱ���N�����ɦ^�A���|�N�I�ڵ��G��TPOST��]�w�Ȥ���URL�C�o��²�T OTP ���ҥ��ѦӦ��ѼƦ��ȮɡA�����W��|��ܫ��s�C
	 *�Y�ɦ^���}���ϥ� https �ɡA���� �s�����i��|�X�{ĵ�i�T���C
	 * @return ClientBackURL
	 */
	public String getClientBackURL() {
		return ClientBackURL;
	}
	/**
	 * �]�wClientBackURL Client�ݪ�^�|���t�Ϊ����s�s���C�]�w���ѼơA�ڥI�_�|�b�I�ڧ��� �Ψ������������W���[��^�ө�] �����s�C
	 *���O���I�惡���s��A�|�N�����ɦ^�즹�]�w�����}�C 
	 *�`�N�ƶ��G���Ѽƶȱ���N�����ɦ^�A���|�N�I�ڵ��G��TPOST��]�w�Ȥ���URL�C�o��²�T OTP ���ҥ��ѦӦ��ѼƦ��ȮɡA�����W��|��ܫ��s�C
	 *�Y�ɦ^���}���ϥ� https �ɡA���� �s�����i��|�X�{ĵ�i�T���C
	 * @param clientBackURL
	 */
	public void setClientBackURL(String clientBackURL) {
		ClientBackURL = clientBackURL;
	}
	/**
	 * ���oItemURL �ӫ~�P����}
	 * @return ItemURL
	 */
	public String getItemURL() {
		return ItemURL;
	}
	/**
	 * �]�w ItemURL �ӫ~�P����}
	 * @param itemURL
	 */
	public void setItemURL(String itemURL) {
		ItemURL = itemURL;
	}
	/**
	 * ���oRemark �Ƶ����
	 * @return Remark
	 */
	public String getRemark() {
		return Remark;
	}
	/**
	 * �]�wRemark �Ƶ����
	 * @param remark
	 */
	public void setRemark(String remark) {
		Remark = remark;
	}
	/**
	 * ���oChooseSubPayment ��ܹw�]�I�ڤl���ءC�Y�]�w���ѼơA�ϥΪ̫h�L�k�ݨ����y ��ܭ��A�B�ϥΪ̥����n�w�n�J�ڥI�_�C
	 *  �Ҧp�G�I�ڤ覡[ChoosePayment]�]�w WebATM�A�I�ڤl���� [ChooseSubPayment]�]�w TAISHIN�A
	 *  ��������ȷ|�H�x�s�Ȧ檺 ���� ATM �I�ڡC�аѦҥI�ڤ覡�@����
	 * @return ChooseSubPayment
	 */
	public String getChooseSubPayment() {
		return ChooseSubPayment;
	}
	/**
	 * �]�wChooseSubPayment ��ܹw�]�I�ڤl���ءC�Y�]�w���ѼơA�ϥΪ̫h�L�k�ݨ����y ��ܭ��A�B�ϥΪ̥����n�w�n�J�ڥI�_�C
	 *  �Ҧp�G�I�ڤ覡[ChoosePayment]�]�w WebATM�A�I�ڤl���� [ChooseSubPayment]�]�w TAISHIN�A
	 *  ��������ȷ|�H�x�s�Ȧ檺 ���� ATM �I�ڡC�аѦҥI�ڤ覡�@����
	 * @param chooseSubPayment
	 */
	public void setChooseSubPayment(String chooseSubPayment) {
		ChooseSubPayment = chooseSubPayment;
	}
	/**
	 * ���oOrderResultURL Client�ݦ^�ǥI�ڵ��G���}�C�I�ڧ�����A�ڥI�_�N�����ɦ^��| �����}�A�ñN�I�ڵ��G�a�^ 
	 * �`�N�ƶ��G
	 * 1.	�S�a���Ѽƫh�|��ܼڥI�_���I �ڧ������C
	 * 2.	�p�G�n�N�I�ڵ��G����ܦb�|�� �t�Τ��A�г]�w���ѼơC
	 * 3.	�Y�]�w���ѼơA�N�|�ϳ]�w�� Client �ݪ�^�|���t�Ϊ����s�s ��[ClientBackURL]���ġC
	 * 4.	�����Ȧ� WebATM �b������\ ��,�|���d�b�Ȧ檺����,�ä��|�� �^���ڥI�_,�ҥH�ڥI�_�]���|�N �����ɦ^��[OrderResultURL]������
	 * 5.	�]�I�q�M�D�ήɥ��(ATM�BCVS) ���䴩���ѼơC
	 * 6.	��ĳ�b���ն��q�ɥ����n�]�w�� �ѼơA�i�N�e�����d�b�ڥI�_�A�� ���ڥI�_�Ҵ��Ѫ����~�T���A�K�i �H���İ����C
	 * 7.	�Y���]�w���ѼơA�аȥ��ھڦ^�� ��������A�ӧP�_��ܥI�ڦ��\ �P�_�������C
	 * 8.	�Y�ɦ^���}���ϥ� https �ɡA���� �s�����i��|�X�{ĵ�i�T���C
	 * @return OrderResultURL
	 */
	public String getOrderResultURL() {
		return OrderResultURL;
	}
	/**
	 * �]�wOrderResultURL Client�ݦ^�ǥI�ڵ��G���}�C�I�ڧ�����A�ڥI�_�N�����ɦ^��| �����}�A�ñN�I�ڵ��G�a�^ 
	 * �`�N�ƶ��G
	 * 1.	�S�a���Ѽƫh�|��ܼڥI�_���I �ڧ������C
	 * 2.	�p�G�n�N�I�ڵ��G����ܦb�|�� �t�Τ��A�г]�w���ѼơC
	 * 3.	�Y�]�w���ѼơA�N�|�ϳ]�w�� Client �ݪ�^�|���t�Ϊ����s�s ��[ClientBackURL]���ġC
	 * 4.	�����Ȧ� WebATM �b������\ ��,�|���d�b�Ȧ檺����,�ä��|�� �^���ڥI�_,�ҥH�ڥI�_�]���|�N �����ɦ^��[OrderResultURL]������
	 * 5.	�]�I�q�M�D�ήɥ��(ATM�BCVS) ���䴩���ѼơC
	 * 6.	��ĳ�b���ն��q�ɥ����n�]�w�� �ѼơA�i�N�e�����d�b�ڥI�_�A�� ���ڥI�_�Ҵ��Ѫ����~�T���A�K�i �H���İ����C
	 * 7.	�Y���]�w���ѼơA�аȥ��ھڦ^�� ��������A�ӧP�_��ܥI�ڦ��\ �P�_�������C
	 * 8.	�Y�ɦ^���}���ϥ� https �ɡA���� �s�����i��|�X�{ĵ�i�T���C
	 * @param orderResultURL
	 */
	public void setOrderResultURL(String orderResultURL) {
		OrderResultURL = orderResultURL;
	}
	/**
	 * ���oNeedExtraPaidInfo �O�_�ݭn�B�~���I�ڸ�T�C�^�ǧ�ԲӪ��I�ڸ�T��ReturnURL�Ѽƫ��w��URL�C�w�]��N�C
	 * @return NeedExtraPaidInfo
	 */
	public String getNeedExtraPaidInfo() {
		return NeedExtraPaidInfo;
	}
	/**
	 * �]�wNeedExtraPaidInfo �O�_�ݭn�B�~���I�ڸ�T �C�^�ǧ�ԲӪ��I�ڸ�T��ReturnURL�Ѽƫ��w��URL�C�w�]��N�C
	 * @param needExtraPaidInfo
	 */
	public void setNeedExtraPaidInfo(String needExtraPaidInfo) {
		NeedExtraPaidInfo = needExtraPaidInfo;
	}
	/**
	 * ���oDeviceSource �˸m�ӷ�
	 * @return DeviceSource
	 */
	public String getDeviceSource() {
		return DeviceSource;
	}
	/**
	 * �]�wDeviceSource �˸m�ӷ�
	 * @param deviceSource
	 */
//	public void setDeviceSource(String deviceSource) {
//		DeviceSource = deviceSource;
//	}
	/**
	 * ���oIgnorePayment ���åI�ڤ覡
	 * @return IgnorePayment
	 */
	public String getIgnorePayment() {
		return IgnorePayment;
	}
	/**
	 * �]�wIgnorePayment ���åI�ڤ覡
	 * @param ignorePayment
	 */
	public void setIgnorePayment(String ignorePayment) {
		IgnorePayment = ignorePayment;
	}
	/**
	 * ���oPlatformID �S���X�@���x�ӥN��(��O��Pay����)
	 * @return PlatformID
	 */
	public String getPlatformID() {
		return PlatformID;
	}
	/**
	 * �]�wPlatformID �S���X�@���x�ӥN��(��O��Pay����)
	 * @param platformID
	 */
	public void setPlatformID(String platformID) {
		PlatformID = platformID;
	}
	/**
	 * ���oHoldTradeAMT �O�_���𼷴�
	 * 1. �Y�������𼷴ڡA�бa�G0�A�R��I�ڧ�����A�ڥI�_�̦X�����w���ɶ��A���ڵ��|�� 
	 * 2. �Y�����𼷴ڡA�бa�G1�A�R��I �ڧ�����A�ݦA�I�s�u�|���ӽм� �ڰh�ڡvAPI�A���ڥI�_���ڵ��| ���A�ΰh�ڵ��R��C
	 * �`�N�ƶ��G ���խY�|���@�����ӽм��ڡA�����q�� �ڶ��|�@����b�ڥI�_�A����|���ӽ� ���ڡC
	 * 		       �����𼷴ڤ��A�Ρu�H�Υd�v�B�u�]�I�q�v ���I�ڤ覡�C
	 * @return HoldTradeAMT
	 */
	public String getHoldTradeAMT() {
		return HoldTradeAMT;
	}
	/**
	 * �]�wHoldTradeAMT �O�_���𼷴�
	 * 1. �Y�������𼷴ڡA�бa�G0�A�R��I�ڧ�����A�ڥI�_�̦X�����w���ɶ��A���ڵ��|�� 
	 * 2. �Y�����𼷴ڡA�бa�G1�A�R��I �ڧ�����A�ݦA�I�s�u�|���ӽм� �ڰh�ڡvAPI�A���ڥI�_���ڵ��| ���A�ΰh�ڵ��R��C
	 * �`�N�ƶ��G ���խY�|���@�����ӽм��ڡA�����q�� �ڶ��|�@����b�ڥI�_�A����|���ӽ� ���ڡC
	 * 		       �����𼷴ڤ��A�Ρu�H�Υd�v�B�u�]�I�q�v ���I�ڤ覡�C
	 * @param holdTradeAMT
	 */
	public void setHoldTradeAMT(String holdTradeAMT) {
		HoldTradeAMT = holdTradeAMT;
	}
	/**
	 * ���oEncryptType CheckMacValue�[�K����
	 * @return EncryptType
	 */
	public String getEncryptType() {
		return EncryptType;
	}
	/**
	 * �]�wEncryptType CheckMacValue�[�K����
	 * @param encryptType
	 */
//	public void setEncryptType(String encryptType) {
//		EncryptType = encryptType;
//	}
	/**
	 * ���oUseRedeem �O�_�i�H�ϥ��ʪ���/���]���C�Ψӳ]�w��������O�_�i�H�ϥ��ʪ� ��/���]���C 
	 * 1. �Y���i�ϥήɡA�бa�G��
	 * 2. �Y�����i�ϥήɡA�бa�GN
	 * �`�N�ƶ��G 
	 * 1. ���覡�i��u�t�ӫ�x�����]�� ��]�w�v�\��s�W�z��������A �Y�w�}�ҧ��]�w�A�ݦA�t�X���� �ơA�ӨM�w��������O�_�i�H�ϥ� �ʪ���/���]���C 
	 * 2. �t�X����ʪ���/���]�|���A�ڥI �_�N��U�i��K�O�n���A��褧�� �B�A�h�ѷ|���t��C 
	 * 3. �Y�i�ϥ��ʪ���/���]���ɡA�� �`�N�����I�ڵ��G�q���ɡA�ХH�� �����B[TradeAmt]���q����B���ˬd�C
	 * @return UseRedeem
	 */
	public String getUseRedeem() {
		return UseRedeem;
	}
	/**
	 * �]�wUseRedeem �O�_�i�H�ϥ��ʪ���/���]���C�Ψӳ]�w��������O�_�i�H�ϥ��ʪ� ��/���]���C 
	 * 1. �Y���i�ϥήɡA�бa�G��
	 * 2. �Y�����i�ϥήɡA�бa�GN
	 * �`�N�ƶ��G 
	 * 1. ���覡�i��u�t�ӫ�x�����]�� ��]�w�v�\��s�W�z��������A �Y�w�}�ҧ��]�w�A�ݦA�t�X���� �ơA�ӨM�w��������O�_�i�H�ϥ� �ʪ���/���]���C 
	 * 2. �t�X����ʪ���/���]�|���A�ڥI �_�N��U�i��K�O�n���A��褧�� �B�A�h�ѷ|���t��C 
	 * 3. �Y�i�ϥ��ʪ���/���]���ɡA�� �`�N�����I�ڵ��G�q���ɡA�ХH�� �����B[TradeAmt]���q����B���ˬd�C
	 * @param useRedeem
	 */
	public void setUseRedeem(String useRedeem) {
		UseRedeem = useRedeem;
	}
	/**
	 * ���oExpireDate ���\ú�O���ĤѼơA�Y�ݳ]�w�̪� 60 �ѡA�̵u1�ѡC���]�w���Ѽƫh�w�]��3��
	 * �`�N�ƶ��G �H�Ѭ����
	 * @return ExpireDate
	 */
	public String getExpireDate() {
		return ExpireDate;
	}
	/**
	 * �]�wExpireDate ���\ú�O���ĤѼơA�Y�ݳ]�w�̪� 60 �ѡA�̵u1�ѡC���]�w���Ѽƫh�w�]��3��
	 * �`�N�ƶ��G �H�Ѭ����
	 * @param expireDate
	 */
	public void setExpireDate(String expireDate) {
		ExpireDate = expireDate;
	}
	/**
	 * ���oPaymentInfoURL Server�ݦ^�ǥI�ڬ�����T�C�Y���]�w���ѼơA�q��إߧ�����(�D�I�ڧ���)
	 * �A�ڥI�_�|Server�ݭI���^�Ǯ��O�̥I�ڤ覡������T(�ҡG�Ȧ�N�X�Bú�O�����b��ú�O�����K��)�C
	 * �`�N�ƶ��G�����N�|���d�b�ڥI�_�A���ú�O��������T�C
	 * @return PaymentInfoURL
	 */
	public String getPaymentInfoURL() {
		return PaymentInfoURL;
	}
	/**
	 * �]�wPaymentInfoURL Server�ݦ^�ǥI�ڬ�����T�C�Y���]�w���ѼơA�q��إߧ�����(�D�I�ڧ���)
	 * �A�ڥI�_�|Server�ݭI���^�Ǯ��O�̥I�ڤ覡������T(�ҡG�Ȧ�N�X�Bú�O�����b��ú�O�����K��)�C
	 * �`�N�ƶ��G�����N�|���d�b�ڥI�_�A���ú�O��������T�C
	 * @param paymentInfoURL
	 */
	public void setPaymentInfoURL(String paymentInfoURL) {
		PaymentInfoURL = paymentInfoURL;
	}
	/**
	 * ���oClientRedirectURL Client�ݦ^�ǥI�ڬ�����T�C�Y���]�w���ѼơA�q��إߧ�����(�D�I�ڧ���)
	 * �A�ڥI�_�|Client�ݦ^�Ǯ��O�̥I�ڤ覡������T(�ҡG�Ȧ�N�X�Bú�O�����b��ú�O�����K��)�B�N�������|���t�Ϋ��w�������A
	 * ���ú�O��������T�C
	 * �`�N�ƶ��G 
	 * 1. �Y�]�w���ѼơA�N�|�ϳ]�w����^�|���t�Ϊ����s�s��[ClientBackURL]���ġC 
	 * 2. �Y�ɦ^���}���ϥ�https�ɡA�����s�����i��|�X�{ĵ�i�T���C
	 * @return ClientRedirectURL
	 */
	public String getClientRedirectURL() {
		return ClientRedirectURL;
	}
	/**
	 * �]�wClientRedirectURL Client�ݦ^�ǥI�ڬ�����T�C�Y���]�w���ѼơA�q��إߧ�����(�D�I�ڧ���)
	 * �A�ڥI�_�|Client�ݦ^�Ǯ��O�̥I�ڤ覡������T(�ҡG�Ȧ�N�X�Bú�O�����b��ú�O�����K��)�B�N�������|���t�Ϋ��w�������A
	 * ���ú�O��������T�C
	 * �`�N�ƶ��G 
	 * 1. �Y�]�w���ѼơA�N�|�ϳ]�w����^�|���t�Ϊ����s�s��[ClientBackURL]���ġC 
	 * 2. �Y�ɦ^���}���ϥ�https�ɡA�����s�����i��|�X�{ĵ�i�T���C
	 * @param clientRedirectURL
	 */
	public void setClientRedirectURL(String clientRedirectURL) {
		ClientRedirectURL = clientRedirectURL;
	}
	/**
	 * ���oStoreExpireDate �W��ú�O�I��ɶ��A�H�Ѭ����A�w�]��7��
	 * �ҡG08/01��20:15���ʶR�ӫ~�Aú�O������7�ѡA���8/08��20:15���e�z�����e��ú�O�C
	 * @return StoreExpireDate
	 */
	public String getStoreExpireDate() {
		return StoreExpireDate;
	}
	/**
	 * �]�wStoreExpireDate �W��ú�O�I��ɶ��A�H�Ѭ����A�w�]��7��
	 * �ҡG08/01��20:15���ʶR�ӫ~�Aú�O������7�ѡA���8/08��20:15���e�z�����e��ú�O�C
	 * @param storeExpireDate
	 */
	public void setStoreExpireDate(String storeExpireDate) {
		StoreExpireDate = storeExpireDate;
	}
	/**
	 * ���oDesc_1 ����y�z1�A�|�X�{�b�W��ú�O���x�ù��W
	 * @return Desc_1
	 */
	public String getDesc_1() {
		return Desc_1;
	}
	/**
	 * �]�wDesc_1 ����y�z1�A�|�X�{�b�W��ú�O���x�ù��W
	 * @param desc_1
	 */
	public void setDesc_1(String desc_1) {
		Desc_1 = desc_1;
	}
	/**
	 * ���oDesc_2 ����y�z2�A�|�X�{�b�W��ú�O���x�ù��W
	 * @return Desc_2
	 */
	public String getDesc_2() {
		return Desc_2;
	}
	/**
	 * �]�wDesc_2 ����y�z2�A�|�X�{�b�W��ú�O���x�ù��W
	 * @param desc_2
	 */
	public void setDesc_2(String desc_2) {
		Desc_2 = desc_2;
	}
	/**
	 * ���oDesc_3 ����y�z3�A�|�X�{�b�W��ú�O���x�ù��W
	 * @return Desc_3
	 */
	public String getDesc_3() {
		return Desc_3;
	}
	/**
	 * �]�wDesc_3 ����y�z3�A�|�X�{�b�W��ú�O���x�ù��W
	 * @param desc_3
	 */
	public void setDesc_3(String desc_3) {
		Desc_3 = desc_3;
	}
	/**
	 * ���oDesc_4 ����y�z4�A�|�X�{�b�W��ú�O���x�ù��W
	 * @return Desc_4
	 */
	public String getDesc_4() {
		return Desc_4;
	}
	/**
	 * �]�wDesc_4 ����y�z4�A�|�X�{�b�W��ú�O���x�ù��W
	 * @param desc_4
	 */
	public void setDesc_4(String desc_4) {
		Desc_4 = desc_4;
	}
	/**
	 * ���oExpireTime �I�ںI��ɶ��A�榡��yyyy/MM/dd HH:mm:ss�C�u��a�J�e�X����᪺72�p��(�T��)�����ɶ��C����h�w�]���e�X����᪺72�p�ɡC
	 * @return ExpireTime
	 */
	public String getExpireTime() {
		return ExpireTime;
	}
	/**
	 * �]�wExpireTime �I�ںI��ɶ��A�榡��yyyy/MM/dd HH:mm:ss�C�u��a�J�e�X����᪺72�p��(�T��)�����ɶ��C����h�w�]���e�X����᪺72�p�ɡC
	 * @param expireTime
	 */
	public void setExpireTime(String expireTime) {
		ExpireTime = expireTime;
	}
	/**
	 * ���oRedeem �H�Υd�O�_�ϥά��Q���A�]��Y�ɡA��ڥI�_�|����ܫH�Υd�I�ڮɡA�|�i�J���Q��誺����y�{
	 * @return Redeem
	 */
	public String getRedeem() {
		return Redeem;
	}
	/**
	 * �]�wRedeem �H�Υd�O�_�ϥά��Q���A�]��Y�ɡA��ڥI�_�|����ܫH�Υd�I�ڮɡA�|�i�J���Q��誺����y�{
	 * @param redeem
	 */
	public void setRedeem(String redeem) {
		Redeem = redeem;
	}
	/**
	 * ���oCreditInstallment ��d�������ơA���Ѩ�d�������ơA���o�p��2
	 * @return CreditInstallment
	 */
	public String getCreditInstallment() {
		return CreditInstallment;
	}
	/**
	 * �]�wCreditInstallment ��d�������ơA���Ѩ�d�������ơA���o�p��2
	 * @param creditInstallment
	 */
	public void setCreditInstallment(String creditInstallment) {
		CreditInstallment = creditInstallment;
	}
	/**
	 * ���oInstallmentAmount �ϥΨ�d�������`�I�ڪ��B�A��d�������`�I�ڪ��B�C�Y�P������B��TotalAmount��ۦP�ɡA���ݶǤJ���ѼơC
	 * @return InstallmentAmount
	 */
//	public String getInstallmentAmount() {
//		return InstallmentAmount;
//	}
	/**
	 * �]�wInstallmentAmount �ϥΨ�d�������`�I�ڪ��B�A��d�������`�I�ڪ��B�C�Y�P������B��TotalAmount��ۦP�ɡA���ݶǤJ���ѼơC
	 * @param installmentAmount
	 */
//	public void setInstallmentAmount(String installmentAmount) {
//		InstallmentAmount = installmentAmount;
//	}
	/**
	 * ���oPeriodAmount �C�����v���B
	 * �`�N�ƶ��G �ڥI�_�|�̦������v���B[PeriodAmount]�ҳ]�w�����B��������T�w���v�����B�C 
	 * ������B[TotalAmount]�]�w���B�����M���v���B[PeriodAmount]�ۦP�C
	 * �бa��ơA���i���p���I�C�ȭ��s�x���C
	 * @return PeriodAmount
	 */
	public String getPeriodAmount() {
		return PeriodAmount;
	}
	/**
	 * �]�wPeriodAmount �C�����v���B
	 * �`�N�ƶ��G �ڥI�_�|�̦������v���B[PeriodAmount]�ҳ]�w�����B��������T�w���v�����B�C 
	 * ������B[TotalAmount]�]�w���B�����M���v���B[PeriodAmount]�ۦP�C
	 * �бa��ơA���i���p���I�C�ȭ��s�x���C
	 * @param periodAmount
	 */
	public void setPeriodAmount(String periodAmount) {
		PeriodAmount = periodAmount;
	}
	/**
	 * ���oPeriodType �g������   D�G�H�Ѭ��g���AM�G�H�묰�g���AY�G�H�~���g��
	 * @return PeriodType
	 */
	public String getPeriodType() {
		return PeriodType;
	}
	/**
	 * �]�wPeriodType �g������   D�G�H�Ѭ��g���AM�G�H�묰�g���AY�G�H�~���g��
	 * @param periodType
	 */
	public void setPeriodType(String periodType) {
		PeriodType = periodType;
	}
	/**
	 * ���oFrequency �����W�v�A���ѼƥΨөw�q�h�[�n����@��
	 * �`�N�ƶ��G 
	 * 1. �ܤ֭n�j�󵥩�1���H�W�C 
	 * 2. ��PeriodType�]��D�ɡA�̦h�i�]365���C 
	 * 3. ��PeriodType�]��M�ɡA�̦h�i�]12���C 
	 * 4. ��PeriodType�]��Y�ɡA�̦h�i�]1���C
	 * @return Frequency
	 */
	public String getFrequency() {
		return Frequency;
	}
	/**
	 * �]�wFrequency �����W�v�A���ѼƥΨөw�q�h�[�n����@��
	 * �`�N�ƶ��G 
	 * 1. �ܤ֭n�j�󵥩�1���H�W�C 
	 * 2. ��PeriodType�]��D�ɡA�̦h�i�]365���C 
	 * 3. ��PeriodType�]��M�ɡA�̦h�i�]12���C 
	 * 4. ��PeriodType�]��Y�ɡA�̦h�i�]1���C
	 * @param frequency
	 */
	public void setFrequency(String frequency) {
		Frequency = frequency;
	}
	/**
	 * ���oExecTimes ���榸�ơA�`�@�n����X���C
	 * @return ExecTimes
	 */
	public String getExecTimes() {
		return ExecTimes;
	}
	/**
	 * �]�wExecTimes ���榸�ơA�`�@�n����X���C
	 * @param execTimes
	 */
	public void setExecTimes(String execTimes) {
		ExecTimes = execTimes;
	}
	/**
	 * ���oPeriodReturnURL �w���w�B�����浲�G�^��URL�A�Y����O�H�Υd�w���w�B���覡�A�h�C��������v���A�|�N���v���G�^�Ǩ�o�ӳ]�w��URL�C
	 * @return PeriodReturnURL
	 */
	public String getPeriodReturnURL() {
		return PeriodReturnURL;
	}
	/**
	 * �]�wPeriodReturnURL �w���w�B�����浲�G�^��URL�A�Y����O�H�Υd�w���w�B���覡�A�h�C��������v���A�|�N���v���G�^�Ǩ�o�ӳ]�w��URL�C
	 * @param periodReturnURL
	 */
	public void setPeriodReturnURL(String periodReturnURL) {
		PeriodReturnURL = periodReturnURL;
	}
	/**
	 * ���oStoreID �|���ө��N�X�A���ѷ|����J���a�N�X�ϥ�
	 * @return StoreID
	 */
	public String getStoreID() {
		return StoreID;
	}
	/**
	 * �]�wStoreID �|���ө��N�X�A���ѷ|����J���a�N�X�ϥ�
	 * @param storeID
	 */
	public void setStoreID(String storeID) {
		StoreID = storeID;
	}
	@Override
	public String toString() {
		return "AioCheckOutALL [MerchantID=" + MerchantID + ", MerchantTradeNo=" + MerchantTradeNo + ", StoreID="
				+ StoreID + ", MerchantTradeDate=" + MerchantTradeDate + ", PaymentType=" + PaymentType
				+ ", TotalAmount=" + TotalAmount + ", TradeDesc=" + TradeDesc + ", ItemName=" + ItemName
				+ ", ReturnURL=" + ReturnURL + ", ChoosePayment=" + ChoosePayment + ", ClientBackURL=" + ClientBackURL
				+ ", ItemURL=" + ItemURL + ", Remark=" + Remark + ", ChooseSubPayment=" + ChooseSubPayment
				+ ", OrderResultURL=" + OrderResultURL + ", NeedExtraPaidInfo=" + NeedExtraPaidInfo + ", DeviceSource="
				+ DeviceSource + ", IgnorePayment=" + IgnorePayment + ", PlatformID=" + PlatformID + ", HoldTradeAMT=" + HoldTradeAMT + ", EncryptType=" + EncryptType + ", UseRedeem="
				+ UseRedeem + ", ExpireDate=" + ExpireDate + ", PaymentInfoURL=" + PaymentInfoURL
				+ ", ClientRedirectURL=" + ClientRedirectURL + ", StoreExpireDate=" + StoreExpireDate + ", Desc_1="
				+ Desc_1 + ", Desc_2=" + Desc_2 + ", Desc_3=" + Desc_3 + ", Desc_4=" + Desc_4 + ", ExpireTime="
				+ ExpireTime + ", Redeem=" + Redeem + ", CreditInstallment=" + CreditInstallment + ", PeriodAmount="
				+ PeriodAmount + ", PeriodType=" + PeriodType + ", Frequency=" + Frequency + ", ExecTimes=" + ExecTimes
				+ ", PeriodReturnURL=" + PeriodReturnURL + "]";
	}
}
