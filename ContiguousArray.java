import java.util.HashMap;

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Maintain a hashmap which maps runningsum to index value at which the running sum is found.
// Find the max length of array by subtracting the index value from value of index of running sum in hashmap

public class ContiguousArray {
        public int findMaxLength(int[] nums) {
            int max = 0;
            int rsum = 0;
            HashMap<Integer, Integer> hmap = new HashMap<>();
            hmap.put(0,-1);
            for(int i=0;i< nums.length;i++){
                if(nums[i] == 0){
                    rsum -=1;
                }else if(nums[i] == 1){
                    rsum +=1;
                }
                if(hmap.containsKey(rsum)){
                    if(max < i-hmap.get(rsum)){
                        max = i-hmap.get(rsum);
                    }
                }else{
                    hmap.put(rsum, i);
                }

            }
            return max;
        }

}
