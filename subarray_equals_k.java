import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author aupadhye
 *
 */

//Space and time complexity would be O(n) and O(n) respectively
public class subarray_equals_k {

	/**
	 * @param args
	 */
	   public static int subarraySum(int[] nums, int k) {
	        
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        int sum = 0;
	        int count = 0;
	        for(int i=0;i<nums.length;i++){
	            
	            sum += nums[i];
	            
	            if(sum==k){
	                count++;
	            }
	            
	            int left = sum - k;
	            
	            if(map.containsKey(left)){
	                
	                count += map.get(left);
	                
	            }
	            map.put(sum,map.getOrDefault(sum,0)+1);
	        }
	        return count;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,1,1};
		System.out.println(subarraySum(nums,2));
	}

}
