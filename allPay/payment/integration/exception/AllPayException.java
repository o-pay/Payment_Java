package allPay.payment.integration.exception;

public class AllPayException extends Error{
	private static final long serialVersionUID = 1L;
	String NewExceptionMessage;
	public AllPayException(String s){
		this.NewExceptionMessage = s;
	}
	public String getNewExceptionMessage() {
		return NewExceptionMessage;
	}
	public void setNewExceptionMessage(String newExceptionMessage) {
		NewExceptionMessage = newExceptionMessage;
	}
	public void ShowExceptionMessage(){
		
		System.out.println("µo¥Í¿ù»~: " + getNewExceptionMessage());
	}
	
}
