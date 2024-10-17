/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    static boolean check(TreeNode root,TreeNode data){
        if(root==null)
        return false;
        if(root.val==data.val)
        return true;
        boolean a=check(root.left,data);
        if(a==true)
        return true;
        boolean b=check(root.right,data);
        if(b==true)
        return true;
        return false;

    }
    

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root==p || root==q)
        return root;
        if(check(root.left,p)&& check(root.right,q))
        return root;
        if(check(root.right,p)&& check(root.left,q))
        return root;
        if(check(root.left,p) && check(root.left,q)) 
            return lowestCommonAncestor(root.left,p,q);
        if(check(root.right,p) && check(root.right,q)) 
            return lowestCommonAncestor(root.right,p,q);
        return root;
        

        

    }
}