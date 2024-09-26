//Time complexity: O(n*sizeOfMap) ~ O(n*n)
//Space: O(n)
import java.util.*;

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int count=0, res=0;
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)  count--;
                else    count++;
            if(map.containsKey(count))
                res=Math.max(res, i-map.get(count));
            else
                map.put(count, i);
        }
        return res;
    }
}