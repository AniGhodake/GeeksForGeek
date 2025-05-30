/*
class Node {
    int data;
    Node left, right;

    Node(int x) {
        data = x;
        left = right = null;
    }
} */
class Solution {
    public int findMaxFork(Node root, int k) {
        int floor = -1;
        
        while(root != null){
            if(root.data == k){
                return root.data;
            }
            else if(root.data < k){
                floor = root.data;
                root = root.right;
            }
            else{
                root = root.left;
            }
        }
        
        return floor;
    }
}