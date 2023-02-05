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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        
        if(root!=null){
            if(stackSum(root, targetSum) == 0) return true;
        }
        
        return false;
    }
    
    public int stackSum(TreeNode root, int targetSum){
        targetSum -= root.val;

        if(root.left==null && root.right==null) {
            if(targetSum==0) return 0;
            else return 1;
        }

        int left = 1;
        int right = 1;

        if(root.left!=null) left = stackSum(root.left, targetSum);
        if(root.right!=null) right = stackSum(root.right, targetSum);

        return left * right;
    }
}