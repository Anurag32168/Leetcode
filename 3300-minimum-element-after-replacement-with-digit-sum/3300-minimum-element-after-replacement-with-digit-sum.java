class Solution {
    private int min_sum(int nums){
        int temp=0;
        while(nums>0){
            temp+=nums%10;
            nums/=10;
        }
        return temp;
         
    }
    public int minElement(int[] nums) {
        int min1=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            min1=Math.min(min1,min_sum(nums[i]));
        }
        return min1;
    }
}