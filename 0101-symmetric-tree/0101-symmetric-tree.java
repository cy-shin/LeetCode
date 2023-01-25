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
    public boolean isSymmetric(TreeNode root) {
        boolean result = true;

        if(root != null){
            result = isSymmetric(root.left, root.right);
        } 

        return result;
    }

    public boolean isSymmetric(TreeNode leftPart, TreeNode rightPart){
        if(leftPart == null && rightPart == null) return true;
        if(leftPart == null || rightPart == null) return false;
        if(leftPart.val != rightPart.val) return false;
        return isSymmetric(leftPart.left, rightPart.right) && isSymmetric(leftPart.right, rightPart.left);

    }

}