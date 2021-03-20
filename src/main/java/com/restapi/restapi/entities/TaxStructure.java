package com.restapi.restapi.entities;

public class TaxStructure {
    private int currency;
    private int taxRate;

    public TaxStructure() {
    }

    public TaxStructure(int currency, int taxRate) {
        this.currency = currency;
        this.taxRate = taxRate;
    }

    public int getCurrency() {
        return currency;
    }

    public void setCurrency(int currency) {
        this.currency = currency;
    }

    public int getTaxRate() {
        return taxRate;
    }

    public double getTaxRate(int currency) {
        if(currency == 0){
            return 0.2;
        }
        else {
            return 0.35;
        }
    }

    public void setTaxRate(int taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public String toString() {
        return "TaxStructure{" +
                "currency=" + currency +
                ", taxRate=" + taxRate +
                '}';
    }
}
