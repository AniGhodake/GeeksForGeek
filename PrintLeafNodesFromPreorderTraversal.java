class Solution {
    int index = 0;
    public ArrayList<Integer> leafNodes(int[] preorder) {
        ArrayList<Integer> leaves = new ArrayList<>();
        findLeaves(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE, leaves);
        return leaves;
    }

    private Node findLeaves(int[] preorder, int min, int max, ArrayList<Integer> leaves) {
        if (index >= preorder.length) return null;

        int val = preorder[index];
        if (val < min || val > max) return null;

        index++;
        Node root = new Node(val);

        root.left = findLeaves(preorder, min, val, leaves);
        root.right = findLeaves(preorder, val, max, leaves);

        if (root.left == null && root.right == null) {
            leaves.add(val);
        }

        return root;
        
    }
     class Node {
        int val;
        Node left, right;
        Node(int val) {
            this.val = val;
        }
    }
}