class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length==0)
            return 0;
        HashMap<Integer,Integer> map = new HashMap();
        int result = 0;
        int rsum  = 0;
        int start =0;
        int end =0;
        map.put(0,-1);
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                rsum +=1;
            }
            else if(nums[i]==0)
            {
                rsum-=1;
            }
            if(map.containsKey(rsum))
            {
                int curr = i - map.get(rsum);
                if(curr >= result)
                {
                    result = curr;
                    start = map.get(rsum) + 1;
                    end = i;
                }
            }
            else
            {
                map.put(rsum,i);
            }
        }
        System.out.println("Start" + start);
        System.out.println("End" + end);
        return result;
    }
}

   // Time and space is O(N).