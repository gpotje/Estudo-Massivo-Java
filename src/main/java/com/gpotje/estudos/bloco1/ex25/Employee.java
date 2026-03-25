package com.gpotje.estudos.bloco1.ex25;

public class Employee {
    private double salary;
    private BonusPolicy bonusEmployee;

    public Employee(double salary, BonusPolicy bonusEmployee){
        this.salary = salary;
        this.bonusEmployee = bonusEmployee;
    }

    public double getSalary() {
        return salary;
    }

    public double calculatorBonus(){
        return bonusEmployee.calculatorSalary(salary);
    }
}
