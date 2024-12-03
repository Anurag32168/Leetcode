class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        ArrayList<String> list=new ArrayList<>();
        String[] arr=sentence.split(" ");
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<Math.min(arr[i].length(),searchWord.length());j++){
                if(arr[i].charAt(j)!= searchWord.charAt(j))
                    break;
                count++;
            }
            if(count==searchWord.length())
            return i+1;
        }
        return -1;
    }
}