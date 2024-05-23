public class SubArraySumEqualsK {
}

/**
 L.C: 560.Subarray Sum Equals K

 Approach: Using running sum and hash map {key->rSum, value-> count of occurrence of rSum}

 Working:
 set rSum=0, count=0
 calculating r sum iteratively,
 if the difference of rSum and k is already seen in the hash map
 then there exist an subarray which is equal to k from rSum-k to current sum
 add the rSum in the map, increment its count for each occurrence
 return count

 Base Case: add {key->0, val->1} in the map, to find the first most occurrence of the sub array

 */


class Solution {
    public int subarraySum(int[] nums, int k) {

        if(nums == null || nums.length == 0) {
            return 0;
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        int rSum = 0;
        int count = 0;
        map.put(rSum, 1); // base case
        for(int i=0;i<nums.length; i++) {

            rSum+= nums[i];

            /*
                The below condition ensures that there is an subarray with sum equal to k
                form rSum-K - index to the current index
             */
            if(map.containsKey(rSum-k)) {
                count+= map.get(rSum-k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0)+1); //update the rsum occurrence count

        }

        return count;

    }
}