package com.gpotje.estudos.bloco1_5.ex2;

public class USTax implements Tax{
    @Override
    public double calculate(double value) {
        return value * 0.1;
    }
}
