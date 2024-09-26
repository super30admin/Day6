// Time Complexity: O(n) - Loop through all elements of given array
// Space Complexity: O(n) - HashMap gonna take sapce of n

// Approach:
// 	Create a hashmap and loop through all elements of given array.
// 	Caculate the countinuous sum at each element and find the (sum-k).
// 	Check if (sum-k) exists in the map. If yes, then return its value.
// 	Put the continuous sum as the key and increament the existing value by 1.

class Solution {
    public int subarraySum(int[] nums, int k) {
    	//Edge COndition to see if nums is null or empty
        if(nums==null || nums.length<1) return 0;
        
        //Variable Declaraion
        int sum = 0;
        int count =0;
        
        //Declaring the hashmap
        Map<Integer, Integer> hm = new HashMap<>();
        //Inserting the O so as to include the case where the whole array sums to target
        hm.put(0,1);
        
        for(int number : nums){
            //Calculate the continuous sum
            sum += number;
            //Check if (sum-k) exists in hashMap. If yes, increament the count by its value
            if(hm.containsKey(sum-k)) count+=hm.get(sum-k);
            //Put the sum as the key of hashmap and increment the existing value of the key by 1.
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        
        return count;
    }
}