package it.unive.ch3.e12;

public class Car {
    private double fuelConsumption;
    private double tankCapacity;
    private double currentGas;

    public Car(double fuelConsumption, double tankCapacity) {
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
        this.currentGas=0;
    }

    public void drive(double kmtoDo){
        if(kmtoDo/this.fuelConsumption<this.currentGas){
            this.currentGas-=kmtoDo/fuelConsumption;
        }else
            throw new IllegalArgumentException("Not enought fuel to drive per "+kmtoDo);
    }

    public void addTankGas(double moreFuel) {
        if (this.currentGas+moreFuel > this.tankCapacity){
            this.currentGas = this.currentGas + moreFuel;
        }
        if (moreFuel<0){
            throw new IllegalArgumentException("Cannot add negative fuel to tank.");
        }
        this.currentGas+=moreFuel;
    }

    public double getTankCapacity() {
        return tankCapacity;
    }

    public double getCurrentGas() {
        return currentGas;
    }

}
