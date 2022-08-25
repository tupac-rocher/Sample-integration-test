package com.montpellier;

public class Computer extends Device{

    private boolean isOn;

    private boolean terminalOn;

    public Computer() {
        super(1,2,3);
        isOn = false;
        super.foo(3);
    }

    @Override
    public void abstractMethod() {
        System.out.println("test");
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOnComputer() {
        isOn = true;
    }

    public void turnOffComputer() {
        isOn = false;
    }

    public void openTerminal(){
        if(isOn){
            terminalOn = true;
        }
        super.foo(2);
    }

    public void printHelloWorld(){
        if(terminalOn){
            System.out.println("Hello World!");
        }
    }
}

