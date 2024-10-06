// class Solution {
//     public void moveZeroes(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]!=0)
//             continue;
//             for(int j=i;j<nums.length-1;j++){
                
//                 nums[j]=nums[j+1];
//             }
//             nums[nums.length-1]=0;
//             for(int j=0;j<nums.length-1;j++){
//                 if(nums[j]==0 && nums[j+1]!=0)
//                 {
//                     i=j-1;
//                     break;
//                 }
            
//         }
            
//         }
//     }
// }
class Solution {
     public void moveZeroes(int[] nums){
        int i=0,j=0;
        while(i<nums.length && j<nums.length){
            if(i>j)
                j=i;
            if(nums[i]==0 && nums[j] != 0)
             {
                nums[i]=nums[j];
                nums[j]=0;
            }
            if(nums[i] != 0)
                i++;
            else if(nums[j] == 0)
                j++;
           
        }
     }

    
}