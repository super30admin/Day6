//Time Complexity : O(n) as we have to traverse whole array
//Space Complexity : O(n) i.e. storing array elements
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No


import java.util.HashMap;

public class SubArrSumEqualsK {

	    public static int subarraySum(int[] nums, int k) {
	        if(nums.length == 0 || nums == null) return 0;  // means sum is 0

	        HashMap<Integer, Integer> map1= new HashMap<>();
	        int rsum=0;
	        int count=0;
	        map1.put(rsum, 1); //(recurring sum(rsum), value's count)  // Base case
	        for(int i=0;i <nums.length; i++)
	        {
	            rsum=rsum+nums[i];
	            if(map1.containsKey(rsum-k)) //this is for rsum-k element if already present 
	            {
	                count=count+map1.get(rsum-k);
	            }
	            if(map1.containsKey(rsum)) // if rsum is present then.. if not then add
	            {
	                map1.put(rsum, map1.get(rsum)+1);
	            }
	            else{
	                map1.put(rsum, map1.getOrDefault(rsum,0)+1); //if rsum is not present then add rsum with default value 0, if not then add 1 to count
	            }
	        }
	        return count;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= new int[] {3,2,1,6,4,-5,0,7};
		int k=6;
		
		int result=subarraySum(num, k);
		System.out.println("The no. of subarrays with k is:"+ result);

	}

}
