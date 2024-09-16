class Solution {
    // Brute force approach
    // Time Complexity: O(n) where n is number of elements in the array
    public int findMaxLength(int[] nums) {

// If array is null then return 0
        if(nums==null || nums.length==0)
        {
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

// This is added to the hashmap to deal situations when first element of the array is 0.
// This means that at index -1 the sum is 0.
        map.put(0,-1);
        int sum = 0;
        int max = 0;
        for (int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum-=1;
            }

            if(nums[i]==1)
            {
                sum+=1;
            }
// When same sum is added to the map this indicates that there is a pair.
// Index of current value where the sum is already a part of map - when the same sum was encountered indiactes the length of max pair
            if(map.containsKey(sum))
            {
                max = Math.max(max, i-map.get(sum));
            }
            // If this sum is not part of map then add it to the corresponsing index to the map
            else {
                map.put(sum,i);
            }
        }

        return max;// return max of contigous pair of 0,1
    }      
    
}
