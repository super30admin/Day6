// Time Complexity :O(n) n is nums length
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yeah faced problem calculating Time n Space complexity. looking for more efficient approach.


// Your code here along with comments explaining your approach

1. y = x-z  where z = runningSum in rSum Array , z = given target i.e K and Y in element( running sum) in hashmap
2. check if y (rSum -k) exist in hashmap if yes them increment count by it values in hashmap
3. if doesnot exist then add runsum element in hashmap with value 1;
4. finally return count;




class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
       
        int[] runningSum = new int[nums.length];
        HashMap<Integer, Integer> set = new HashMap<>();
        set.put(0,1); // running sum , no of times appreaed in runningsum array
        
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
           sum = sum + nums[i];
            runningSum[i] = sum;
        }
       
        for(int j = 0 ; j < runningSum.length ; j++)
        {
            int y = runningSum[j] - k; // y = x-z where x = running sum z = target i.e k
            
            if(set.containsKey(y))
            {
                count = count + set.get(y);
               //  set.put(y, set.get(y) +1);
            }
           // else 
                set.put(runningSum[j],set.getOrDefault(runningSum[j],0) + 1);
        }
        
        return count;
    }
}