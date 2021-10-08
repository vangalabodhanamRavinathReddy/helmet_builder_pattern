package helmet_state_pattern;


public class Modelling implements State {
	 
	HelmetFactoryBuilder helmetFactory;
 
    public Modelling(HelmetFactoryBuilder helmetFactory) {
        this.helmetFactory = helmetFactory;
    }


	public void startProduction() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Modelling of the helmets has begun";
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
		System.out.println("Helmet modelling");
		
	}


	@Override
	public void manufacturing() {
		// TODO Auto-generated method stub
		
	}
}


