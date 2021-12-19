package com.company;

public class Data extends Car{
    private int dateOfRelase;
    private String model;
    private int price;
    private String color;

    public Data(int dateOfRelase, String model, int price, String color) {
        this.dateOfRelase = dateOfRelase;
        this.model = model;
        this.price = price;
        this.color = color;
    }

    public int getDateOfRelase() {
        return dateOfRelase;
    }

    public void setDateOfRelase(int dateOfRelase) {
        this.dateOfRelase = dateOfRelase;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Data() {
    }

    @Override
    public String toString() {
        return
                "dateOfRelase=" + dateOfRelase +" year"+
                ", model=" + model +
                ", price=" + price +"$"+
                ", color=" + color+"." ;
    }
}
