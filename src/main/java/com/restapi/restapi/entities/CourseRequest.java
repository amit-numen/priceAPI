package com.restapi.restapi.entities;

public class CourseRequest {

    private int id;
    private int paymentMode;

    public CourseRequest(int id, int paymentMode) {
        this.id = id;
        this.paymentMode = paymentMode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(int paymentMode) {
        this.paymentMode = paymentMode;
    }

    @Override
    public String toString() {
        return "CourseRequest{" +
                "id=" + id +
                ", paymentMode=" + paymentMode +
                '}';
    }
}
