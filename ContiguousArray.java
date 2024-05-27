import java.util.HashMap;

public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int rSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int max = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                rSum += 1;
            } else{
                rSum -= 1;
            }
            if(map.containsKey(rSum)){
                max = Math.max(max, i - map.get(rSum));
            } else {
                map.put(rSum, i);
            }
        }
        return max;
    }
    public static void main(String[] strs)
    {
        ContiguousArray object = new ContiguousArray();
        int ans = object.findMaxLength(new int[]{0,1,0});
        System.out.println(ans);
    }
}
