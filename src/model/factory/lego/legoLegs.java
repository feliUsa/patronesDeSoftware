package model.factory.lego;

import model.factory.Legs;
import model.factory.Part;

public class legoLegs implements Legs, Part{

	private String estilo, tipo;
	
	public legoLegs(){
	}
	
	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	public String getEstilo() {
		return estilo;
	}
	
	@Override
	public void setTipo(String tipo) {
		this.tipo = tipo;
		
	}
	@Override
	public String getTipo() {
		return tipo;
	}

    @Override
    public Part clone() {
        legoLegs clonedBody = new legoLegs();
        clonedBody.setEstilo(this.estilo);
        return clonedBody;
    }


}
