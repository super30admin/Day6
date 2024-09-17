// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * 1. Here we take rsum approach. The logic is at each index we will take cummulative sum.
 * 2. Now if we encounter a rsum which has occured before, then index at which occured + 1 to current index forms a subarray with equal 0 and 1.
 * 3. Now in order to use above approach, we do sum + 1 if current element is 1 or sum - 1 if current element is 0.
 * 4. By this, we can easily use step 2.
 * 5. To calculate length of subarray, we need index at which current sum has occured before. So we use hashmap for it.
 * 6. At each step, we calculate rsum. Then we check if current rsum has an entry in hashmap.
 *    If yes, we calculate length between index at which occured + 1 to current index and update len variable as max between current len value and length we calculated.
 *    If no, then we add entry to hashmap with current rsum and index in order for it to use in upcoming iterations.
*/

class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums == null)return -1;
        HashMap<Integer, Integer> sMap = new HashMap<>();
        int sum = 0;
        int len = 0;
        sMap.put(sum, -1);
        
        for(int i = 0; i < nums.length;i++){
            if(nums[i] == 0){
                sum = sum - 1;
            }else{
                sum = sum + 1;
            }
            if(sMap.containsKey(sum) == false){
                sMap.put(sum, i);
            }
            else{
            len = Math.max(len,i - sMap.get(sum));    
            }
            
        }
        return len;
    }
}