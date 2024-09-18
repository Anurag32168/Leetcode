class Solution {
    public String largestNumber(int[] nums) {
        String arr[]=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            String str=Integer.toString(nums[i]);
            arr[i]=str;
        }
        Arrays.sort(arr,(a,b)->(b+a).compareTo(a+b));
        if(arr[0]=="0")
        return "0";
        String s="";
        for(int i=0;i<nums.length;i++){
            s+=arr[i];
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(0)=='0')
                return "0";
        }
        return s;
        
    }
}