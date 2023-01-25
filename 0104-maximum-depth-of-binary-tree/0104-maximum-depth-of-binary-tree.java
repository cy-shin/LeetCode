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
    public int maxDepth(TreeNode root) {
        int depth = 0;
        if(root != null){
            depth = findDepth(depth, root);
        }
        return depth;
    }

    public int findDepth(int depth, TreeNode root){
        if(root==null) return depth;
        depth++;
        return Math.max(findDepth(depth, root.left), findDepth(depth, root.right));
    }
}