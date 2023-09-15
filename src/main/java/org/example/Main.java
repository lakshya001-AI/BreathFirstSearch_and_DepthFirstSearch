package org.example;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(44);
        binarySearchTree.insert(78);
        binarySearchTree.insert(90);
        binarySearchTree.insert(23);
        binarySearchTree.insert(45);
        System.out.println();

        System.out.println(binarySearchTree.contain(44));
        System.out.println();

        System.out.println("Breath First Search: ");
        System.out.println(binarySearchTree.BFS());

        System.out.println();

        System.out.println("Depth First Search(Pre order): ");
        System.out.println(binarySearchTree.DFS_Preorder());
        System.out.println();

        System.out.println("Depth First Search(Post order): ");
        System.out.println(binarySearchTree.DFS_Postorder());
        System.out.println();

        System.out.println("Depth First Search(Inorder): ");
        System.out.println(binarySearchTree.DFS_Inorder());






    }
}