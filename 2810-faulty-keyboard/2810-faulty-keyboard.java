class Solution {
    public String finalString(String s) {
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) != 'i'){
                s1+=Character.toString(s.charAt(i));
            }
            if(s.charAt(i)=='i'){
                String s2="";
                for(int j=s1.length()-1;j>=0;j--){
                    s2+=Character.toString(s1.charAt(j));
                }
                s1=s2;

            }
        }
        return s1;
    }
}