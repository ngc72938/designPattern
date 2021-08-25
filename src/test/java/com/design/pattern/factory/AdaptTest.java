package com.design.pattern.factory;

import com.design.pattern.adapter.Duck;
import com.design.pattern.adapter.MallardDuck;
import com.design.pattern.adapter.TurkeyAdapter;
import com.design.pattern.adapter.WildTurkey;
import org.junit.jupiter.api.Test;

public class AdaptTest {
    @Test
    void adaptPatternTest(){
        System.out.println("칠면조 생성");
        WildTurkey turkey = new WildTurkey();
        turkey.gobble();
        turkey.fly();

        System.out.println("칠면조 어댑터 생성");
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quak();
        turkeyAdapter.fly();

        System.out.println("오리 생성");
        MallardDuck duck = new MallardDuck();
        duck.quak();
        duck.fly();
    }

}
