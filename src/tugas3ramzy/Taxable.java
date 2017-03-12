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
public interface Taxable {
    public double goodsTaxRate = 0.1;
    public double incomeTaxRate = 0.05;
    public double calculateTax();
    
}
