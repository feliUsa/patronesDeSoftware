package model.productions.DC;

import model.productions.Heroe;
import model.productions.Mujer;

public class MujerMaravilla implements Heroe, Mujer{

	@Override
	public String golpeM() {
		return "Lazo de la verdad para que no me mientas :c";
	}

	@Override
	public String darFrase() {
		return "Estoy dispuesta a luchar por aquellos que no pueden luchar por si mismos. "+ golpeM();
	}
}
