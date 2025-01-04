
//Time Complexity : O(n)
//Space Complexity: O(n)
package Interview;

import java.util.HashMap;

public class ContiguousArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,0};
		
		System.out.println(findMaxLength(array));
	}
	
	public static int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1){
            return 0;
        }
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        map.put(0,-1); //running sum 0 occurs at index -1;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == 0){
                rSum--;
            }else if(nums[i] == 1){
                rSum++;
            }
            if(map.containsKey(rSum)){
                max = Math.max(max, (i-map.get(rSum))); //subtract current  index from previous found running sum same index
            }else{
                map.put(rSum,i);
            }
        }
        return max;
    }

}
