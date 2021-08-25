package com.design.pattern.templatemethod;

public class GlassHouse extends HouseTemplate{
    @Override
    public void buildMalls() {
        System.out.println("Building Glass Walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Building Pillars with glass coating");
    }
}
