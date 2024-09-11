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
public interface BookInterface {
    public String getPublisher();
    public void setPublisher(String publisher);
    public int getYearPublished();
    public void setYearPublished(int yearPublished);
    public float getPrice();
    public void setPrice(float price);
    public String getTitle();
    public void setTitle(String title);
    public abstract void compute();
}
