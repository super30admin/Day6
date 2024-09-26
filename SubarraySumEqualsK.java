import java.util.HashMap;

public class SubarraySumEqualsK {
	public static int subarraySum(int[] nums, int k) {
        if(nums.length == 0 || nums == null) return 0;
        int rSum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < nums.length; i++){
            rSum += nums[i];
            int compliment = rSum - k;
            if(map.containsKey(compliment)){
                count += map.get(compliment);
            }
            if(map.containsKey(rSum)){
                map.put(rSum, map.get(rSum)+1 );
            }
            else{
                map.put(rSum,1);
            }
        }
        return count;
    }
	
	public static void main(String[] args) {
		int[] nums = {3,4,7,2,-3,1,4,2,0,1};
		int k = 8;
		System.out.println(SubarraySumEqualsK.subarraySum(nums, k));
	}
	
}
