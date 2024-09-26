import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author aupadhye
 *
 */

//Time Complexity would be O(n) to run through the whole string
//Space complexity would be O(n)
public class largest_contigous_array {

	/**
	 * @param args
	 */
	
	 public static int findMaxLength(int[] nums) {
	        
	        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	        
	        int diff= 0;
	        int max = 0;
	     
	        map.put(0,-1);
	        for(int i=0;i<nums.length;i++){
	            
	            if(nums[i]==1){
	                diff+=1;
	            }
	            else{
	                diff-=1;
	            }
	            if(map.get(diff)!=null){
	                
	                if(i-map.get(diff) > 1 && i-map.get(diff) > max){
	                    max= i-map.get(diff);
	                }
	            }
	            else{
	            map.put(diff,i);}
	            
	        }
	        return max;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {0,1,0,1};
		
		int length=findMaxLength(nums);
		System.out.println(length);
	}

}
