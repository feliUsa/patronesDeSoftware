package model.factory.funko;

import model.factory.Legs;
import model.factory.Part;

public class funkoLegs implements Legs, Part{
	private String estilo, tipo;
	
	public funkoLegs(){
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
        funkoLegs clonedBody = new funkoLegs();
        clonedBody.setEstilo(this.estilo);
        return clonedBody;
    }

}
