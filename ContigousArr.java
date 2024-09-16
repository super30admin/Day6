import java.util.HashMap;
public class ContigousArr {
	    public int findMaxLength(int[] nums) {
	       HashMap<Integer,Integer> hm = new HashMap<>();
	        int count = 0, result = 0;
	        hm.put(0,-1);
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] == 0){
	                count += -1;
	            }else{
	                count += 1;
	            }
	            if(hm.containsKey(count)){
	                result = Math.max(result, i-hm.get(count));
	            }else{
	                hm.put(count, i);
	            }
	        }
	        return result;
	    }
}

// Time Complexity - O(n)
//space Complexity - O(n)
