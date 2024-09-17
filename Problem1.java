import java.util.HashMap;

// Time Complexity : O(n) Where n is the number of elements in the array
// Space Complexity : O(n) to hold the subarray sum
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

public class Problem1 {

    public int subArraySum(int[] arr, int k) {
        int count = 0;
        int result = 0;
        // Hashmap to store sum and count of its occurence
        HashMap<Integer, Integer> map = new HashMap<>();
        // For sum 0 there is 1 occurence
        map.put(0, 1);
        for(int i=0; i<arr.length; i++){
            result += arr[i];
            if(map.containsKey(result-k)) {
                count += map.get(result-k);
            }
            map.put(result, map.getOrDefault(result, 0)+1);
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 5};
        int k = 5;
        Problem1 obj = new Problem1();
        System.out.println(obj.subArraySum(arr, k));
    }

    
}