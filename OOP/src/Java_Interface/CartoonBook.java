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
public class CartoonBook extends Book {
    private String characterName;
    public CartoonBook(String publisher, String title, int yearPublished, float price, String characterName)
    {
        super(publisher, title, yearPublished, price);
        this.characterName = characterName;
    }
    
    public String getcharacterName() {
        return this.characterName;
    }

    public void setcharacterName(String characterName) {
        this.characterName = characterName;
    }
    
    public void compute()
    {
        System.out.println(super.getTitle() + " " + super.getTitle() + ": " + super.getYearPublished() + " Price: " + (super.getPrice() * .3) + " Cartoon Name: " + this.characterName);
    }
}
