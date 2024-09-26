// Time Complexity : 0(N)
// Space Complexity :0(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No, as the video was great


// Your code here along with comments explaining your approach


class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        int runningsum = 0;
        int count = 0;
        map.put(0,1);

        for(int i = 0; i < nums.length; i++){
            runningsum += nums[i]; // calculating running sum to get the subarray
            if(map.containsKey(runningsum - k)){
                count += map.get(runningsum - k); // getting the compliment by subtracting the target from the runningsum

            }

               if(map.containsKey(runningsum)){

                   map.put(runningsum, map.get(runningsum) + 1); // incrementing value  by 1 if the map conatains the runningsum as a key
               }
                else{
                    map.put(runningsum,1); // if it does not then initialize it with 1
                }



        }
        return count; // return the count to get the size of the subarray possible
    }
}