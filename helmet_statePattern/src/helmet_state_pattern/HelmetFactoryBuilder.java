package helmet_state_pattern;


public abstract class HelmetFactoryBuilder {
	Helmet helmet = new Helmet();
	public abstract HelmetFactoryBuilder startProduction();
	public abstract HelmetFactoryBuilder collectMaterial();
	public abstract HelmetFactoryBuilder model();
	public abstract HelmetFactoryBuilder manufacture();
	public abstract HelmetFactoryBuilder sales();

	public Helmet build() {
		System.out.println("Helmet manufacture successful!");
		return helmet;
	}
}