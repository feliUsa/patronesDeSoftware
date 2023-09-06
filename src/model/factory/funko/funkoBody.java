package model.factory.funko;

import model.factory.Body;
import model.factory.Part;

public class funkoBody implements Body, Part{
    private String genero, tipo;

    public funkoBody() {
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
        funkoBody clonedBody = new funkoBody();
        clonedBody.setGenero(this.genero);
        return clonedBody;
    }

}
