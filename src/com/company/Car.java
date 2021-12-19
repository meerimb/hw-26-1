package com.company;

public class Car {
    private String IDOfCar;
    private int numberOfCar;

    public Car(String IDOfCar, int numberOfCar) {
        this.IDOfCar = IDOfCar;
        this.numberOfCar = numberOfCar;
    }

    public String getIDOfCar() {
        return IDOfCar;
    }

    public void setIDOfCar(String IDOfCar) {
        this.IDOfCar = IDOfCar;
    }

    public int getNumberOfCar() {
        return numberOfCar;
    }

    public void setNumberOfCar(int numberOfCar) {
        this.numberOfCar = numberOfCar;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car: " +
                "IDOfCar=" + IDOfCar  +
                ", numberOfCar=" + numberOfCar+",";
    }
}
