class Solution {
    public int findMaxLength(int[] nums) {
        int ans=0;
        int one=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
      
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                one++;
            else one--;

            if(map.containsKey(one))
                ans=Math.max(ans,i-map.get(one));
                else
                map.put(one,i);

            
        }
        return ans;
    }
}