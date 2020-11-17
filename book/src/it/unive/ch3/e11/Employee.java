package it.unive.ch3.e11;

public class Employee {
    private String employeeName;

    private double currentSalary;

    public Employee(String employeeName, double currentSalary) {
        this.employeeName = employeeName;
        this.currentSalary = currentSalary;
    }

    public void raiseSalary(double byPercent){
        if(byPercent<0){
            throw new IllegalArgumentException("Value given to the function not valid");
        }else
            currentSalary=getCurrentSalary()+(getCurrentSalary()*byPercent/100);


    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getCurrentSalary() {
        return currentSalary;
    }
}
