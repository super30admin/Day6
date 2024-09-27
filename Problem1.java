import java.util.HashMap;

public class Problem1 {

	   public static int subarraySum(int[] nums, int k) {
	        HashMap<Integer,Integer> map = new HashMap<>();
	        int count=0,sum=0;
	        map.put(0,1);
	        for(int i=0;i<nums.length;i++){
	            sum+=nums[i];
	            if(map.containsKey(sum-k)){
	               
	                count+=map.get(sum-k);
	            }
	             map.put(sum,map.getOrDefault(sum,0)+1);
	        }
	        
	        return count;
	    }
	public static void main(String[] args) {
		
		int[] nums= new int[] {1,1,1};
		int k=2;
		
		int res= subarraySum(nums,k);
		System.out.println("res : "+ res);
	}
}
