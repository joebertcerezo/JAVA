/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_tree;

import java.util.Random;

public class binary_tree 
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

//    public void addNode(int data) throws Exception
//    {
//        root = addNode(root, data);
//    }
//    
//    public Node addNode(Node root, int data) throws Exception
//    {
//        if(root == null) 
//        {
//                root = createNewNode(data);
//                return root;
//        }
//
//        if(data < root.data) 
//        {
//                root.left = addNode(root.left, data);
//        } 
//        else 
//        {
//                root.right = addNode(root.right, data);
//        }
//        return root;
//    }
    
    public void addNode(int data) throws Exception
    {
        Node node = createNewNode(data);
        
        if(root == null) 
        {
            root = node;
        }
        else
        {
            Node ptr = root;
            
            while(ptr != null)
            {
                if(data < ptr.data) // to the left
                {
                    if(ptr.left == null)
                    {
                        ptr.left = node;
                        break;
                    }
                    else
                    {
                        ptr = ptr.left;
                    }
                } 
                else if(data > ptr.data) // to the right 
                {
                    if(ptr.right == null)
                    {
                        ptr.right = node;
                        break;
                    }
                    else
                    {
                        ptr = ptr.right;
                    }
                }
            }
            
//        Node ptr = root;
//        Node parent;
//            
//        while(true)
//        {
//            parent = ptr;
//
//            if(data < ptr.data)
//            {
//                    ptr = ptr.left;
//                    if(ptr == null)
//                    {
//                        parent.left = node;
//                        return;
//                    }
//            }
//            if(data > ptr.data)
//            {
//                    ptr = ptr.right;
//                    if(ptr == null)
//                    {
//                        parent.right = node;
//                        return;
//                    }
//            }
//        }
        }
    }
    
//<-----START------------------------------------------------------------------>
    public void delete(int data)
    {
        root = delete(root, data);
    }
    
    public Node delete(Node node, int val) 
    {
        if(node == null) 
        {
          return node;
        }

        if(val < node.data) 
        {
          node.left = delete(node.left, val);
        } 
        else if(val > node.data) 
        {
          node.right = delete(node.right, val);
        } 
        else 
        {
          if(node.left == null || node.right == null) 
          {
            Node temp = node.left != null ? node.left : node.right;

            if(temp == null) 
            {
              return null;
            } else 
            {
              return temp;
            }
          } 
          else 
          {
            Node successor = getSuccessor(node);
            node.data = successor.data;

            node.right = delete(node.right, successor.data);
            return node;
          }
   
        }
    
    return node;
    }
    
    public Node getSuccessor(Node node) 
    {
        if(node == null) 
        {
          return null;
        }

        Node temp = node.right;

        while(temp.left != null) 
        {
          temp = temp.left;
        }

        return temp;
    }
    
    public Node getPredecessor(Node node) 
    {
        if(node == null) 
        {
          return null;
        }

        Node temp = node.left;

        while(temp.right != null) 
        {
          temp = temp.right;
        }

        return temp;
    }
//<---END---------------------------------------------------------------------->
    
//<-----START------------------------------------------------------------------>
    public int inorder_predecessor(Node node){
        node = node.left;
        while(node.right != null) 
        {
            node = node.right;
        }
        return node.data;
    }
    public int inorder_successor(Node node){
        node = node.right;
        while(node.left != null) 
        {
            node = node.left;
        }
        return node.data;
    }
    
    public void deleteNode(int data)
    {
        root = deleteNode(root, data);
    }
    
    public Node deleteNode(Node node, int key) {
        if(node == null) 
        {
            return node;
        }
        if(key > node.data) 
        {
            node.right = deleteNode(node.right, key);
        }
        else if(key < node.data) 
        {
            node.left = deleteNode(node.left, key);
        }
        else
        {
            if(node.left == null && node.right == null) 
            {
                node = null;
            }
            else if(node.left != null)
            { // find inorder predecessor
                node.data = inorder_predecessor(node);
                node.left = deleteNode(node.left, node.data);
            }
            else 
            { // find inorder successor
                node.data = inorder_successor(node);
                node.right = deleteNode(node.right, node.data);
            }
        }
        return node;
    }
//<---END---------------------------------------------------------------------->
    
//<-----START------------------------------------------------------------------>    
    public void Delete(int data)
    {
        root = Delete(root, data);
    }
    
    public Node Delete(Node node, int key) {
        if(node == null) 
        {
            return node;
        }
        if(key > node.data) 
        {
            node.right = Delete(node.right, key);
        }
        else if(key < node.data) 
        {
            node.left = Delete(node.left, key);
        }
        else
        {
            //case 1: No child
            if(node.left == null && node.right == null) 
            {
                node = null;
            }
            //case 2: 1 child
            else if(node.left == null)
            { 
                node = node.right;
            }
            else if(node.right == null)
            { 
                node = node.left;
            }
            //case 3: 2 children
            else
            {
//                Node temp = getSuccessor(node);
                node.data = getSuccessor(node).data;
                node.right = Delete(node.right, getSuccessor(node).data);
            }
        }
        return node;
    }
//<---END---------------------------------------------------------------------->
    
    
    public void findSmallestValue() 
    {
        System.out.println(root.data = findSmallestValue(root));
    }
    
    public int findSmallestValue(Node root) 
    {
        if(root.left == null)
        {
            return root.data;
        }
        else
        {
            return findSmallestValue(root.left);
        }
//        return root.left == null ? root.data : findSmallestValue(root.left);
    }
    
     public void findLargestValue() 
    {
        System.out.println(root.data = findLargestValue(root));
    }
    
    public int findLargestValue(Node root) 
    {
        if(root.right == null)
        {
            return root.data;
        }
        else
        {
            return findLargestValue(root.right);
        }
//        return root.left == null ? root.data : findSmallestValue(root.left);
    }
    
    
    //traversals
    
//    public void inOrderTraversal() throws Exception
//    {
//        inOrderTraversal(root);
//    }
    
    public void inOrderTraversal(Node node) throws Exception
    {
        if(node != null)
        {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
        
        return;
        
//        if(node != null)
//        {
//            return;
//        }
//        
//        inOrderTraversal(node.left);
//        System.out.print(node.data + " ");
//        inOrderTraversal(node.right);
    }
    
//    public void preOrderTraversal() throws Exception
//    {
//        preOrderTraversal(root);
//    }
    
    public void preOrderTraversal(Node root) throws Exception
    {
        if(root != null)
        {
            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
        
        return;
        
//        if(root == null)
//        {
//            return;
//        }
//        
//        System.out.print(root.data + " ");
//        preOrderTraversal(root.left);
//        preOrderTraversal(root.right);
    }
    
//    public void postOrderTraversal() throws Exception
//    {
//        postOrderTraversal(root);
//    }
    
    public void postOrderTraversal(Node root) throws Exception
    {
        if(root != null)
        {
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }
        
//        if(root == null)
//        {
//            return;
//        }
//        
//        postOrderTraversal(root.left);
//        postOrderTraversal(root.right);
//        System.out.print(root.data + " ");
    }

}
