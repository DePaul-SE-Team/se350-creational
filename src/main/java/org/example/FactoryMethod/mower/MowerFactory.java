package org.example.FactoryMethod.mower;

abstract class MowerFactory {
    public abstract Mower getMowerType(String mowerType);
}