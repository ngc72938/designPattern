package com.design.pattern.factory;

public class ComputerFactory {
    public static Computer getComputer(AbstractComputerFactory computerFactory){
        return computerFactory.createComputer();
    }
}
