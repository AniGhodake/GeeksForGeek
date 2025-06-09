/*
class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
}*/

class Solution {
    public boolean isDeadEnd(Node root) {
        return check(root,0,Integer.MAX_VALUE);
    }
    
    public static boolean check(Node root, int min, int max){
        if(root == null){
            return false;
        }
        if(root.data == min+1 && root.data == max-1){
            return true;
        }
        else{
            return check(root.left,min,root.data) || check(root.right,root.data,max);
        }
    }
}