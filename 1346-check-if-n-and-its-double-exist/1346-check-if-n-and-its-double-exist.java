class Solution {
    public boolean checkIfExist(int[] arr) {
         Arrays.sort(arr);
         int count=0;
        for(int i=0;i<arr.length;i++){
            int key=2*arr[i];
            if(arr[i]==0){
                count++;
            continue;}
            for(int j=arr.length-1;j>=0;j--){
                if(arr[j]==key)
                return true;
                if(arr[j]<key)
                    break;
            }
            

        }
        if(count>1)
        return true;
        return false;
    }
}