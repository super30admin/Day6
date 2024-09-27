/*Time complexity : O(n)
Space complexity :O(n)
Approach: 
-Calculating consecutive sum by adding elements of array one by one
-storing it in a hashmap the number of times it has occurred
- if at any point the sum-target(k) value equals the keys stored in hashmap(which is consecutive sum) it means
the values in between, sums up to the target and we will add its value from hashmap to the count
 */

import java.util.HashMap;

public class SubarraySumEqualK {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int globalCount = 0, sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            if(map.containsKey(sum-k)){
                globalCount+= map.get(sum-k);
            }
            if(map.containsKey(sum)){
                map.put(sum,map.get(sum)+1);
            }
            else{
                map.put(sum,1);
            }
        }
        return globalCount;
    }

    public static void main(String args[]){
        System.out.println(subarraySum(new int[]{1,1,2,1,1}, 2));
    }
}