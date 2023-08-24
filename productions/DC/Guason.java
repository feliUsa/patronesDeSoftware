package model.productions.DC;

import model.productions.Hombre;
import model.productions.Villano;

public class Guason implements Villano, Hombre{

	@Override
	public String darFrase() {
		return "JAJSJDAJSJAJAJJASJAJAJAJKAJKAKJAKJJKAKSAKJSJASJAJSJAJSJAKKJASKAJSKJASKJASJK :D. "+ golpeH();
	}

	@Override
	public String golpeH() {
		return "Cuchillo para matarte, estoy bien aletoso ";
	}
}
