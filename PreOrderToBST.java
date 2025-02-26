//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String[] inputline = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputline[0]);
            inputline = br.readLine().trim().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputline[i]);
            }
            Solution obj = new Solution();
            Node res = obj.Bst(arr, n);
            printPostorder(res);
            System.out.println();
        
System.out.println("~");
}
    }

    
// } Driver Code Ends

// User function Template for Java

/*
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
*/

static class Solution {
    int i = 0;         //   VERY IMPORTANT STEP
    Node build(int min, int max, int pre[], int n){
        if(i >= n){
            return null;
        }
        Node root = null;
        
        if(pre[i] > min && pre[i] < max){
            root = new Node(pre[i]);
            i++;
            root.left = build(min, root.data, pre, n);
            root.right = build(root.data, max, pre, n);
        }
        return root;
    }
    // Function that constructs BST from its preorder traversal.
    public Node Bst(int pre[], int size) {
       int min = Integer.MIN_VALUE;
       int max = Integer.MAX_VALUE;
      // int i = 0;
       int n = pre.length;
       
       return build(min, max, pre, n);
    }
}


//{ Driver Code Starts.

    public static void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }

    public static void printPostorder(Node node) {
        if (node == null) {
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.data + " ");
    }

    public static void printPreorder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
}
// } Driver Code Ends