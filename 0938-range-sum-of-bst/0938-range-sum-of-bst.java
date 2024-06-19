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
    static ArrayList<Integer> list=new ArrayList<>();
    public void print(TreeNode root){
        if(root==null)
        return ;
        list.add(root.val);
        print(root.left);
        print(root.right);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        list.clear();
        print(root);
        //Collections.sort(list);
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=low && list.get(i)<=high)
            sum+=list.get(i);
        }
        return sum;
    }
}