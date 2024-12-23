class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        char arr[]=new char[map.size()];
        int nums[]=new int[map.size()];
        int i=0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            arr[i]=e.getKey();
            nums[i]=e.getValue();
            i++;
        }
        StringBuilder sb=new StringBuilder();
        for(i=0;i<nums.length;i++){
            int max=nums[i];
            for(int j=0;j<nums.length;j++){
                if(max<nums[j])
                    max=nums[j];

            }
            for(int j=0;j<arr.length;j++){
                if(nums[j]==max){
                    for(int k=0;k<max;k++){
                        sb.append(Character.toString(arr[j]));
                    }
                    nums[j]=Integer.MIN_VALUE;
                }
            }
        }
        return sb.toString();
        
    }
}