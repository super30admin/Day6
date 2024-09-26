package secondWeek;

import java.util.HashMap;

public class ContiguousSubArray {

	 public int findMaxLength(int[] nums) {
		 int max=0;
		 if(nums == null && nums.length == 0) return -1;
		 int rSum = 0;
		 HashMap<Integer,Integer> map = new HashMap<>();
		 map.put(0, -1);
		 
		 for(int i=0;i<nums.length;i++) {
			 rSum = nums[i] == 0 ? rSum -1 : rSum +1;
			 
			 if(map.containsKey(rSum)) {
				 System.out.println(max + " "+(i - map.get(rSum)));
				 max= Math.max(max, i - map.get(rSum));
			 } else {
				 map.put(rSum, i);
			 }
		 }
		 System.out.println(max);
		 return max;
	 }
	 

	public static void main(String[] args) {
		int[] nums= new int[] {1,0,1,0,1,1,1};
		ContiguousSubArray con = new ContiguousSubArray();
		con.findMaxLength(nums);
	}


	
}
