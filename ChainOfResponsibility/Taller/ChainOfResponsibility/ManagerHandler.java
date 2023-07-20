package ChainOfResponsibility;

public class ManagerHandler extends Handler {

	/**
	 * 
	 * @param request
	 */
	public boolean isHandle() {
		System.out.println("Store manager handler has handled the request.");
		//validations
		return false;
	}

}