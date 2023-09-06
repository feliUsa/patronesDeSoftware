package model.factory.lego;

import model.factory.AbstractFactory;
import model.factory.Body;
import model.factory.Head;
import model.factory.Legs;

public class legoFactory implements AbstractFactory{

    @Override
    public Head createHead() {
        return new legoHead();
    }

    @Override
    public Body createBody() {
        return new legoBody();
    }

    @Override
    public Legs createLegs() {
        return new legoLegs();
    }

}
