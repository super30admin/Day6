
    // Time Complexity : o(n) The entire nums array is traversed only once.
    // Space Complexity : o(n) Hashmap can contain up to n distinct entries in the worst case.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public int subarraySum(int[] nums, int k) {
            if (nums == null || nums.length ==0 ) return 0;
            int count = 0;
            int returnInt = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            map.put(0,1);

            for (int i = 0; i < nums.length; i++){
                count+= nums[i];
                if (map.containsKey(count-k)){
                    returnInt = returnInt + map.get(count-k);
                }
                if(map.containsKey(count)){
                    map.put(count,map.get(count)+1);

                }
                else{
                    map.put(count,1);
                }


            }
            return returnInt;

        }
    