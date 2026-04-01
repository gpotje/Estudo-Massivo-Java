package com.gpotje.estudos.bloco0.ex9;

public class FullTime extends Employee {
    @Override
    protected double calculatePay(double salary) {
        return salary + 1000;
    }
}
