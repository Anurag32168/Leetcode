//we can solve this by two slidding wwindow
class Solution {
    public int[] decrypt(int[] code, int k) {
        int arr[]=new int[2*code.length];
        int temp[]=new int[code.length];
        // start 
        for(int i=0;i<code.length;i++){
                arr[i]=code[i];
        }
            int next_sum=0;
        for(int i=0;i<code.length;i++){
           arr[code.length+i]=code[i];
        }
        //!!!!!!!!!!
        if(k>0){for(int i=0;i<code.length;i++){
            int nextsum=0;
            for(int j=i+1;j<=i+k;j++){
                nextsum+=arr[j];
               
            }
            temp[i]=nextsum;
            }
        }
        if(k<0){
            int l=0;
            for(int i=code.length;i<arr.length;i++){
            int presum=0;
            k=Math.abs(k);
            for(int j=i-k;j<i;j++){
                presum+=arr[j];
               
            }
            temp[l++]=presum;
            }
        }
        return temp;
    }
}
// //slidding window 1
//         if(k>0){
//             int sum=0;
//             for(int i=0;i<k;i++){
//                 sum+=code[i];
//             }
//             for(int i=1;i<code.length-k;i++){
//                 arr[i-1]= sum-code[i-1]+code[]
//             }
//         }
// if(k==0)
        //     return temp;
        // if(k>0){
        //     for(int i=0;i<code.length;i++){
        //         arr[i]=code[i];
        //     }
        //     int next_sum=0;
        //     for(int i=0;i<code.length;i++){
        //        arr[code.length+i]=code[i];
        //     }
        //     //adding next sum
        //     for(int i=1;i<=k;i++){
        //         next_sum+=arr[i];
        //     }
        //     temp[0]=next_sum;
        //     int  j=1;
        //     for(int i=k;i<code.length+k;i++){
        //         next_sum=next_sum-arr[i-k]+arr[i];
        //         if(j==temp.length)
        //         break;
        //         temp[j++]=next_sum;
        //     }
            
        // }   
        // return temp;