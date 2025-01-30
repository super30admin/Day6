// Overall Time Complexity : O (n) . The n is number of elements in the array.
// Overall Space Complexity : O(n) . The space complexity of storing the running sum  in hashmap if all the sums are unique.
// Any problem you faced while coding this : No issues faced during implementation


// The solution to the problem involves creating a HashMap where the running sum is the key and the frequency of its occurrences is the value.

import java.util.*;
class Subarray {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0){
            return 0;   
        }
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int res = 0;
        int rsum = 0;
        hmap.put(0,1);
        for(int i=0; i<nums.length; i++){
            rsum += nums[i];
            if(hmap.containsKey(rsum-k)){
                res += hmap.get(rsum-k);
            }
            
            hmap.put(rsum,hmap.getOrDefault(rsum,0)+1);
            
        }
        return res;

}
}