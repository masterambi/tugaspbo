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
public class Book extends Goods {
    private String title;
    private Author author[]=new Author[5];
    int numAuthor = 0;

    public Book(String id, double basePrice, String title) {
        super(id,basePrice);
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        if(numAuthor<=4){
            this.author[numAuthor] = author;
            numAuthor++;
        }
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor(int i) {
        return author[i];
    }

    public int getNumAuthor() {
        return numAuthor;
    }
    
    
    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append("\nID: ").append(getId()).append("\nTitle: ").append(title);
        for(int i=0;i<getNumAuthor();i++){
            s.append("\n").append(getAuthor(i).toString());
        }
        String s1 = s.toString();
        return s1;
    }
    
    
}
