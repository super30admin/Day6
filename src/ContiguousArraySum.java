// Time Complexity:     O(n)
// Space Complexity:    O(n)
// where n is length of given array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

import java.util.HashMap;
import java.util.Map;

public class ContiguousArraySum {
    public static void main(String[] args) {

        int[] arr ={3,-3,1,2,1,7,0,1,6};
        int sumVal = 8;
        FindSubArrSum fs = new FindSubArrSum();
        System.out.println(fs.subarraySum(arr,sumVal));
    }
}
class FindSubArrSum {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);                                                       // adding intial key, value pair
        int sum = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++)
        {
            sum += nums[i];                                                 // maintaining sum of array elements
            count += map.getOrDefault(sum-k,0);              // if remaining amount from sum encountered before
            map.put(sum, map.getOrDefault(sum,0)+1);             // if map doesn't contain remaining amount from sum

        }
        return count;
    }
}