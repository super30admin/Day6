//525. Contiguous Array
//Time Complexity: O(n)
//Space Complexity: O(n)
//Algorithm: runningSum(rs), add 1 if '1' else subtract 1 for '0'
//check if rs is in hashmap: No, enter into hashMap => key = rs; value = index
// Yes, len of the subarray = index - earlier value of the key(rs) in the map

class Solution {
    public int findMaxLength(int[] nums) {
        int maxLen = 0;
        int runningSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1)
                runningSum += 1;
            else if(nums[i] == 0)
                runningSum -= 1;

            if(!map.containsKey(runningSum))
                map.put(runningSum, i);
            else
                maxLen = Math.max(maxLen, i - map.get(runningSum));
        }
        return maxLen;
    }
}