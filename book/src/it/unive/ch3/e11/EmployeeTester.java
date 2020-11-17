package it.unive.ch3.e11;

public class EmployeeTester {

    public static void main(String[] args) {
        Employee Mario=new Employee("Mario",2000.0);
        System.out.println("Il nome del primo impiegato è "+Mario.getEmployeeName());
        System.out.println("Il salario del primo impiegato è "+Mario.getCurrentSalary());
        double raise=50;
        System.out.println("Aumento del salario di "+raise+"%");
        Mario.raiseSalary(raise);
        System.out.println("Il salario del primo impiegato è ora "+Mario.getCurrentSalary());
        Mario.raiseSalary(-50);
    }

}
