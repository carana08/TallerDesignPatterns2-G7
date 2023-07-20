public class DistribuirContext {

	private DistribuirStrategy strategy;

	/**
	 * 
	 * @param DistribuirStrategy
	 */
	public void setStrategy(DistribuirStrategy strategy) {
        this.strategy = strategy;
    }

    public void distribute() {
        strategy.distribuir();
    }
}