package model.builder;

import model.factory.Body;
import model.factory.Head;
import model.factory.Legs;

public class Toy {
    private Head head;
    private Body body;
    private Legs legs;
    private String color;
    private String genero;
    private String tipo;
    
    
	public Head getHead() {
		return head;
	}
	public void setHead(Head head) {
		this.head = head;
	}
	public Body getBody() {
		return body;
	}
	public void setBody(Body body) {
		this.body = body;
	}
	public Legs getLegs() {
		return legs;
	}
	public void setLegs(Legs legs) {
		this.legs = legs;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

    
}
