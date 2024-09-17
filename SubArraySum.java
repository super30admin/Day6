import java.util.HashMap;
import java.util.Map;
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        //since we don't have to give the actual array and only give the count of subarray that sum to k
        //we can maintain a frequency of running sums since if there are negative numbers in array that can make the running sum to be same
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int result=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k))
            {
                result+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        
        return result;
    }
    public static void main(String[] args)
    {
        int[] nums={1,1,1};
        SubArraySum obj=new SubArraySum();
        System.out.println(obj.subarraySum(nums,2));
    }
}
