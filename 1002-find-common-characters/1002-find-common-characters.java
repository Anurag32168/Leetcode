/*class Solution {
    public List<String> commonChars(String[] words) {
       char arr1[]=new char[words[0].length()];
        for(int i=0;i<words[0].length();i++){
            arr1[i]=words[0].charAt(i);
        }
        for(int k=1;k<words.length;k++){
            char arr2[]=new char[words[k].length()];
            
            for(int i=0;i<words[0].length();i++){
                int count=0;
                
                for(int j=0;j<words[k].length();j++){
                    arr2[j]=words[k].charAt(j);
                }
                for(int j=0;j<words[k].length();j++){
                    if(arr1[i]==arr2[j]){
                        arr2[j]='0';
                        count++;
                        break;
                    }
                   
                }
                 if(count==0)
                        arr1[i]='0';
            }
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]=='0')
                continue;
            list.add(Character.toString(arr1[i]));
                
        }
        return list;
        
    }
}
class Solution {
    public List<String> commonChars(String[] words) {
        int[] minfreq = new int[26];
        Arrays.fill(minfreq, Integer.MAX_VALUE);
        for (String word: words) {
            int[] freq = new int[26];
            int length = word.length();
            for (int i = 0; i < length; ++i) {
                char ch = word.charAt(i);
                ++freq[ch - 'a'];
            }
            for (int i = 0; i < 26; ++i) {
                minfreq[i] = Math.min(minfreq[i], freq[i]);
            }
        }

        List<String> ans = new ArrayList<String>();
        for (int i = 0; i < 26; ++i) {
            for (int j = 0; j < minfreq[i]; ++j) {
                ans.add(String.valueOf((char) (i + 'a')));
            }
        }
        return ans;
    }
}
*/
class Solution {
    public List<String> commonChars(String[] words){
        String s1=words[0];
        
        for(int i=0;i<words.length;i++){
            char array[]=new char[words[i].length()];
            String s2="";
            for(int j=0;j<words[i].length();j++){
                array[j]=words[i].charAt(j);
            }
            for(int j=0;j<s1.length();j++){
                for(int k=0;k<array.length;k++){
                    if(array[k]=='1')
                    continue;
                    if(s1.charAt(j)==array[k])
                    {
                        s2+=Character.toString(array[k]);
                        array[k]='1';
                        break;
                    }
                }
            }
            
            if(s2.length()<s1.length())
                s1=s2;
            
        }
        List<String> list=new ArrayList<>();
        for(int i=0;i<s1.length();i++){
            list.add(Character.toString(s1.charAt(i)));
        }
        return list;
    }
}