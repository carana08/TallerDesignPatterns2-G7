package ChainOfResponsibility;

public abstract class Handler {
	private Handler nextHandler;
	/**
	 * 
	 * @param request
	 */
	
	
	public void handle() {
		boolean flag = isHandle();
		if(!flag&nextHandler!=null) {
			nextHandler.handle();
		}
	}

	
	 /* 
	 * @param request
	 */
	public void setNextHandler(Handler handler) {
		this.nextHandler=handler;
	}
	
	public abstract boolean isHandle();
}