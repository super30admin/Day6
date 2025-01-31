import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                sum--;
            }else{
                sum++;
            }

            if(map.containsKey(sum)){
                ans = Math.max(ans, i - map.get(sum));
            }else{
                map.put(sum, i);
            }
        }
        return ans;
    }
}
