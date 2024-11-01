class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
                map.put(s.charAt(i),1);
        }
        int arr[]=new int[map.size()];
        int max=0;
        int count=0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()%2==0){
                max+=e.getValue();
            }
            else{
                  max+=e.getValue()-1;
                count=1;
            }
        }
        if(count>0)
            return max +1;
        
        return max;
    }
}