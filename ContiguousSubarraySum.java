// Time Complexity : O(n) where n is the length of input
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

public class ContiguousSubarraySum {
        public int subarraySum(int[] nums, int k) {

            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,1);

            int rsum = 0;
            int result = 0;

            for(int i=0; i<nums.length ; i++){
                rsum += nums[i];

                //if map contains the key for rsum-k
                if(map.containsKey(rsum-k)){
                    result = result + map.get((rsum-k));
                }

                //if mp does not have, add rsum key and add 0 as value for it
                if(!map.containsKey(rsum)){
                    map.put(rsum ,0);
                }

                //update correct value for rsum in set
                map.put(rsum, map.get(rsum)+1);
            }
            return result;
        }
}
