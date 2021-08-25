package com.design.pattern.templatemethod;

public class WoodenHouse extends HouseTemplate{
    @Override
    public void buildMalls() {
        System.out.println("Building Wooden Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with Wood Coating");
    }
}
