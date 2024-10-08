class Solution {
    public int minSwaps(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='['){
                st.push('[');
            }
            else{
                if(st.isEmpty()||st.peek()==']')
                    st.push(ch);
                else{
                    st.pop();
                }
            }
        }
        
            return( st.size()/2+1)/2;
        
        
        
    }
}