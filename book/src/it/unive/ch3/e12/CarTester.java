package it.unive.ch3.e12;

public class CarTester {
    public static void main(String[] args) {
        Car primamacchina=new Car(20,60);
        primamacchina.addTankGas(40);
        primamacchina.drive(80);
        System.out.println(primamacchina.getCurrentGas());
    }
}
