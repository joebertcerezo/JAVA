/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaextendclass;

/**
 *
 * @author CEREZO
 */
public class Javaextendclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OtherClass other = new OtherClass();
        other.otherclass();
        // TODO code application logic here
    }
    
}

class OtherClass 
{
    public void otherclass()
    {
        System.out.print("Hello world from other class");
    }
}