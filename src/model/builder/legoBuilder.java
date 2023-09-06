package model.builder;

import model.factory.AbstractFactory;
import model.factory.Body;
import model.factory.Head;
import model.factory.Legs;

public class legoBuilder implements Builder {
	
    private Head head;
    private Body body;
    private Legs legs;
    private String color;
    private String genero;
    private String tipo;
    
    public legoBuilder(AbstractFactory factory) {
        // Utiliza la f�brica para crear las partes del mu�eco
        this.head = factory.createHead();
        this.body = factory.createBody();
        this.legs = factory.createLegs();
    }

    @Override
    public void color(String color) {
        this.color = color;
    }

    @Override
    public void genero(String genero) {
        this.genero = genero;
    }

    @Override
    public void tipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public Toy getResult() {
        // Ensambla el mu�eco con las partes y caracter�sticas configuradas
        Toy toy = new Toy();
        toy.setHead(this.head);
        toy.setBody(this.body);
        toy.setLegs(this.legs);
        toy.setColor(this.color);
        toy.setGenero(this.genero);
        toy.setTipo(this.tipo);
        return toy;
    }
	
}
