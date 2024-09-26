// Time Complexity: O(n) - Looping through each element of the aaray
// Space Complexity : O(n) - HashMap of size n

// Approcah:
//     Create HashMap and loop through all elements of Array
//     If nums[i] = 1, increament the sum by 1 else decrement the sum by -1.
//     Calculate the continuous sum at each element and find if there exists any entry in the HashMap.
//     If sum exists, then return max count.

class Solution {
    public int findMaxLength(int[] nums) {
        //Declare variables
        int sum = 0;
        int count = 0;
        
        //Decalare Map 
        Map<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        
        for(int i =0; i<nums.length; i++){
            //Increament sum if nums[i] = 1
            if(nums[i] == 1) sum +=1;
            //Decreament sum if nums[i] = 0
            else if(nums[i] == 0) sum -=1;
            //Check if sum exists as key in hashmap
            if(hm.containsKey(sum)) count = Math.max(count,i-hm.get(sum));
            //Put the sum & index as key & value in hashmap
            else hm.put(sum, i);
        }
        return count;
    }
}