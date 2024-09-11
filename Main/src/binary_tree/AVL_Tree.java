/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_tree;

import java.util.Random;

public class AVL_Tree 
{

    //declaration of the Node
    private class Node {
        Node left;
        int data;
        Node right;
    }

    public Node root;
    
    //generate 5 random data
//    public void randomNumbers() throws Exception
//    {
//        Random rand = new Random();
//
//        for(int i=0; i<5; i++)
//        {
//            insertAtTheEnd(rand.nextInt(99));
//        }
//    }

    public Node createNewNode(int data) throws  Exception 
    {
        Node node = new Node();
        if(node == null)
            throw  new Exception("Memory not allocated");
        else {
            node.left = null;
            node.data = data;
            node.right = null;
            return node;
        }
    }
    
    

}
