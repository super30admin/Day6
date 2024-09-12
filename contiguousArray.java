// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : Yes I have problem to keep previos track of  of 0 and 1

import java.util.HashMap;

class Main {

    public static int findMaxLength(int[] nums) {

        // here we are using hashmap to make a track of prefix sum
        HashMap<Integer, Integer> map = new HashMap<>();

        int result = 0;
        int sum = 0;
        // here we are traverse through all the nums in the array
        for (int i = 0; i < nums.length; i++) {

            // to keep track of previous 0 and 1 I am going to add -1 to sum if element is 0
            // else add +1
            sum += nums[i] == 0 ? -1 : 1;

            // if sum = 0 that means number of 1s and 0s till now is equal. We are here
            // store maximum length of subarry
            if (sum == 0)
                result = Math.max(result, i + 1);

            // here we check sum is encoutered first or not and use corresponding index to
            // find the max length
            if (map.containsKey(sum)) {

                // if sum is encountered previosly then it means that from that index number of
                // 1s and 0s are same So, we are going to update the result with maxlength
                result = Math.max(result, i - map.get(sum));
            } else {

                // else we make an entry of sum in map
                map.put(sum, i);
            }

        }

        // return result
        return result;
    }

    public static void main(String[] args) {

    }
}