package model.productions.Marvel;

import model.productions.Heroe;
import model.productions.Hombre;

public class IronMan implements Heroe, Hombre{

	@Override
	public String golpeH() {
		return "Rayo piuw piuw";
	}

	@Override
	public String darFrase() {
		return "Yo soy Iron Man y ya me mori. "+ golpeH();
	}
}
