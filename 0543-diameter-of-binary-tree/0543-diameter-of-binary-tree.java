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
    static int max1=0;
    static int find_level(TreeNode root){
        if(root==null)
        return 0;
        
        return 1+Math.max(find_level(root.left),find_level(root.right));
    }
    static void traverse(TreeNode root){
        if(root==null){
            return ;
        }traverse(root.left);
        traverse(root.right);
        int temp1=find_level(root.left);
        
        int temp2=find_level(root.right);
        
        max1=Math.max(max1,temp1+temp2);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        max1=0;
        if(root==null){
            return 0;
        }
        traverse(root);
        return max1;

    }
}