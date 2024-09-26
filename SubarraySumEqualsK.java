import java.util.HashMap;
public class SubarraySumEqualsK {
	//	Timr: O(n)
	//	Space: O(n)
	//	Leetcode: yes

	class Solution {
		HashMap<Integer , Integer> map = new HashMap<>();
		public int subarraySum(int[] nums, int k) {
			//edge case
			if(nums == null || nums.length == 0 ) return 0;
			int count = 0;
			int sum =0;
			map.put(0,1);
			for(int i=0; i < nums.length; i++){
				sum += nums[i];
				int compliment = sum - k;
				if(map.containsKey(compliment)){
					count += map.get(compliment);
				}
				if(map.containsKey(sum)){
					map.put(sum, map.get(sum)+1);                   
				}else{
					map.put(sum, 1);
				}
			}
			return count;
		}
	}
}

//brute force - n^2
//	Timr: O(n^2)
//	Space: O(1)

//	Leetcode yes
//		         int n = nums.length;
//		         if(nums == null || n == 0) return 0;
//		         int count = 0; 

//		         for(int i=0 ; i < n ; i++){
//		             int sum=0;
//		             for(int j =i; j < n ; j++){
//		                 sum += nums[j];

//		                 if(sum == k){
//		                     count++;
//		                 }

//		             }
//		         }
//		         return count;

//		     }
// }	
