//Time Complexity: O(n)
//Space Complexity: O(n) as all the elements in the array are updated in the map. 
//LeetCode : Yes

//Calculate the running sum by adding index. Calculate the compliment. 
//If compliment exists in the map - increase the count with the value at the compliment key
//Update the map with the rsum and the index and the increment of the rsum

class Solution {
    public int subarraySum(int[] nums, int k) {
        //base
        if(nums == null || nums.length ==0)return -1;
        
        int count=0, rSum = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        
        for(int i =0;i<nums.length; i++){
        rSum+=nums[i];
            int compliment = rSum -k;
            if(map.containsKey(compliment))count+=map.get(compliment);
            if(!map.containsKey(rSum))map.put(rSum,1);
            else {map.put(rSum, map.get(rSum) + 1);}
            
        }
        return count;
    }
}