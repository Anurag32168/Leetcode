class Solution {
    public long minimumSteps(String s) {
        // int flag=0;
        // int arr[]=new int[s.length()];
        
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='1')
        //     arr[i]=1;
        //     else
        //     arr[i]=0;
        // }
        // flag=0;
        // int count=0;
        // while(true){
        //     for(int i=0;i<s.length()-1;i++){
        //     if(arr[i]==1 && arr[i+1]==0){
        //         arr[i]=0;
        //         arr[i+1]=1;
        //         count++;
        //         flag++;
        //     }
            
        //     }
        //     if(flag==0)
        //     break;
        //     flag=0;
        // }
        long one=0,zero=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0')
                zero+=one;
            else 
                one++;

        }
        return zero;
    }
}