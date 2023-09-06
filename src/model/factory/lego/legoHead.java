package model.factory.lego;

import model.factory.Head;
import model.factory.Part;

public class legoHead implements Head, Part{

    private String accesorios, tipo;

    public legoHead() {
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
        legoHead clonedHead = new legoHead();
        clonedHead.setAccesorios(this.accesorios);
        return clonedHead;
    }

}
