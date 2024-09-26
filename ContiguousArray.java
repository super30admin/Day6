//Time Complexity: O(n)
//Space Complexity: O(n) if all the elements in the array are happened to be either 1 or 0
//Leet Code: Yes

//Find the running sum - Increment 1 if the next element is 1. Decrement the rsum by 1 if the element is 0;
// Add an entry in the map with key as the rsum and value as the index as the array gets iterated. 
//Calculate the maximum in between the max and the diference of the value at rsum


class Solution {
    public int findMaxLength(int[] nums) {
        if(nums!=  null || nums.length == 0)return -1;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum = 0, max = 0;
        for(int i =0; i<nums.length; i++){
            rSum = rSum +  (nums[i] ==1?1:-1);
            if(map.containsKey(rSum))
            {
                max = Math.max(max, i - map.get(rSum));
            }
            else {map.put(rSum,i);}
                
            
        }
        return max;
    }
}