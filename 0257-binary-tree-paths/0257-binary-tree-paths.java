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

    static List<String> treePaths(TreeNode root,String str,List<String> list){
        
        if(root==null){
            return list;
        }
        if(root.left==null && root.right==null)
        {
            str+="->"+String.valueOf(root.val);
            list.add(str);
            return list;
        }
        str+="->"+String.valueOf(root.val);
        treePaths(root.left,str,list);
        treePaths(root.right,str,list);
        //list.add(str);
        return list;
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> list=new ArrayList<>();
        if(root==null)
            return list;
        if(root.left==null && root.right==null)
        {
            list.add(String.valueOf(root.val));
            return list;
        }
         String str=String.valueOf(root.val);
        treePaths(root.left,str,list);
        // list.add(str);
        // str=String.valueOf(root.val);
        treePaths(root.right,str,list);
        // list.add(str);
        return list;
    }
}