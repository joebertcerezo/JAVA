/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_tree;

import java.util.Scanner;

/**
 *
 * @author CEREZO
 */
public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        
        binary_tree tree = new binary_tree();
        
//        tree.addNode(5);
//        tree.addNode(3);
//        tree.addNode(4);
//        tree.addNode(2);
//        tree.addNode(1);
//        tree.addNode(6);
//        tree.addNode(7);
//        tree.Delete(3);
        
        tree.addNode(12);
        tree.addNode(5);
        tree.addNode(15);
        tree.addNode(3);
        tree.addNode(1);
        tree.addNode(7);
        tree.addNode(9);
        tree.addNode(13);
        tree.addNode(17);
        tree.Delete(1);
        
//        tree.addNode(60);
//        tree.addNode(25);
//        tree.addNode(90);
//        tree.addNode(50);
        
//        tree.addNode(9);
//        tree.addNode(2);
//        tree.addNode(3);
//        tree.addNode(4);

//        tree.addNode(50);
//        tree.addNode(25);
//        tree.addNode(15);
//        tree.addNode(30);
//        tree.addNode(75);
//        tree.addNode(85);
        
        
        System.out.println("\nInorder");
        tree.inOrderTraversal(tree.root);
        System.out.println("\nPreorder");
        tree.preOrderTraversal(tree.root);
        System.out.println("\nPostorder");
        tree.postOrderTraversal(tree.root);
        
        System.out.print("\n\nfind smallest: " );
        tree.findSmallestValue();
        System.out.print("\nfind largest: " );
        tree.findLargestValue();
        
        System.out.println("succesor: " + tree.inorder_successor(tree.root));
        System.out.println("predecesor: " + tree.inorder_predecessor(tree.root));
        
    }
    
}
