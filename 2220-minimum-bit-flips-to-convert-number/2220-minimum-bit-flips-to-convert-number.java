class Solution {
    public int minBitFlips(int start, int goal) {
        String a=Integer.toBinaryString(start);
        String b=Integer.toBinaryString(goal);
        int count=0;
        int max1=Math.max(a.length(),b.length());
        
        while(a.length()<max1)
            a="0"+a;
        while(b.length()<max1)
            b="0"+b;
        for(int i=0;i<max1;i++){
            if(i<a.length() && i<b.length()){
                if(a.charAt(a.length()-1-i)!=b.charAt(b.length()-1-i))
                    count++;
            }
            else count++;
           
        }
        

        
        return count;//+Math.abs(a.length()-b.length());
    }
}