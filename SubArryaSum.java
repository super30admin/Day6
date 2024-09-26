public class SubArryaSum {
        public int subarraySum(int[] nums, int k) {
            int rsum=0;
            int count=0;
            HashMap<Integer,Integer> hm = new HashMap<>();
            hm.put(0,1);
            for(int i=0;i<nums.length;i++)
            {
                rsum+=nums[i];
                int diff = rsum - k;
                if(hm.containsKey(diff))
                {
                    count+= hm.get(diff);
    
                }
                if(hm.containsKey(rsum))
                {
                    hm.put(rsum, hm.get(rsum)+1);
                }
                else
                {
                    hm.put(rsum, 1);
                }
            }
            return count;
        }
    