package com.gpotje.estudos.bloco0.ex9;

abstract class Employee {

    public void pay(double salary){
        double total = calculatePay(salary);
        System.out.println("Paid: "+total);
    }

    protected abstract double calculatePay(double salary);

}
