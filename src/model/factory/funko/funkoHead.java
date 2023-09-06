package model.factory.funko;

import model.factory.Head;
import model.factory.Part;


public class funkoHead implements Head, Part {
    private String accesorios, tipo;

    public funkoHead() {
    }

    @Override
    public void setAccesorios(String accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String getAccesorios() {
        return accesorios;
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
        funkoHead clonedHead = new funkoHead();
        clonedHead.setAccesorios(this.accesorios);
        return clonedHead;
    }

}
