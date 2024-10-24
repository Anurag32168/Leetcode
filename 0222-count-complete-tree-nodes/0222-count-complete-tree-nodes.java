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
    static int treeNodes(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+treeNodes(root.left)+treeNodes(root.right);
        

    }
    public int countNodes(TreeNode root) {
        if(root==null)
        return 0;
        return treeNodes(root);
        
    }
}