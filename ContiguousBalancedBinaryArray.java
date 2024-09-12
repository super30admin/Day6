// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
/* APPROACH:
1. for every 0 encountered, we decrease the sum by 1 and for every 1, we increase the sum by 1.
2. following the pattern that indexes with same contiguous sum will create a balanced sub-array.
3. maintain a hashmap with the contiguous sum and their index of first occurence, we store indexes to calculate length of the longest contiguous sub array.
4. to handle the edge case, we save sum 0 at index -1.
*/

import java.util.HashMap;

public class ContiguousBalancedBinaryArray {

    public static int findMaxLength(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        if(null == nums || nums.length == 0) return -1;
        map.put(0,-1);
        int sum = 0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                sum += 1;
                if(map.containsKey(sum)){
                    max = (i-map.get(sum) > max) ? i-map.get(sum) : max;
                }else{
                    map.put(sum, i);
                }
            } else {
                sum -= 1;
                if(map.containsKey(sum)){
                    max = Math.max(i - map.get(sum), max);
                }else{
                    map.put(sum, i);
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums1 = {0,1};
        System.out.println(findMaxLength(nums1)); //2

        int[] nums2 = {0,1,0};
        System.out.println(findMaxLength(nums2)); //2

    }
}
