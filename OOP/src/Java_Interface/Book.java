/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_Interface;

/**
 *
 * @author CEREZO
 */
public class Book implements BookInterface {

    private String publisher, title;
    private int yearPublished;
    private float price;
    
    public Book(String publisher, String title, int yearPublished, float price)
    {
        this.publisher = publisher;
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
    }
    
    @Override
    public String getPublisher() {
        return this.publisher;
    }

    @Override
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public int getYearPublished() {
        return this.yearPublished;
    }

    @Override
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public float getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String getTitle() {
        return this.title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
    
    @Override
    public void compute()
    {
        System.out.println(this.title + " " + this.publisher + ": " + this.yearPublished);
    }
}
