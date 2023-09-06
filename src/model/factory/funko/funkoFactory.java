package model.factory.funko;

import model.factory.AbstractFactory;
import model.factory.Body;
import model.factory.Head;
import model.factory.Legs;

public class funkoFactory implements AbstractFactory{

    @Override
    public Head createHead() {
        return new funkoHead();
    }

    @Override
    public Body createBody() {
        return new funkoBody();
    }

    @Override
    public Legs createLegs() {
        return new funkoLegs();
    }

}
