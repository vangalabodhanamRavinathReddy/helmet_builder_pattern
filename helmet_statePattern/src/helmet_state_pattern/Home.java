package helmet_state_pattern;


public class Home {

	public static void main(String[] args) {
		HelmetFactoryBuilder mediumHelmetBuilder = new MediumHelmetBuilder();
		HelmetFactoryBuilder mediumHelmet = mediumHelmetBuilder.collectMaterial().model().manufacture().sales();
		System.out.println("Helmet was manufactured"); 
		System.out.println(mediumHelmet); 

	}
}