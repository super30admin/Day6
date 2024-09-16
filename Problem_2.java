import java.util.HashMap;

public class Problem_2 {
	 public int findMaxLength(int[] nums) {
	        
	        if(nums.length == 0 || nums == null){
	            return 0;
	        }
	        
	        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
	        hashMap.put(0, -1);
	        
	        int currentSum = 0;
	        int maxSum = 0;
	        
	        for(int i=0; i<nums.length; i++){
	            if(nums[i] == 0){
	                currentSum = currentSum - 1;
	            }else{
	                currentSum = currentSum + 1;
	            }
	            
	            if(hashMap.containsKey(currentSum)){
	                maxSum = Math.max(maxSum, (i - hashMap.get(currentSum)));
	            }else{
	                hashMap.put(currentSum, i);
	            }
	        }
	        
	        return maxSum;
	        
	    }
}
