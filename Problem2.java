// Time Complexity : O(n) n - length of the input array
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : hints required to proceed from brute to optimal


// Your code here along with comments explaining your approach
//2 approaches used:


//1 approach : using cumulative sum approach:
// Intuition: Difference between 2 cumultive sum are same then there exists a subarray between those which have equal 1's and 0's
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hmap = new HashMap<>();             // (sum -> index)
        hmap.put(0,-1);                                              //initally sum 0 with index -1
        int sum = 0,maxlen = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){                                        // if the input ele is 0 then add -1 to cumulative sum
                sum += -1;
                if(hmap.containsKey(sum)){                          // if that sum already exists before then there was a subarray which nullified the effect of +1 and -1 and got back the same sum
                    maxlen = Math.max(maxlen,i-hmap.get(sum));
                }else                                              // place the sum and index
                    hmap.put(sum,i);
            }else{                                                // same approach for element 1 too
                sum += 1;
                if(hmap.containsKey(sum)){
                    maxlen = Math.max(maxlen,i-hmap.get(sum));
                }else
                    hmap.put(sum,i);
            }
        }
        return maxlen;
    }

    // Approach 2
    // instead of hashing, using an integer array of double the input size(if all inputs are 1) and then calculating the maxdist
    class Solution {
        public int findMaxLength(int[] nums) {
            // Turn 0 into -1
            // Add a 0 as the start point and calculate the accumulation of up and down to differnt levels.
            // Use a map to store the start point of a level
            // This is like to start at 0 and go up when it's 1 and go down when it's 0.
            // Then find the farthest distance between two same levels.

            if (nums.length <= 1) {
                return 0;
            }

            int[] map = new int[nums.length*2 + 1];       //considering if all input ele are 1
            for (int i = 0; i < map.length; ++i) {
                map[i] = -1;                             // assigning everything to the same level -1
            }

            // use the value of nums.length be a start point, instead of 0 so to cover the extream range of [-numslength to numslength]
            // make the start point 0 and thus followed by the nums index + 1
            int level = nums.length;
            map[level] = 0;                               // initializing the lower point at map[nums.length]

            int maxDist = 0;
            for (int i = 0; i < nums.length; ++i) {
                level += nums[i] * 2 - 1;                // so 1 will be 1, 0 will be -1
                if (map[level] == -1) {
                    // the first time reach the level, set the start point
                    map[level] = i + 1;
                } else {
                    // not the first time, calculate the distance from the start point to this point
                    maxDist = Math.max(maxDist, (i + 1) - map[level]);
                }
            }
            return maxDist;
        }
    }
}