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
public class Food extends Goods{
    private String foodName;
    private double calories = 0;

    
    public Food(String id, int basePrice , String foodName, double calories) {
        super(id,basePrice);
        this.foodName = foodName;
        setCalories(calories);
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setCalories(double calories) {
        if(calories >= 0){
            this.calories = calories;
        }
    }

    public String getFoodName() {
        return foodName;
    }

    public double getCalories() {
        return calories;
    }
    public String toString(){
        return "\nID : "+getId()+"\nFood Name: "+foodName+"\nCalories: "+calories+"\nBase Price: "+getBasePrice()+"\nSellingPrice: "+getSellingPrice();
    }
    
    
}
