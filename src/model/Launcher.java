package model;

import model.builder.*;
import model.factory.*;
import model.factory.funko.*;
import model.factory.lego.*;

public class Launcher {

    public static void main(String[] args) {
        // Crear una fábrica de Funko
        AbstractFactory funkoFactory = new funkoFactory();
        
        // Crear un director de juguetes
        Director director = new toyDirector();
        
        // Crear un FunkoBuilder con la fábrica de Funko
        Builder funkoBuilder = new funkoBuilder(funkoFactory);
        
        // Construir un Funko
        Toy funkoToy = director.buildToy(funkoBuilder);
        
        // Mostrar los detalles del Funko
        System.out.println("Detalles del Funko:");
        System.out.println("Tipo: " + funkoToy.getTipo());
        System.out.println("Color de la cabeza: " + funkoToy.getHead().getAccesorios());
        System.out.println("Género del cuerpo: " + funkoToy.getBody().getGenero());
        System.out.println("Tipo de piernas: " + funkoToy.getLegs().getTipo());
        System.out.println("Estilo de piernas: " + funkoToy.getLegs().getEstilo());

        // Crear una fábrica de Lego
        AbstractFactory legoFactory = new legoFactory();
        
        // Crear un LegoBuilder con la fábrica de Lego
        Builder legoBuilder = new legoBuilder(legoFactory);
        
        // Construir un Lego
        Toy legoToy = director.buildToy(legoBuilder);
        
        // Mostrar los detalles del Lego
        System.out.println("\nDetalles del Lego:");
        System.out.println("Tipo: " + legoToy.getTipo());
        System.out.println("Color de la cabeza: " + legoToy.getHead().getAccesorios());
        System.out.println("Género del cuerpo: " + legoToy.getBody().getGenero());
        System.out.println("Tipo de piernas: " + legoToy.getLegs().getTipo());
        System.out.println("Estilo de piernas: " + legoToy.getLegs().getEstilo());
    }
}