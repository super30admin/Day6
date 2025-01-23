/* HashMap with key as running sum and value as frequency of the sum.
Count keeps track of the frequency of rsum-k in HashMap
So, here count is the result of subarray sum

T.C = O(n)
S.C = O(n)
*/

import java.util.HashMap;

public class SubArray
{
    public int subarraySum(int[] nums, int k) {
        if(nums.length == 0 || nums == null)
        {
            return 0;
        }

        HashMap<Integer, Integer> hs = new HashMap<>();
        int rsum = 0;
        int count = 0;
        hs.put(0, 1);

        for(int i =0;i<nums.length;i++)
        {
            rsum = rsum + nums[i];
            if(hs.containsKey(rsum - k))
            {
                count = count+ hs.get(rsum-k);
            }

            /*Here it checks if hs has a rsum. If present, it returns rsum frequency+1.
            If not present it returns the default value (0) + 1.*/
            hs.put(rsum, hs.getOrDefault(rsum, 0) +1);
        }
        return count;
    }
}

