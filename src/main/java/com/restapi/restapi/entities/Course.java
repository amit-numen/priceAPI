package com.restapi.restapi.entities;

public class Course {

    private int id;
    private String title;
    private double price;
    private int priceStrategy;

    public Course(int id, String title, double price, int priceStrategy) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.priceStrategy = priceStrategy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPriceStrategy() {
        return priceStrategy;
    }

    public void setPriceStrategy(int priceStrategy) {
        this.priceStrategy = priceStrategy;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", priceStrategy=" + priceStrategy +
                '}';
    }
}
