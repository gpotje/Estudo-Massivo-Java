package com.gpotje.estudos.bloco1.ex25;

public class Principal {
    public static void main(String[] args) {
        BonusPolicy dev =  new Developer();
        BonusPolicy manager = new Manager();

        Employee devEmployee = new Employee(5000.0,dev);
        Employee managerEmployee =  new Employee(8000.0,manager);

        System.out.println(devEmployee.calculatorBonus());
        System.out.println(managerEmployee.calculatorBonus());

    }
}
