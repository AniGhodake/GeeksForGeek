//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Scanner;

class Node {
    int data;
    Node right, left;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinarySearchTree {
    static Node insert(Node node, int data) {
        if (node == null) {
            return (new Node(data));
        } else {

            /* 2. Otherwise, recur down the tree */
            if (data <= node.data) {
                node.left = insert(node.left, data);
            } else {
                node.right = insert(node.right, data);
            }

            /* return the (unchanged) node pointer */
            return node;
        }
    }

    int height(Node node) {
        if (node == null)
            return 0;
        else {
            int lDepth = height(node.left);
            int rDepth = height(node.right);
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }

    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length) break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while (t > 0) {
            String s = br.readLine();
            Node root = buildTree(s);

            Solution gfg = new Solution();

            root = gfg.balanceBST(root);
            // preOrder(root);
            BinarySearchTree bst = new BinarySearchTree();
            System.out.println(bst.height(root));
            t--;

            System.out.println("~");
        }
    }

    void preOrder(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }
}

// } Driver Code Ends


/*
class Node
{
    int data;
    Node right, left;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/

class Solution {
    void inOrder(Node root, ArrayList<Integer>in){
        if(root == null){
            return;
        }
        inOrder(root.left, in);
        in.add(root.data);
        inOrder(root.right, in);
    }
    
    Node BuildBalanceBST(ArrayList<Integer>in, int start, int end){
        if(start > end){
            return null;
        }
        
        int mid = (start + end)/2;
        
        Node root = new Node(in.get(mid));
        root.left = BuildBalanceBST(in, start, mid-1);
        root.right = BuildBalanceBST(in, mid+1, end);
        
        return root;
    }
    
    Node balanceBST(Node root) {
        ArrayList<Integer> in = new ArrayList<>();
        inOrder(root, in);
        
        return BuildBalanceBST(in, 0, in.size()-1);
    }
}