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
public class EncyclopediaBook extends Book 
{
    private int numberOfVolumes;
    public EncyclopediaBook(String publisher, String title, int yearPublished, float price, int numberOfVolumes) 
    {
        super(publisher, title, yearPublished, price);
        this.numberOfVolumes = numberOfVolumes;
    }
    
    public int getnumberOfVolumes() {
        return this.numberOfVolumes;
    }

    public void setnumberOfVolumes(int numberOfVolumes) {
        this.numberOfVolumes = numberOfVolumes;
    }
    
    public void compute()
    {
        System.out.println(super.getTitle() + " " + super.getTitle() + ": " + super.getYearPublished() + " Price: " + (super.getPrice() * 2) + " Volumes: " + this.numberOfVolumes);
    }
}
