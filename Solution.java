// Time Complexity: O(n) where n is the number of elements in the input array
// Space complexity: O(n) where n is number of keys in hashmap
Class Solution {
    public int subarraySum(int[] nums, int k) {
        //Edge cases
        if(nums.length < 1  || nums.length > 20000 ){
            return 0;
        }
        
        int count = 0;
        int sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>(); // Taking sum as the key and value as the count
        
        map.put(0,1); //Initially we will have the sum is 0 and the count of it as 1
        
        for(int i = 0; i<nums.length; i++){ // Iterating through each element of array
            sum += nums[i]; // Adding the element to the previous sum
            int diff = sum-k; // This gives us how much more we need to add to existing sum to get the target sum
            if(map.containsKey(diff)){ // If the difference is already in map then increase the count
                count += map.get(diff); 
            }
            if(map.containsKey(sum))
                map.put(sum, map.get(sum)+1);
            else
                map.put(sum, 1);
        }
        
        return count;
    }
    
}
