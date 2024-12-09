class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
                if(map.get(nums[i])==2)
                    list.add(nums[i]);

                
            }
            else{
                map.put(nums[i],1);
            }
        }
        return list;
    }
}