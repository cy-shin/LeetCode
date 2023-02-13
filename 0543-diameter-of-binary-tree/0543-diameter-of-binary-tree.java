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
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];

        if(root!=null){
            checkDiameter(root, diameter);
        }

        return diameter[0];
    }

    public int checkDiameter(TreeNode root, int[] diameter){
        if(root==null) return 0;

        int left = checkDiameter(root.left, diameter);
        int right = checkDiameter(root.right, diameter);

        if(diameter[0] < left + right) diameter[0] = left + right;

        return Math.max(left + 1, right + 1);
    }
}