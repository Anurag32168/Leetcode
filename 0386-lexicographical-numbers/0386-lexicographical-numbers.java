class Solution {
    public List<Integer> lexicalOrder(int n) {
        String arr[]=new String[n];

        for(int i=0;i<n;i++){
            arr[i]=String.valueOf(i+1);
        }
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++ ){
            
            list.add(Integer.valueOf(arr[i]));
        }
        return list;

    }
}