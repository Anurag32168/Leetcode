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
    // static TreeNode trav(TreeNode root,int val , TreeNode temp){
    //     if(root==null)
    //     return null;
    //     if(root.val==val){
    //         temp=root;
    //         return root;
            
    //         }
    //     trav(root.left,val,temp);
    //     trav(root.right,val,temp);
    //     return temp;
    // } 
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;
        if(root.val==val)
            return root;
        else if(root.val>val)
            return searchBST(root.left,val);
        else
            return searchBST(root.right,val);
    }
}