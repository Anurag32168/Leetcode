class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max1=0;
        int dist=0;
        while(left<=right){
            
            if(height[left]<height[right]){
                int temp=height[left]*(Math.abs(left-right));
                max1=Math.max(max1,temp);
                left++;
               
            }
            else{
                int temp=height[right]*(Math.abs(left-right));
                max1=Math.max(max1,temp);
                right--;
            }
        }
        return max1;
    }
}
/*
int[] left_arr1=new int[height.length];
        int[] right_arr2=new int[height.length];
        int max=height[0];
        for(int i = 1;i<height.length;i++){
            if(max<left_arr1[i])
                left_arr1[i]=max;
        }
        for(int i = 1;i<height.length;i++){
            if(max<left_arr1[i])
                left_arr1[i]=max;
        }
        */