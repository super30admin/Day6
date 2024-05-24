// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;
public class Subarraysumeqk
{
        public int subarraySum(int[] nums, int k)
        {
            if(nums.length==0 || nums==null)
                return 0;

            int rsum=0;
            int count=0;
            HashMap<Integer, Integer> map= new HashMap<>();
            map.put(rsum, 1);
            for(int i=0; i<nums.length; i++)
            {
                rsum= rsum+nums[i];
                //int j= rsum-k;
                if(map.containsKey(rsum-k))
                {
                    count= count+map.get(rsum-k);
                }
                map.put(rsum,map.getOrDefault(rsum,0)+1);
            }
            return count;
        }
        public static void main(String[] args) {
            Subarraysumeqk obj = new Subarraysumeqk();
            System.out.println(obj.subarraySum(new int[]{1,1,1}, 2));
        }
    }

