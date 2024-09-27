import java.util.HashMap;

public class SubarraySumEqualsK {
	
	
	  public int subarraySum(int[] nums, int k) {
	        
	        if(nums==null || nums.length ==0)
	            return 0;
	        
	        int count=0;
	        int runningSum=0;
	        int compliment=0;
	        
	        
	        HashMap<Integer,Integer> subarraySumMap= new HashMap();
	        
	        subarraySumMap.put(0,1);
	        
	        for(int i=0;i< nums.length;i++ ){
	            
	            runningSum = runningSum + nums[i];
	            
	            compliment = runningSum - k;
	            if(subarraySumMap.containsKey(compliment)){
	                count = count + subarraySumMap.get(compliment);
	            }
	            
	            if(subarraySumMap.containsKey(runningSum)){
	                subarraySumMap.put(runningSum, subarraySumMap.get(runningSum)+1 );
	            }else{
	                subarraySumMap.put(runningSum, 1);
	            }
	            
	        }
	        
	       
	        return count;
	        
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubarraySumEqualsK objIn= new SubarraySumEqualsK();
		int[] nums = {1,1,1};
		int k = 2;
		
		System.out.println(objIn.subarraySum(nums, k));

	}

}
