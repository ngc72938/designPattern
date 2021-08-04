package com.design.pattern.factory;

public class PersonalFactory implements AbstractComputerFactory{
    private final String ram;
    private final String hdd;
    private final String cpu;

    public PersonalFactory(String ram, String hdd, String cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public Computer createComputer() {
        return new Personal(ram,hdd,cpu);
    }
}
