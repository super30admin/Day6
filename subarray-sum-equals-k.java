//Time Complexity: O(n), where n is the number of integers in the array
//Space Complexity: O(n)
//running on leetcode: yes
class Solution {
    public int subarraySum(int[] nums, int k) {
        //base case
        if (nums==null || nums.length==0)
        {
            return 0;
        }
        int count = 0;
        int rSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i=0; i<nums.length; i++)
        {
            rSum+=nums[i];
            int diff = rSum-k;
            //if map contain diff value
            if (map.containsKey(diff))
            {
                //increase count by the value of the diff key
                count += map.get(diff);
            }
            map.put(rSum, map.getOrDefault(rSum, 0)+1);
            /* 
            if (map.contains(rSum)){
            map.put(rSum, map.get(rSum)+1) //map.get(rSum) gives the frequency of the rSum
            //map.get(rSum)+1 updates the frequency of the rSum because it appeared again
            }
            else//rSum is not there in the map
            {
                map.put(rSum, 1)
            }
            */
        }
        return count;
        
    }
}
