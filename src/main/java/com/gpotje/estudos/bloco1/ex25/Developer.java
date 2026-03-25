package com.gpotje.estudos.bloco1.ex25;

public class Developer implements BonusPolicy {

    @Override
    public double calculatorSalary(double salary) {
        return salary * 0.1;
    }
}
