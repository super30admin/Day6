import java.util.HashMap;

public class MaxLength {
    public int findMaxLength(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0,-1);
        int rSum = 0, ans=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                rSum--;
            }
            else{
                rSum++;
            }
            if(hm.containsKey(rSum)){
                int len = i-hm.get(rSum);
                if(len>ans){
                    ans = len;
                }
            }
            else{
                hm.put(rSum, i);
            }
        }
        return ans;
    }
}
