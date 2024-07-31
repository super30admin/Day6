//TC: O(N)
//SC: O(N)
//Approach: Maintain a map of running sums - key and their number of occurance as value. Need to find the total count of occurances of rsum - k in the map. Increment total count by number of occurance of the rsum - k in the map.

class Solution {
    public int subarraySum(int[] nums, int k) {
        int total =0; int rsum =0;
        HashMap<Integer,Integer> map = new HashMap();
        map.put(0,1);

        for(int i=0;i<nums.length;i++){
            rsum += nums[i];
            if(map.containsKey(rsum-k)) 
                total += map.get(rsum-k);

            map.put(rsum, map.getOrDefault(rsum,0)+1);
        }
        return total;
    }
}