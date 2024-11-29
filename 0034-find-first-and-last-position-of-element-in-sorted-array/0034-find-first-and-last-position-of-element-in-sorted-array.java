class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start=0;
        int end=0;
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && start==0){
                start=1;
                arr[0]=i;
            }
            if(nums[i]==target){
                arr[1]=i;
            }
        }
        if(start==0)
        {
            arr[0]=-1;
            arr[1]=-1;
        }
        return arr;
    }
}