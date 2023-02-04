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
    public int minDepth(TreeNode root) {
        int minDepth = 0;

        if(root!=null){
            minDepth = minDepth(1, root);
        }

        return minDepth;
    }
    
    public int minDepth(int depth, TreeNode root){
        if(root==null) return 0;

        int leftDepth = minDepth(depth, root.left);
        int rightDepth = minDepth(depth, root.right);

        if(leftDepth == 0 || rightDepth ==0) {
            depth += Math.max(leftDepth, rightDepth);
        } else {
            depth += Math.min(leftDepth, rightDepth);
        }

        return depth;
    }
}