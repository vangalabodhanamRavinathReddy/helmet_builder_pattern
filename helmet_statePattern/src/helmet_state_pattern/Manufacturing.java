package helmet_state_pattern;

public class Manufacturing implements State {
	 
	HelmetFactoryBuilder helmetFactory;
 
    public Manufacturing(HelmetFactoryBuilder helmetFactory) {
        this.helmetFactory = helmetFactory;
    }


	public void startProduction() {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Manufacturing of the helmets has begun";
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
		System.out.println("Helmet Manufacturing");
		
	}


	@Override
	public void manufacturing() {
		// TODO Auto-generated method stub
		
	}
}



