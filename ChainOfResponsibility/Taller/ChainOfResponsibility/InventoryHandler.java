package ChainOfResponsibility;

public class InventoryHandler extends Handler {

	/**
	 * 
	 * @param request
	 */
	public boolean isHandle() {
		System.out.println("Inventory manager handler has handled the request.");
		//validations
		return false;
	}
	

}