package model.productions.Marvel;

import model.productions.Mujer;
import model.productions.Villano;

public class Wanda implements Villano, Mujer{

	@Override
	public String darFrase() {
		return "Te voy a matar con el DarkHold. " + golpeM();
	}

	@Override
	public String golpeM() {
		return "Me meto en tu mente y cuchau";
	}
}
