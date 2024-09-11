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
public class BookTestClass 
{
    public static void main(String[] args) 
    {
        CartoonBook cartoon = new CartoonBook("Archie Comic Book","Archie Comic", 2021, 600.00F, "Archie");
        CartoonBook cartoon2 = new CartoonBook("The Incredible Hulk","DK Publishing", 2020, 750.00F, "Hulk");
        EncyclopediaBook e = new EncyclopediaBook ("World Book Encyclopedia", "Scott Fetzer Company",1917, 8500, 19);

        Book bk[] = new Book[3];
        bk[0]=cartoon;
        bk[1]=cartoon2;
        bk[2]=e;

        for(int x=0; x<bk.length; x++)
        {
            bk[x].compute();
        }
    }
}
