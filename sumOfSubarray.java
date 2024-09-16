//Time COmplexity: O(n)
//Space Complexity: O(n)
//The code succesfully compiled on leetcode
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();	//Map to store all the cumilative sum and number of occurance.
        int currSum = 0;
        int count = 0;
        map.put(0,1);
        for(int num:nums)							//Starting map by intializing to 0,1 as intial sum is o and occurance is 1
        {
            currSum+=num;								//Does cumilative sum and check for compliment that is k differnce of currSum is available in map or not.
            int com = currSum - k;
            if(map.containsKey(com))					//If compliment is available incrementing the count by number of occurance of compliment.
                count+=map.get(com);
            map.put(currSum, map.getOrDefault(currSum,0)+1);		//If current sum is available in the map then incrementing occurance counter by 1 if not adding currSum with 1 as occurance to the map
        }
        
        return count;
    }
}