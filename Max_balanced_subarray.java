//TC - O(n)  iterating through the nums array to find the rsum or count
//SC - O(n)  for hashmap if all the array elements are same 
//leetcode successful

// Description: The array present between same rsum is balanced.
//store the first occuring rsum in the map and find the subarray of balanced values inbetween the same rsum by subtracting it from the index 


class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int rsum=0;
        int max =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                rsum--;
            else 
                rsum++;
            if(!map.containsKey(rsum))
                map.put(rsum,i);
            else 
                max = Math.max(max,i-map.get(rsum));
        }
        return max;
        }
    }

