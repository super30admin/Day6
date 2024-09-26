import java.util.HashMap;

public class ContiguousArray {
	public static int findMaxLength(int[] nums) {
        if(nums.length == 0 || nums == null) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int rSum = 0;
        map.put(0,-1);
        
        for(int i = 0; i<nums.length; i++){
            rSum = nums[i] == 0? rSum - 1 : rSum + 1;
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            }
            else{
                map.put(rSum,i);    
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		int[] nums = {1,0,1,0,1,1,1,0,0,0,1,1,1,0,1};
		System.out.println(ContiguousArray.findMaxLength(nums));
	}
}
