/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3ramzy;

/**
 *
 * @author ramzyrashaunarief
 */
public abstract class Goods implements Taxable{
    private String id;
    private double basePrice = 0;
    private double sellingPrice;

    public Goods(String id, double basePrice) {
        this.id = id;
        this.basePrice = basePrice;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBasePrice(double basePrice) {
        if(basePrice>=0){
            this.basePrice = basePrice;
        }
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getId() {
        return id;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getSellingPrice() {
        sellingPrice = basePrice + calculateTax();
        return sellingPrice;
    }
    public double calculateTax(){ 
        return basePrice*goodsTaxRate;
    }
    public abstract String toString();
}
