class Solution {
    public boolean isGood(int[] nums) {
        int max=nums[0];
        if(nums.length==1)
        return false;
        if(nums.length==2)
        {
            if(nums[0]!=1)
            return false;
            if(nums[0]==nums[1])
            return true;
        }
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length-1;i++){
            if(nums[i] != i+1)
            return false;
        }
        if(nums[nums.length-1] != nums[nums.length-2])
        return false;
        
        
        /*
        if(nums.length-1!=max)
            return false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=i+1)
            return false;
        }
        if(nums[nums.length-1]!=max)
        return false;
*/
        return true;

    }
}