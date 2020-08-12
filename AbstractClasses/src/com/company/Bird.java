package com.company;

public abstract class Bird extends Animal implements ICanFly{


    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println(getName() + " is a breathing bird");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
