import java.util.HashMap;
import java.util.Map;

//Time - O(n)
//Space - O(n)
public class ContiguousArray {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length==0) return 0;
        int maxLen = 0, rsum = 0;

        //map contains key as running sum and value as index
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);

        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) rsum-=1;
            else rsum+=1;

            if(map.containsKey(rsum)){
                maxLen = Math.max(i-map.get(rsum), maxLen);
            } else {
                map.put(rsum, i);
            }
        }

        return maxLen;
    }
}
