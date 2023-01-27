/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        int depth = 0;
        
        if(root!=null){
            depth = isBalanced(depth, root);
            if(depth == -1) return false;
        }
        return true;
    }
    public int isBalanced(int depth, TreeNode root){
        if(root==null) return depth;

        int leftDepth = isBalanced(depth, root.left);
        int rightDepth = isBalanced(depth, root.right);

        if(leftDepth == -1 || rightDepth == -1) return -1;
        if(Math.abs(leftDepth - rightDepth) >= 2) return -1;
     
        return Math.max(leftDepth, rightDepth) + 1;
        
    }
}