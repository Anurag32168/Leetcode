class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str=new StringBuilder();
        int idxcounter=0;
        for(int i=0;i<s.length();i++){
            if(idxcounter<spaces.length && i==spaces[idxcounter] ){
                str.append(" ");
                idxcounter++;
            }
            str.append(s.charAt(i));
        }
        return str.toString();
    }
}