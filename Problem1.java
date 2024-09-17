/*Algorithm:
    1. Traverse through the array, calculate the running sum for each element.
    2. If the running sum - target which is compliment key is already in the hashmap, then get the value associated with the compliment key and add it to the count value;
    3. If the running sum is not in the hashmap then add it to hashmap and pair it with a value 1, If the running sum key is already in the hashmap then increment the value of the existing value at the key by 1.
    
    Time Complexity: O(n)
    Space Complexity: O(n)
    
    Did the code run successfully on leetcode? Yes
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int sum=0;
        Map<Integer, Integer> map = new HashMap<>();
        int count=0;
        
        map.put(0,1);
        
        for(int num: nums){
            sum+=num;
            if(map.containsKey(sum-k))
                count+=map.get(sum-k);
            if(map.containsKey(sum))
                map.put(sum, map.get(sum)+1);
            else
                map.put(sum,1);
            
            
        }
        return count;
    }
}