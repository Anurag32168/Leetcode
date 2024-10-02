import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) {
            map.put(num, 0);
        }
        
        List<Integer> uniqueValues = new ArrayList<>(map.keySet());
        Collections.sort(uniqueValues);
        
        for (int i = 0; i < uniqueValues.size(); i++) {
            map.put(uniqueValues.get(i), i + 1); 
        }
        
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = map.get(arr[i]); 
        }

        return result;
    }
}

