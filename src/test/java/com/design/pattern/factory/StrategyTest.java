package com.design.pattern.factory;

import com.design.pattern.strategy.GameCharacter;
import com.design.pattern.strategy.Gun;
import com.design.pattern.strategy.Knife;
import com.design.pattern.strategy.Sword;
import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    void strategyTest(){
        GameCharacter gameCharacter = new GameCharacter();
        gameCharacter.attack();

        gameCharacter.setWeapon(new Knife());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Sword());
        gameCharacter.attack();

        gameCharacter.setWeapon(new Gun());
        gameCharacter.attack();
    }

}
