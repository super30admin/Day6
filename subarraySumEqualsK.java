// Time Complexity: Traversing only once through the array, and performing constant operations inside using Map- O(n)
// Space Complexity: Auxilliary Map used which can take length upto length of array O(n)
// Did you complete it at leetcode: Yes
// Any problems faced with this question: Understood in class

// Explain your code here
// Idea here is to traverse the array anc keep adding the summed values to map to identify if any subarray holds sums of target k.
// to do this, we maintain a map with dummy 0,1 in start to handle edge case of inital indexes achieving target and putting count of each sum obtained in map
// we check if we already have a sum value which is equal to new sum value-target identifying there exists a subarray whose sum is = target, we take the count from map and add to existing count of subarrays fulfilling the criteria
// finally total count of subarrays is returned
class Solution {
    public int subarraySum(int[] nums, int k) {
        int rSum = 0;
        int count = 0;
        if(nums==null || nums.length==0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i=0; i<nums.length; i++) {
            rSum+=nums[i];
            if(map.containsKey(rSum-k)){
                count+= map.get(rSum-k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0)+1);
        }
        return count;
    }
}