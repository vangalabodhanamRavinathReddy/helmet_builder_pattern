package helmet_state_pattern;


import java.util.*;

public class Helmet {
	
	State production;
	State sales;
	State material;
	State model;
	State manufacture;
	
	State state;
	
//	public Helmet() {
//		this.walls = new ArrayList<Wall>();
//		this.windows = new ArrayList<Window>();
//	}
	
	
//	Helmet startProduction(Production production) {
//		this.production = production;
//		return this;
//	}
//	Helmet startProduction() {
//		state.startProduction();
//		return null;
//	}
	Helmet collectMaterial(Material material) {
		this.material = material;
		return this;
	}
	Helmet model(Modelling model) {
		this.model = model;
		return this;
	}
	Helmet manufacture(Manufacturing manufacture) {
		this.manufacture = manufacture;
		return this;
	}
	Helmet sales(Sales sales) {
		this.sales = sales;
		return this;
	}

//	public String toString() {
//		// Use a StringBuilder to build the string :-)
//		// Like StringBuffer, but not synchronized
//		StringBuilder display = new StringBuilder();
//		display.append("---- " + this.name + " ----\n");
//		for (Wall wall : walls) {
//			display.append("--- " + wall.name + " ---\n");
//		}
//		for (Window window : windows) {
//			display.append("--- " + window.name + " ---\n");
//		}
//		display.append("--- " + roof.name + " ---\n");
//		return display.toString();
//		
//		// There is some difference of opinion about StringBuilder and whether it's using
//		// the Builder pattern or not. Some say yes, some say no.
//		// StringBuilder does not provide an abstract API with multiple subclasses for
//		//   creating different representations (variations).
//	}
}
