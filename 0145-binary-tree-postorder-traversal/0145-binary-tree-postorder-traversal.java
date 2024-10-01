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
    ArrayList<Integer> list=new ArrayList<>();
    public void treemeaker(TreeNode posto){
        if(posto==null)
        return ;
        treemeaker(posto.left);
        treemeaker(posto.right);
        list.add(posto.val);
        
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        list.clear();
        treemeaker(root);
        return list;
    }
}