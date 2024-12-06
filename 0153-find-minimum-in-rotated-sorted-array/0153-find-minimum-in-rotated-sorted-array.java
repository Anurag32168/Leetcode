class Solution {
    public int findMin(int[] nums) {
        int min_val=Integer.MAX_VALUE;

        
        for(int i=0;i<nums.length;i++){
             min_val=Math.min(min_val,nums[i]);
        }
        return min_val;
    }
}