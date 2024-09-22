import java.util.ArrayList;
import java.util.List;

class Solution {
    static List<List<Integer>> list = new ArrayList<>();
    
    static void func(boolean[] arr, int[] nums, List<Integer> list1) {
        if (list1.size() == nums.length) {
            
            list.add(new ArrayList<>(list1));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!arr[i]) { 
                arr[i] = true;
                list1.add(nums[i]);
                func(arr, nums, list1);
                arr[i] = false; // backtrack
                list1.remove(list1.size() - 1); //list1.clear();
            }
        }
    }
    
    public List<List<Integer>> permute(int[] nums) {
        list.clear(); 
        boolean[] arr = new boolean[nums.length]; 
        List<Integer> list1 = new ArrayList<>();
        func(arr, nums, list1); 
        return list; 
    }
}
