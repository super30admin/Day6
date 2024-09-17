// Time Complexity : O(n) walk the array once to get all sums
// Space Complexity : O(n) adding sum upto all n numbers in array.
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :
  //understand relation between cumulative sum and count of cumulative sum.
// Your code here along with comments explaining your approach
  //create a hashmap of sum (elem at i + all elem before it)
  //and number of times that count came up.
  //for each count see if diff between sum and k is seen before.
  //if yes increase the count by number of times count has been seen.if n times
  //there will be n number of times we can have total sum of k in array.
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hmp = new HashMap<>();
        hmp.put(0,1);
        int cnt = 0;
        int sum = 0;
        for(int num : nums){
            sum += num;
            int diff = sum - k ;

            if(hmp.containsKey(diff)){
                cnt += hmp.get(diff);
            }
            hmp.put(sum, hmp.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }
}
