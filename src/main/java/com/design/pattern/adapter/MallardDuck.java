package com.design.pattern.adapter;

public class MallardDuck implements Duck{
    @Override
    public void quak() {
        System.out.println("꽥! 꽥!");
    }

    @Override
    public void fly() {
        System.out.println("날라갈 수 있습니다.");
    }
}
