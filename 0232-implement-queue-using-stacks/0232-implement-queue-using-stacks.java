class MyQueue {
    Stack<Integer> st=new Stack<>();
    public MyQueue() {
        st.clear();

    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        Stack<Integer> temp_st=new Stack<>();
        while(st.size()!=0){
            temp_st.push(st.peek());
            st.pop();
        }
        
        int temp= temp_st.peek();
        temp_st.pop();
        while(temp_st.size()!=0){
            st.push(temp_st.peek());
            temp_st.pop();
        }
        return temp;
    }
    
    public int peek() {
        Stack<Integer> temp_st=new Stack<>();
        while(st.size()!=0){
            temp_st.push(st.peek());
            st.pop();
        }
        
        int temp=temp_st.peek();
        
        while(temp_st.size()!=0){
            st.push(temp_st.peek());
            temp_st.pop();
        }
        return temp;
    }
    
    public boolean empty() {
        if(st.size()==0)
        return true;
        else
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */