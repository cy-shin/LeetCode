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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nodeValueList = new ArrayList<>();

        if(root!=null){
            preorderTraversal(nodeValueList, root);
        }

        return nodeValueList;
    }

    public void preorderTraversal(List<Integer> nodeValueList, TreeNode root){
        if(root==null) return;

        nodeValueList.add(root.val);

        if(root.left!=null) preorderTraversal(nodeValueList, root.left);
        if(root.right!=null) preorderTraversal(nodeValueList, root.right);
    }
}