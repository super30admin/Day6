//Time Complexity: O(n)
//Space Complexity: O(n)
//Compiled on leetcode

class Solution {
    public int findMaxLength(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<>();//Map contains sum and start index of that particular sum.
        int max=0;
        int currSum =0;
        map.put(0,-1);
        
        for(int i=0;i<nums.length;i++)					//Intializing sum as o and index as -1 to start with
        {
            if(nums[i]==0)
                currSum-=1;								//if nums value is o adding -1 to cumilative sum, if 1 adding 1
            else
                currSum+=1;
            if(map.containsKey(currSum))
            {
                int len = i-map.get(currSum);			//if current sum already exists in map we get array length by finding difference b/w current index and start index.
                if(len>max)								//if array len is greater than max value, it will be replaced with array len.
                    max=len;
            }
            else
                map.put(currSum,i);						
        }
        
        return max;
    }
}