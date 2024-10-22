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
    //ArrayList<List<Integer>> list=new ArrayList<>();
    static List<Integer> trav(TreeNode root,int idx,int find,List<Integer> list_temp){
        if(root==null)
        return list_temp;
        if(idx==find)
            list_temp.add(root.val);
        trav(root.left,idx+1,find,list_temp);
        trav(root.right,idx+1,find,list_temp);
        return list_temp;
    }
    static List<Integer> store(TreeNode root,int level_len,List<Integer> list){
        ArrayList<Integer> list_temp=new ArrayList<>();
        for(int i=0;i<level_len;i++){
            trav(root,0, i,list_temp);
            if(list_temp.size()!=0)
                list.add(list_temp.get(list_temp.size()-1));

        }
        return list;

    }

    static int level(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(level(root.left),level(root.right));
    }

    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list1=new ArrayList<>();
        if(root==null)
            return list1;
        int lev_leng=level(root);
        return store(root, lev_leng,list1);


    }
}