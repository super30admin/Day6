import java.util.HashMap;

public class Problem_1 {
	 public int subarraySum(int[] nums, int k) {
	        
	        if(nums.length == 0 || nums == null){
	            return 0;
	        }
	        
	        int count = 0;
	        int runningSum = 0;
	        
	        HashMap<Integer, Integer> hashMap = new HashMap<>();
	        hashMap.put(0, 1);
	        
	        for(int i=0; i<nums.length; i++){
	            runningSum = runningSum + nums[i];
	            int compliment = runningSum - k;
	            
	            if(hashMap.containsKey(compliment)){
	                count = count + hashMap.get(compliment);
	            }
	            
	            if(hashMap.containsKey(runningSum)){
	                hashMap.put(runningSum, hashMap.get(runningSum)  + 1);
	            }else{
	                hashMap.put(runningSum, 1);
	            }
	        }
	        
	        return count;
	        
	    }
}
