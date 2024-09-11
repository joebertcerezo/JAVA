/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circular;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        Circular list = new Circular();
        System.out.println("Circular Singly LinkedList");
        int choice = 0;
        
        while(choice<15)
        {
            System.out.println("1. Generate 5 numbers");
            System.out.println("2. insertBeginning");
            System.out.println("3. insertEnd");
            System.out.println("4. insertBefore");
            System.out.println("5. insertAfter");
            System.out.println("6. deleteBeginning");
            System.out.println("7. deleteEnd");
            System.out.println("8. deleteBefore");
            System.out.println("9. deleteAfter");
            System.out.println("10. deleteGiven");
            System.out.println("11. deleteEven");
            System.out.println("13. deleteRepeatingNode");
            System.out.println("13. destroyWholeNode");
            System.out.println("14. display");
            System.out.print("Enter Selected Number: ");
            choice = input.nextInt();
            
            switch(choice)
            {
                case 1:
                    System.out.println("\nGenerate 5 number numbers");
                    list.randomNumbers();
                    list.display();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("\ninsertAtTheBeginning");
                    System.out.print("Enter data: ");
                    int data = input.nextInt();
                    list.insertBeginning(data);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\ninsertAtTheBeginning");
                    System.out.print("Enter data: ");
                    data = input.nextInt();
                    list.insertEnd(data);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("\ninsertBefore");
                    System.out.print("Enter data: ");
                    data = input.nextInt();
                    System.out.print("Enter value: ");
                    int value = input.nextInt();
                    list.insertBefore(data, value);
                    System.out.println();
                    break;
                case 5:
                    System.out.println("\ninsertAfter");
                    System.out.print("Enter data: ");
                    data = input.nextInt();
                    System.out.print("Enter value: ");
                    value = input.nextInt();
                    list.insertAfter(data, value);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("\ndeleteBeginning");
                    list.deleteBeginning();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("\ndeleteEnd");
                    list.deleteEnd();
                    System.out.println();
                    break;
                case 8:
                    System.out.println("\ndeleteBefore");
                    System.out.print("Enter keyValue: ");
                    value = input.nextInt();
                    list.deleteBefore(value);
                    System.out.println();
                    break;
                case 9:
                    System.out.println("\ndeleteAfter");
                    System.out.print("Enter keyValue: ");
                    value = input.nextInt();
                    list.deleteAfter(value);
                    System.out.println();
                    break;
                case 10:
                    System.out.println("\ndeleteGiven");
                    System.out.print("Enter keyValue: ");
                    value = input.nextInt();
                    list.deleteGiven(value);
                    System.out.println();
                    break;
                case 11:
                    System.out.println("\ndeleteEven");
                    list.deleteEven();
                    System.out.println();
                    break;
                case 12:
                    System.out.println("\ndeleteRepeatingNode");
                    list.display();
                    System.out.print("Enter value: ");
                    value = input.nextInt();
                    list.deleteRepeatingNode(value);
                    System.out.println();
                    break;    
                case 13:
                    System.out.println("\nALL NODE DESTROYED");
                    list.destroyWholeNode();
                    System.out.println();
                    break;
                case 14:
                    System.out.println("\nDISPLAY");
                    list.display();
                    System.out.println();
                    break;
                
            }
        }
        
    }
    
}
