package helmet_state_pattern;

public interface State { 
	public void startProduction();
	public void collectingMaterial();
	public void modelling();
	public void manufacturing();
	public void startSales();
}
