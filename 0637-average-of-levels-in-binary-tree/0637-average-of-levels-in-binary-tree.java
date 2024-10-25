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
    static List<Double> list=new ArrayList<>();
    static int  max_lavel(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(max_lavel(root.left),max_lavel(root.right));
    }
    static List<Integer>  traverse(TreeNode root,int lavel,int find_lavel,List<Integer> l){
        if(root==null)  
            return l;
        if(lavel==find_lavel){
            l.add(root.val);

            }
        traverse( root.left, lavel+1, find_lavel, l);
        traverse( root.right, lavel+1, find_lavel, l);
        return l;
    }

    static List<Double> lavel_trav(TreeNode root,int lav){
        for(int i=0;i<lav;i++){
            List<Integer> l=new ArrayList<>();
            traverse( root, 0, i, l);
            double sum=0;
            for(int j=0;j<l.size();j++){
                sum+=l.get(j);
            }
            list.add(sum/l.size());
        }
        return list;
    }
    public List<Double> averageOfLevels(TreeNode root) {
        list.clear();
        if(root==null) 
            return list;
        int max_l=max_lavel(root);
        return lavel_trav( root, max_l);

    }
}