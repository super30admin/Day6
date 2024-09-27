package hashing;
//Time ComplexityO(n)
//space Complexity O(n)
import java.util.HashMap;

public class problem2 {
	 public int findMaxLength(int[] nums) {
	        HashMap<Integer,Integer> hmap = new HashMap<>();
	        int count = 0;
	        int max_length = 0;
	        hmap.put(0,-1);
	        for(int i = 0; i<nums.length ; i++)
	        {
	             count = nums[i] == 0 ? count-1:count+1;
	            if(!hmap.containsKey(count)){
	                hmap.put(count, i);
	            }
	            max_length = Math.max(max_length, i-hmap.get(count));
	        }
	        return max_length;
	    }
	} 
