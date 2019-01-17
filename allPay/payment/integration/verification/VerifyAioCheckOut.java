package allPay.payment.integration.verification;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import allPay.payment.integration.allPayOperator.PaymentVerifyBase;
import allPay.payment.integration.errorMsg.ErrorMessage;
import allPay.payment.integration.exception.AllPayException;

public class VerifyAioCheckOut extends PaymentVerifyBase {

	public VerifyAioCheckOut(){
		super();
	}
	
	public String getAPIUrl(String mode){
		Element ele = (Element)doc.getElementsByTagName("AioCheckOut").item(0);
		String url = "";
		NodeList nodeList = ele.getElementsByTagName("url");
		for(int i = 0; i < nodeList.getLength(); i++){
			ele = (Element)nodeList.item(i);
			if(ele.getAttribute("type").equalsIgnoreCase(mode)){
				url = ele.getTextContent();
				break;
			}
		}
		if(url == ""){
			throw new AllPayException(ErrorMessage.OperatingMode_ERROR);
		}
		return url;
	}
	
	public void verifyParams(Object obj){
		Class<?> cls = obj.getClass();
		Method method;
		String objValue;
		List<String> fieldNames = new ArrayList<String>();
		for(Field field : cls.getDeclaredFields()){
			fieldNames.add(field.getName());
		}
		Element ele = (Element)doc.getElementsByTagName("AioCheckOut").item(0);
		NodeList nodeList = ele.getElementsByTagName("param");
		for(int i = 0; i < nodeList.getLength(); i++){
			Element tmpEle = (Element)nodeList.item(i);
			if(fieldNames.contains(tmpEle.getAttribute("name"))){
				try {
					method = cls.getMethod("get"+tmpEle.getAttribute("name").substring(0, 1).toUpperCase()+tmpEle.getAttribute("name").substring(1), null);
					objValue = method.invoke(obj, null).toString();
				} catch (Exception e) {
					throw new AllPayException(ErrorMessage.OBJ_MISSING_FIELD);
				}
				
				valueCheck(tmpEle.getAttribute("type"), objValue, tmpEle);
			} else{
				continue;
			}
		}
	}
	
}
