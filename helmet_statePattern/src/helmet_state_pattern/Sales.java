package helmet_state_pattern;

public class Sales implements State {
	 
	HelmetFactoryBuilder helmetFactoryBuilder;
 
    public Sales(HelmetFactoryBuilder helmetFactoryBuilder) {
        this.helmetFactoryBuilder = helmetFactoryBuilder;
    }


	public void startProduction() {
		System.out.println("Production cant start now. Clear stock via sales first");
		
	}

	public void startSales() {
		System.out.println("Sales are ongoing");
		
	}

	
	public String toString() {
		return "Starting the mattress factory machine";
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
