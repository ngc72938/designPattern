package com.design.pattern.adapter;

public class TurkeyAdapter implements Duck{
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void quak() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
