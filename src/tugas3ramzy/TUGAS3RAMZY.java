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
public class TUGAS3RAMZY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Food f = new Food("F",10000,"Karedok",500);
        Toy t = new Toy("T",20000,"Gangsing",5);
        Book b = new Book("B",50000,"Harry Potter");
        Author a1 = new Author("JK");
        Author a2 = new Author("Rowling");
        b.addAuthor(a1);
        b.addAuthor(a2);
        a1.setIncome(50000);
        a2.setIncome(100000);
        System.out.println(f.toString());
        System.out.println(t.toString());
        System.out.println(b.toString());
        
    }
    
}
