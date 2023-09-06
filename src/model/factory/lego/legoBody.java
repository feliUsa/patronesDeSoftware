package model.factory.lego;

import model.factory.Body;
import model.factory.Part;

public class legoBody implements Body, Part{
    private String genero, tipo;

    public legoBody() {
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String getGenero() {
        return genero;
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
    	legoBody clonedBody = new legoBody();
        clonedBody.setGenero(this.genero);
        return clonedBody;
    }

}
