package model.productions.DC;

import model.productions.Cine;
import model.productions.Heroe;
import model.productions.Hombre;
import model.productions.Mujer;
import model.productions.Villano;

public class DC implements Cine{


	public Heroe getHeroe() {
		return new MujerMaravilla();
	}


	public Villano getVillano() {
		return new Guason();
	}


	public Hombre getHombre() {
		return new Guason();
	}

	
	public Mujer getMujer() {
		return new MujerMaravilla();
	}
	
}
