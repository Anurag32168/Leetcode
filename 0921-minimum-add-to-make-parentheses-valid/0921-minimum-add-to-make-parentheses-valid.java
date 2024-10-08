class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(ch);
            }
            else if(!st.isEmpty()){
                    if(st.peek()=='('&& ch==')')
                        st.pop();
                    else if(st.peek()==')'&& ch==')')
                        st.push(ch);

            }
            else
                st.push(ch);

        }
        return st.size();
    }
}