class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for(int i=0;i<k;i++){
            int min=nums[0];
            for(int j=0;j<nums.length;j++){
                if(min>nums[j])
                    min=nums[j];
            }

            for(int j=0;j<nums.length;j++){
                if(min==nums[j]){
                    nums[j]= nums[j]*multiplier;
                    break;
                }
            }
        }
        return nums;
    }
}