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
    static List<Integer> list=new ArrayList<>();

    static int level_ord(TreeNode root,int level,int find_node,int max){
        if(root==null){
            return max;
        }
        if(level==find_node){
            max=Math.max(max,root.val);
            }
        max=Math.max(max,level_ord(root.left,level+1,find_node,max));
        max=Math.max(max,level_ord(root.right,level+1,find_node,max));
        return max;
    }
     static void level_tree(TreeNode root,int height){
        
        
        for(int i=0;i<height;i++){
            list.add(level_ord(root,0,i,Integer.MIN_VALUE));
            
        }
        return ;
    }
    static int MaxHeight(TreeNode root){
        if(root==null)
        return 0;
        return 1+Math.max(MaxHeight(root.left),MaxHeight(root.right));
    }
     public List<Integer> largestValues(TreeNode root) {
        list.clear();
        if(root==null){
            return list;
        }
        int l=MaxHeight(root);
        
       
        level_tree(root,l);
        return list;
    }
   
}