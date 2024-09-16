//time complexity: O(n)
//space complexity: O(n)
// Did this code successfully run on Leetcode : Yes


class Solution {
    public int findMaxLength(int[] nums) {
        
    	/* the logic is to use the running sum pattern and add +1 when we encounter 1 and perform -1 when
    	 * we get 0. IF the hashmap already contains that sum then we find the first occurrence of the same element
    	 * and subtract it from the recent most occurrence to get the length of the balanced subarray
    	 * This way we calcuate the max length of the subarray possible 
    	 * 
    	 */
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1); //to detect the initial sub array 
        
        int sum=0; 
        int lenArr=0; 
        int max=0;
        
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] == 0)
                sum--; 
            else 
                sum++; 
            
            if(map.containsKey(sum)){
                lenArr = i - map.get(sum);
                max = Math.max(max, lenArr);
            }else 
                map.put(sum, i);
        }
        return max; 
    }
}

