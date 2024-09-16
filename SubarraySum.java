
//time complexity-o(n^2)
//spacem complexity -o(1)
public class SubarraySum {

	
	public int subarraySum(int[] nums, int k) {
	     int count=0,j=0,sum=0;
	     for(int i=0;i<nums.length;i++)
	     {
	    	 j=i;
	    	 sum=0;
	    	 while(j<nums.length)
	    	 {
	    		 if(sum+nums[j]==k)
	    			 count++;
                 sum=sum+nums[j];
	    		 j++;
	    	 }
	     }
	     return count;
	    }
}
