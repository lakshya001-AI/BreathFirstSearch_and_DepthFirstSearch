package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    public class Node{
        private int value;
        private Node left;
        private Node right;

        Node(int value){
            this.value = value;
        }
    }
    private Node root;

    //insert
    public boolean insert(int value){
        Node newnode = new Node(value);
        if (root == null){
            root = newnode;
            return true;
        }
        Node temp = root;
        while (true){
            if (newnode.value == temp.value){
                return false;
            }
            if (newnode.value < temp.value){
                if (temp.left == null){
                    temp.left = newnode;
                    return true;
                }
                temp = temp.left;
            }
            else {
                if (temp.right == null){
                    temp.right = newnode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    //contain
    public boolean contain(int value){
        if (root == null){
            return false;
        }
        Node temp = root;
        while (temp != null){
            if (value < temp.value){
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            }
            else {
                return true;
            }
        }
        return false;
    }

    //Breath First Search
    public ArrayList<Integer> BFS(){
        Node currentnode = root;
        Queue<Node> queue = new LinkedList<>();
        ArrayList<Integer> results = new ArrayList<>();

        queue.add(currentnode);

        while (queue.size() > 0){
            currentnode = queue.remove();
            results.add(currentnode.value);
            if (currentnode.left != null){
                queue.add(currentnode.left);
            }
            if (currentnode.right != null){
                queue.add(currentnode.right);
            }
        }
        return results;
    }

    //DepthFirstSearch_preporder
    public ArrayList<Integer> DFS_Preorder(){
        ArrayList<Integer> results = new ArrayList<>();

         class Traverse{
             Traverse(Node currentnode){
                 results.add(currentnode.value);
                 if (currentnode.left != null){
                     new Traverse(currentnode.left);
                 }
                 if (currentnode.right != null){
                     new Traverse(currentnode.right);
                 }
             }
         }
         new Traverse(root);
         return results;
    }

    //DepthFirstSearch_Postorder
    public ArrayList<Integer> DFS_Postorder(){
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse{
            Traverse(Node currentnode){
                if (currentnode.left != null){
                    new Traverse(currentnode.left);
                }
                if (currentnode.right != null){
                    new Traverse(currentnode.right);
                }
                results.add(currentnode.value);
            }
        }
        new Traverse(root);
        return results;
    }

    //DepthFirstSearch_Inorder
    public ArrayList<Integer> DFS_Inorder(){
        ArrayList<Integer> results = new ArrayList<>();

        class Traverse{
            Traverse(Node currentnode){
                if (currentnode.left != null){
                    new Traverse(currentnode.left);
                }
                results.add(currentnode.value);
                if (currentnode.right != null){
                    new Traverse(currentnode.right);
                }
            }
        }
        new Traverse(root);
        return results;
    }


}
