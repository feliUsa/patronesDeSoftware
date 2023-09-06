package model.builder;

public class toyDirector implements Director{

    @Override
    public Toy buildToy(Builder builder) {
        // Define la secuencia de pasos para construir el objeto
        builder.color("Rojo");
        builder.genero("Masculino");
        builder.tipo("Funko");
        return builder.getResult();
    }
}
