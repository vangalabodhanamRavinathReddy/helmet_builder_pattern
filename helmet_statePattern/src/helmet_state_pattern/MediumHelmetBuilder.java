package helmet_state_pattern;


public class MediumHelmetBuilder extends HelmetFactoryBuilder {

	@Override
	public HelmetFactoryBuilder manufacture() {
		helmet.manufacture(new Manufacturing(null));
		return this;
	}
	@Override
	public HelmetFactoryBuilder collectMaterial() {
		helmet.collectMaterial(new Material(null));
		return this;
	}
	@Override
	public HelmetFactoryBuilder model() {
		helmet.model(new Modelling(null));
		return this;
	}
//	@Override
//	public HelmetFactoryBuilder startProduction() {
//		helmet.startProduction(new Production(null));
//		return this;
//	}
	@Override
	public HelmetFactoryBuilder sales() {
		helmet.sales(new Sales(null));
		return this;
	}
	@Override
	public HelmetFactoryBuilder startProduction() {
		// TODO Auto-generated method stub
		return null;
	}
}