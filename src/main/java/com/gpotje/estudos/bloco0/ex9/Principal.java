package com.gpotje.estudos.bloco0.ex9;

public class Principal {
    public static void main(String[] args) {
        Employee fullSalary = new FullTime();
        Employee freelancer = new Freelancer();
        Employee partSalary = new PartTime();

        PayrollService service = new PayrollService();
        service.pay(fullSalary,1000.0);
        service.pay(freelancer,1000.0);
        service.pay(partSalary,1000.0);
    }
}
