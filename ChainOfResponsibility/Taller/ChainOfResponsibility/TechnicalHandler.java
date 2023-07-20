package ChainOfResponsibility;

public class TechnicalHandler extends Handler {

	/**
	 * 
	 * @param request
	 */
	public boolean isHandle() {
		System.out.println("Technical support handler has handled the request.");
		//validations
		return false;
	}

	

}