package com.design.pattern.adapter;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("고르륵! 고르륵!");
    }

    @Override
    public void fly() {
        System.out.println("짧은 거리지만 날라갈 수 있습니다.");
    }
}
