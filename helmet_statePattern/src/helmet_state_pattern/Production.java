package helmet_state_pattern;


public class Production implements State {
	 
	HelmetFactoryBuilder helmetFactory;
 
    public Production(HelmetFactoryBuilder helmetFactory) {
        this.helmetFactory = helmetFactory;
    }


	public void startProduction() {
		System.out.println("The helmet production started");
		return;
	}
	
	public String toString() {
		return "The helmet production is running";
	}


	@Override
	public void startSales() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void collectingMaterial() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void modelling() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void manufacturing() {
		// TODO Auto-generated method stub
		
	}
}
