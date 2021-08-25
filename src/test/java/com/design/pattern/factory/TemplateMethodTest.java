package com.design.pattern.factory;

import com.design.pattern.templatemethod.GlassHouse;
import com.design.pattern.templatemethod.HouseTemplate;
import com.design.pattern.templatemethod.WoodenHouse;
import org.junit.jupiter.api.Test;

public class TemplateMethodTest {
    @Test
    void templateMethodTest(){
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        houseType = new GlassHouse();
        houseType.buildHouse();
    }
}
