package com.design.pattern.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ComputerFactoryTest {
    @Test
    void testGetComputer() {
        Computer personal = ComputerFactory.getComputer(new PersonalFactory("32G", "2T", "i9-9980"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("128G", "100T", "xenon-8999"));

        System.out.println("Personal Computer :: "+ personal.toString());
        System.out.println("Server Computer :: "+ server.toString());

        Assertions.assertEquals("i9-9980", personal.getCPU());
        Assertions.assertEquals("xenon-8999", server.getCPU());
    }
}
