/**
Leetcode Submitted : YES
Time Complexity : O(N)
Space Complexity : O(N)
The approach is to keep running sum in Hashmap by calculating complement with target sum at each iteration.
Once, the runsum is found increase its count
**/


class Solution {
	public int subarraySum(int[] nums, int k) {
   	HashMap<Integer,Integer> map = new HashMap<>();
   	int runSum = 0;
   	int count = 0;
  	 
  	 
   	 
  	map.put(0,1);
   	 
   	 
   	 
  	for(int i=0; i<nums.length; i++){
      	runSum = runSum + nums[i];
      	int compliment = runSum - k;
     	if(map.containsKey(compliment)){
          	count = count + map.get(compliment);
      	}
      	if(map.containsKey(runSum)){
        	map.put(runSum,map.get(runSum) + 1);
      	}else{
          	map.put(runSum, 1);
      	}   
  	}
   	 
	 
  	return count;
	}
}
