// Time Complexity : O(n) walk the array once to get all sums
// Space Complexity : O(n) adding sum upto all n numbers in array.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
  //finding simillarty between this and sub array sum= k problem.
  //in this case we have k = 0, by replacing 0 in array with -1.
// Your code here along with comments explaining your approach
  //create a hashmap of sum (elem at i + all elem before it,also add -1 for 0's)
  //and the first index of that count.
  //since we are replacing the 0's with -1's, we need to check
  //if sum - 0 has been seen before.(if we have same 0's(replaced by -1's) and
  //1's, total should be 0)
  //so if target has been seen before we know length is current indx - cnt indx.

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> countmp = new HashMap<>();
        countmp.put(0,-1);
        int cnt = 0;
        int max = 0;
        for(int i = 0 ; i < nums.length; i++){
            cnt += nums[i] == 0? -1: 1;
            if(countmp.containsKey(cnt)){
                max = Math.max(max, i-countmp.get(cnt));
            }
            else{
                countmp.put(cnt, i);
            }
        }
        return max;
    }
}
