// Time Complexity : O(n) where n is number of integer in array
// Space Complexity : O(n) taken by an auxiliary array to maintain the running some
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : problem in figuring out the better solution


// Your code here along with comments explaining your approach
1. take an array and int sum, maintain that sum in this array . for every 1 increase the     sum by 1 and for every 0 decrease the sum by 1
2. also maintain a Hashmap where we maintain the element and its index 
3. if we find the element in hashmap then by using the z = x-y we calculate the length of the current contagious array
here x = index of element in auxiliary array , y = index of found character in hashset and z = length of current auxiliary array
4. if we don't find the element in hashmap then we simply add that element in map along with its index.



class Solution {
    public int findMaxLength(int[] nums) {
        
        int[] runningSum = new int[nums.length];
        int sum = 0;
        int max = 0;
        HashMap<Integer,Integer> set = new HashMap();

        set.put(0,-1); // sum , index

        for(int i =0; i <= nums.length-1 ; i++)
        {
            if(nums[i] ==1)
                sum++;
            else
                sum--;
            
            runningSum[i] = sum;
        }
        for(int x = 0; x <= nums.length-1 ; x++)
        {
           if(set.containsKey(runningSum[x]))
              {
                int y = set.get(runningSum[x]);
               
                        int z = x - y;
                        max = Math.max(max,z);
                  
              }
            else
            set.put(runningSum[x], x);
        }
        
        return max;
    }
}