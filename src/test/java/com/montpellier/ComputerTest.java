package com.montpellier;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ComputerTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void test_1(){
        Computer computer = new Computer();
        assertFalse(computer.isOn());
    }

    @Test
    public void test_2(){
        Computer computer = new Computer();
        computer.turnOnComputer();
        assertTrue(computer.isOn());
    }

    @Test
    public void test_3(){
        Computer computer = new Computer();
        computer.turnOnComputer();
        computer.openTerminal();
        computer.printHelloWorld();
        assertEquals("test\nHello World!\n", outContent.toString());
    }
}
