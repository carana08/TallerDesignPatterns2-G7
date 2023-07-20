package ChainOfResponsibility;

public class Cliente {

	public Handler nextHandler;
	private Handler head;
    private Handler tail;

    public void addHandler(Handler handler) {
        if (head == null) {
            head = handler;
            tail = handler;
        } else {
            tail.setNextHandler(handler);
            tail = handler;
        }
    }
    public void handle() {
        head.handle();
    }
	public static void main(String args []) {
		Cliente c = new Cliente();
		c.addHandler(new CustomerHandler());
		c.addHandler(new TechnicalHandler());
		c.addHandler(new InventoryHandler());
		c.addHandler(new ManagerHandler());
		c.handle();
	}

}