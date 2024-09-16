import java.util.HashMap;

public class Contiguous_Array {
	//Approach: Here am using the same intuition, but the K here is 0, and we need to get the maximum length of the subarray that has equal no of 1's and 0's.
	//2. while iterating the loop if i face 0 i will add -1 to the sum, if its 1 i just add it, so in this way, I can check for sum == 0.
	//3. I make entries in the Hashmap storing the cumulative sum and their first occurence, or if i have the sum already in the map, then it means, 
	//the elements after the index from map (value = map.get(sum)),forms an array with equal 1's and 0's.  
	//4. Hence I compare the max value that I have with this one and store the maximum.
	public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        int max=0;

        for(int loop=0;loop< nums.length;loop++)
        {
            if(nums[loop] == 0)
                sum += -1;
            else 
                sum +=1;
            if(sum == 0)
                max = loop+1;
            if(!map.containsKey(sum))
                map.put(sum, loop);
            else 
            {
                int val = loop - map.get(sum);
                max = Math.max(max,val);
            }
        }
        return max;
    }
}
//Time Complexity : O(n)
//Space Complexity : O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this :
