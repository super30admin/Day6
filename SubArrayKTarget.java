package secondWeek;

import java.util.HashMap;
import java.util.Map.Entry;

public class SubArrayKTarget {

	public int findkLength(int[] nums, int k) {
		// TODO Auto-generated method stub
		int count=0;
		if(nums ==null || nums.length == 0) return -1;
		HashMap<Integer,Integer> map = new HashMap<>();
		map.put(0, 1);
		int rSum =0;
		for(int i=0;i<nums.length;i++) {
			rSum= rSum+nums[i];
			int compliment = rSum - k;
			if(map.containsKey(compliment)) { // check compliment exits or not 
				System.out.println(count+" -- "+(map.get(compliment)) + " "+compliment);
				count+=map.get(compliment);
			}
			if(map.containsKey(rSum)) { // adding one to rsum if it exists
				map.put(rSum, map.get(rSum)+1);
			} else {
				map.put(rSum, 1);
			}
		}
		/*for(Entry<Integer,Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+"--- "+entry.getValue());
		}*/
		System.out.println(count);
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums= new int[] {1,1,1};
		SubArrayKTarget con = new SubArrayKTarget();
		//con.findkLength(nums,3);
		System.out.println("K element "+con.findkLength(nums,2));

	}

}
