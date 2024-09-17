import java.util.HashMap;

public class SubArraySumK {

	 public int subarraySum(int[] nums, int k) {
		  HashMap<Integer,Integer> hm= new HashMap<>();
		        hm.put(0,1);
		        int sum=0;
		        int ans=0;
		        for( int i=0;i<nums.length;i++){
		            
		            sum=sum+nums[i];
		            int check= sum-k;
		            if(hm.containsKey(check)){
		                
		                ans=ans+hm.get(check);
		            }
		            
		            if(hm.containsKey(sum)){
		                hm.put(sum,hm.get(sum)+1);
		            }else{
		                
		                hm.put(sum,1);
		            }
		            
		            
		        }
		        
		        System.out.println(hm);
		     return ans;   
		        
		    }
	
}
