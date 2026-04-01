package com.gpotje.estudos.bloco0.ex9;

public class Freelancer extends Employee {
    @Override
    protected double calculatePay(double salary) {
        return salary - 200;
    }
}
