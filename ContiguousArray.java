
// Time Complexity :O(n) --> beacuse of for loop
// Space Complexity :O(n)  ---> because of Hashmap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
import java.util.HashMap;
public class ContiguousArray {
    public static int findMaxLength(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max = 0;
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==0)
                sum = sum - 1;
            else
                sum = sum +1;
            if(map.containsKey(sum))
                max = Math.max(max,i-map.get(sum));
            else
                map.put(sum,i);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,0,0,1,0,1,1};
        System.out.println(findMaxLength(nums));
    }

}
