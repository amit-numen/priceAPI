package com.restapi.restapi.entities;

public class CourseResponse {

    private double price;
    private String modelType;

    public CourseResponse(double price, String modelType) {
        this.price = price;
        this.modelType = modelType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    @Override
    public String toString() {
        return "courseResponse{" +
                "price=" + price +
                ", modelType='" + modelType + '\'' +
                '}';
    }
}
