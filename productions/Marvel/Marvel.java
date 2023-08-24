package model.productions.Marvel;

import model.productions.Cine;
import model.productions.Heroe;
import model.productions.Hombre;
import model.productions.Mujer;
import model.productions.Villano;

public class Marvel implements Cine{

	@Override
	public Heroe getHeroe() {
		return new IronMan();
	}

	@Override
	public Villano getVillano() {
		return new Wanda();
	}

	@Override
	public Hombre getHombre() {
		return new IronMan();
	}

	@Override
	public Mujer getMujer() {
		return new Wanda();
	}
}
