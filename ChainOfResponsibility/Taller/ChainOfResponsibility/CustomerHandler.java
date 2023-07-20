package ChainOfResponsibility;

public class CustomerHandler extends Handler {

	/**
	 * 
	 * @param request
	 */
	public boolean isHandle() {
		System.out.println("Customer service handler has handled the request.");
		//validations
		return false;
	}

}