class Solution {
    public int countPairs(List<Integer> nums1, int target) {
        int nums[]=new int[nums1.size()];
        for(int i=0;i<nums1.size();i++){
            nums[i]=nums1.get(i);
        }
        //Arrays.sort(nums);
        int count=0;
        for(int i=0;i<nums.length;i++){
            // if(nums[i]>target)
            //     break;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]<target)
                count++;
            }
        }
        return count;
    }
}