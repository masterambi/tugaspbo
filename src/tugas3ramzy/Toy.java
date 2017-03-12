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
public class Toy extends Goods{
    private String toyName;
    private int minimumAge = 0;

    public Toy(String id, double basePrice,String toyName, int minimumAge) {
        super(id, basePrice);
        setToyName(toyName);
        setMinimumAge(minimumAge);
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public void setMinimumAge(int minimumAge) {
        if(minimumAge>=0){
            this.minimumAge = minimumAge;
        }
    }

    public String getToyName() {
        return toyName;
    }

    public int getMinimumAge() {
        return minimumAge;
    }
    
    public String toString() {
        return "\nID: "+getId()+"\nToy Name: "+toyName+"\nMinimum Age: "+minimumAge+"\nBase Price: "+getBasePrice()+"\nSelling Price: "+getSellingPrice(); 
    }
    
}
