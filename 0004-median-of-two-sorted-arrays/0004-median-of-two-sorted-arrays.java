/*class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int i;

        for(i=0;i<nums1.length;i++){
                arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[i++]=nums2[j];
        }
        double k;
        int j=arr.length;
        if(arr.length%2!=0){
            i=(j+1)/2;
            k=arr[i]; 
            return k;
        }
        else {
            j=j/2;
            k=(arr[j]+arr[j+1])/2;
             return k;
        }
       
       
    }
}
*/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length+nums2.length];
        int i;

        for(i=0;i<nums1.length;i++){
                arr[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr[i++]=nums2[j];
        }
        double k;
        Arrays.sort(arr);
        int j=arr.length;
        if(arr.length%2!=0&&j!=0){
            i=j/2;
            k=arr[i]; 
            return k;
        }
        else {
            j=j/2;
            k=(arr[j-1]+arr[j])/2.0;
             return k;
        }
       
       
    }
}