import java.util.HashMap;

/** Approach  Running Sum
    Store running sum in a hash map key-sum, value-index of first occurence of sum
    When same sum is encountered, find the length and update maxLength.

    Edge case: eg[0,1,0,1] 
                option 1: store index -1 as sum 0 in hashmap in yh beginning
                option 2: whenevr sum=0 is encountered length of subarray starts from  beginning of array

    Time complexity - O(N), Space Complexity O(N)
 */

 class Solution {
    public int findMaxLength(int[] nums) {
        int max =0;
        if(nums==null || nums.length == 0) return max;
        int sum =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        //update the map wih initial value(sum=0 at index = -1)
        map.put(0,-1);
        for(int i =0;i<nums.length ;i++){

            //set values of running sum iin variable at each index
            if(nums[i]==0) sum--;
            else sum++;

            // check in map - > if new put sum else check maxSum
            // length = i-map.get(sum)
            if(map.containsKey(map.get(sum))){
                max = Math.max(max, i-map.get(sum));
            }
            else map.put(sum,i);
        }
        return max;
    }
}