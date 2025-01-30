// Overall Time Complexity : O (n) . The n is number of elements in the array.
// Overall Space Complexity : O(n) . The space complexity of storing the running sum  in hashmap if all the sums are unique.
// Any problem you faced while coding this : No issues faced during implementation


// The solution to the problem involves creating a HashMap where the running sum is the key and the index is the value.
// The above logic ensures the subarray has an equal number of zeros and ones. 
// If the HashMap contains the running sum, subtract the earlier index from the current index to get the maximum subarray length.

import java.util.*;
class ContingousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int res = 0;
        int rsum = 0;
        hmap.put(0,-1);
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 0){
                rsum--;
            }
            else{
                rsum++;
            }
            if(hmap.containsKey(rsum)){
                res  =  Math.max(res,i - (hmap.get(rsum)));
            }
            else{
                hmap.putIfAbsent(rsum, i);
            }
            
        }
        return res;
        
    }
}
