//{ Driver Code Starts
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class GfG {

    // Function to build a binary tree from a string representation
    static Node buildTree(String input) {
        if (input.length() == 0 || input.charAt(0) == 'N') return null;

        String[] nodeValues = input.split(" ");
        Node root = new Node(Integer.parseInt(nodeValues[0]));
        Queue<Node> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int i = 1;
        while (!nodeQueue.isEmpty() && i < nodeValues.length) {
            Node currentNode = nodeQueue.poll();

            // Process left child
            String leftValue = nodeValues[i++];
            if (!leftValue.equals("N")) {
                currentNode.left = new Node(Integer.parseInt(leftValue));
                nodeQueue.add(currentNode.left);
            }

            // Process right child
            if (i >= nodeValues.length) break;
            String rightValue = nodeValues[i++];
            if (!rightValue.equals("N")) {
                currentNode.right = new Node(Integer.parseInt(rightValue));
                nodeQueue.add(currentNode.right);
            }
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(reader.readLine());

        while (testCases-- > 0) {
            String treeInput = reader.readLine();
            Node root = buildTree(treeInput);
            Solution ob = new Solution();

            // Output "true" or "false" based on whether the tree is balanced
            System.out.println(ob.isBalanced(root) ? "true" : "false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



/* A binary tree node class
class Node
{
    int data;
    Node left,right;

    Node(int d)
    {
        data = d;
        left = right = null;
    }
} */

class Solution {
    boolean isBal = true;
    public boolean isBalanced(Node root) {
        height(root);
        return isBal;
    }
    
    public int height(Node root){
        if(root == null){
            return 0;
        }
        
        int lh = height(root.left);
        int rh = height(root.right);
        
        if(isBal && Math.abs(lh - rh) > 1){
            isBal = false;
        }
        
        return Math.max(lh, rh) + 1;
    }
}