package com.restapi.restapi.entities;

public class ConversionFee {
    private int baseCurrency;
    private int conversionRate;

    public ConversionFee() {
    }

    public ConversionFee(int baseCurrency, int conversionRate) {
        this.baseCurrency = baseCurrency;
        this.conversionRate = conversionRate;
    }

    public int getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(int baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public int getConversionRate() {
        return conversionRate;
    }


    public double getConversionRate(int baseCurrency) {
        if(baseCurrency ==0){
            return 0;
        }
        else {
            return 0.1;
        }
    }

    public void setConversionRate(int conversionRate) {
        this.conversionRate = conversionRate;
    }

    @Override
    public String toString() {
        return "ConversionFee{" +
                "baseCurrency=" + baseCurrency +
                ", conversionRate=" + conversionRate +
                '}';
    }
}
