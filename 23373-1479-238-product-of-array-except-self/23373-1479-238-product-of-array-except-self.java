class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=1;
        }
        int left=1;
        for(int i=0;i<nums.length;i++){
            arr[i]=arr[i]*left;
            left=left*nums[i];
        }
        left=1;
        for(int i=nums.length-1;i>=0;i--){
            arr[i]=arr[i]*left;
            left=left*nums[i];
        }
        return arr;
    }
}