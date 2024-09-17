import java.util.HashMap;
import java.util.Map;


//Time complexity : O(n) The complete array is traversed only once.
//Space complexity :o(n)Maximum size of the HashMap map will be n, if all the elements are either 1 or 0.
//Did this code successfully run on Leetcode : yes
//Any problem you faced while coding this :no

public class ContiguousArray {
	public static int findMaxLength(int[] nums) {
	//declare hashmap with key= count and value = current index
    Map<Integer, Integer> map = new HashMap<>();
    //initalize map with key =0 and value =-1
    map.put(0, -1);
    int maxlen = 0;
    int count = 0;
    //iterate over array
    for (int i = 0; i < nums.length; i++) {
    	//if element 1 then increment count by 1 otherwise decrement by  1
        count = count + (nums[i] == 1 ? 1 : -1);
        //if count =0 then map already contains key as 0 so calcualte length of subarray= current index(i) - inital index(-1) which is value of key 0 in hashmap
        //compare length with maxlen of subarray
        if (map.containsKey(count)) {
            maxlen = Math.max(maxlen, i - map.get(count));
        } else {
        	//if count value do not contain inn hashmap then store count and index in hashmap
            map.put(count, i);
        }
    }
    //returns maxmimum length of subarray
    return maxlen;
    
}
	
	   public static void main(String[] args) {
	    	int[] nums = {0,1,0};
	    
	    	int count = findMaxLength(nums);
	        System.out.println("max length of  subarrays with equal 0's and 1's ="+count);	
	    }
	
}
