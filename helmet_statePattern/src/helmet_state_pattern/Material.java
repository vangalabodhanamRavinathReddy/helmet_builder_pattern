package helmet_state_pattern;


public class Material implements State {
	 
	HelmetFactoryBuilder helmetFactory;
 
    public Material(HelmetFactoryBuilder helmetFactory) {
        this.helmetFactory = helmetFactory;
    }


	public void startProduction() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Currently Collecting material for production is running";
	}


	@Override
	public void startSales() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void collectingMaterial() {
		System.out.println("Collecting material for production");
		
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

