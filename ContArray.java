// Time Complexity: O(n)
// Space Complexity: O(n)
import java.util.*;
public class ContArray {
        public int findMaxLength(int[] nums)
        {
            if(nums.length==0 || nums==null)
            {
                return 0;
            }
            HashMap<Integer,Integer> map= new HashMap<>();
            int rsum=0;
            int max=0;
            map.put(0,-1);
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==1)
                {
                    rsum=rsum+1;
                }
                else
                {
                    rsum=rsum-1;
                }
                if(map.containsKey(rsum))
                {
                    max= Math.max(max,i-map.get(rsum));
                }
                else
                {
                    map.put(rsum, i);
                }
            }
            return max;
        }
        public static void main(String[] args) {
            ContArray ca=new ContArray();
            int[] nums={1,0,1,1,0,1,0,0,1};
            System.out.println(ca.findMaxLength(nums));
        }
    }

