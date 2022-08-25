package com.montpellier;

public abstract class Device {

    final static int third_Constant3 = 1000;

    private int a;

    private int b;
    private int c;

    public void foo(int c) {
        // overlapping by method argument
        c = c;            // violation, reference to instance variable "c" requires "this"
    }

    public Device(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        abstractMethod();
    }

    public void foo2(int c) {
        System.out.println("test");
        // overlapping by method argument
    }

    private void emptyLoop(int parameter) {
        for (int i = 0; i < 10; i++) { // violation
            for(int j = 0; j < 10; j++){

            }
        }

        try { // violation

        } catch (Exception e) {
            // ignored
        }
        int test = 0;
        if (parameter > 10) {
            test = 1; // violation
        }
        else {
            if(parameter == 0){
                System.out.println("Hello World");
            }
        }
        String text = "";
        text = (true) ? "" : text;
        text = parameter > 15 ? "Choux" : text;

    }

    public abstract void abstractMethod();
}
