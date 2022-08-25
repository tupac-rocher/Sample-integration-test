package com.montpellier;

public class Office {
    private Computer computer;
    public Office() {
        computer = new Computer();
    }
    public void startingToWork () {
        computer.turnOnComputer();
    }
    public void endingWork(){
        computer.turnOffComputer();
    }
}
