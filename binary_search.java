import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data <= root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }

        return root; // Ensures a Node is returned in all cases
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if (scan.hasNextInt()) {
            int t = scan.nextInt();
            Node root = null;

            while (t-- > 0 && scan.hasNextInt()) {
                int data = scan.nextInt();
                root = insert(root, data);
            }

            preOrder(root);
        }

        scan.close();
    }
}