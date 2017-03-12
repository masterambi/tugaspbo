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
public class Author implements Taxable{
    private String name;
    private double income = 0;

    public Author(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncome(double income){
        if(income>0){
            this.income = income;
        }
    }
    
    public double calculateTax() {
        return income*incomeTaxRate;
    }

    public String getName() {
        return name;
    }

    public double getIncome() {
        return income;
    }
    public String toString() {
        return "\nName: "+getName()+"\nIncome: "+getIncome()+"\nTax: "+calculateTax();
    }
    
    
    
}
