class Solution {
    public int minimumSum(int num) {
        int arr[]=new int[4];
        int i=0;
        while(num!=0){
            int temp=num%10;
            num=num/10;
            arr[i++]=temp;
        }

        int num1=0;
        Arrays.sort(arr);
        if(arr[0]==0){
            num1=arr[3];
        }else{
            num1=arr[0]*10+arr[3];
        }
        int num2=0;
        if(arr[1]==0){
            num2=arr[2];
        }else{
            num2=arr[1]*10+arr[2];
        }
        
        return num1+num2;
    }
}