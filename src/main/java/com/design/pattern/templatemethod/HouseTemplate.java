package com.design.pattern.templatemethod;

public abstract class HouseTemplate {
    public final void buildHouse(){
        buildFoundation();
        buildMalls();
        buildMalls();
        buildWindows();
        System.out.println("House is built");
    }

    private void buildWindows(){
        System.out.println("Building glass windows");
    }

    public abstract void buildMalls();
    public abstract void buildPillars();
    private void buildFoundation(){
        System.out.println("Building foundation with cement, iron rods and sand");
    }
}

