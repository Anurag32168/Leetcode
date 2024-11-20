class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        if (nums.length < k) 
            return 0; 
        // ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        long Maxsum=0;
         long current=0;
        for(int i=0;i<k;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            current+=nums[i];
        }
       
        if(map.size()==k)
            Maxsum=current;
        
        
        for(int i=k;i<nums.length;i++){
            map.put(nums[i-k],map.getOrDefault(nums[i-k],0)-1);
            if(map.get(nums[i-k])==0)
                map.remove(nums[i-k]);
        
            current=current+nums[i]-nums[i-k];
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            
            
            if(map.size()==k)
                Maxsum=Math.max(current,Maxsum);
        }
        
       return Maxsum;
    }
}