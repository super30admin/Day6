class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        int res=0;
        int sum=0;
        hm.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            sum+=1;
            if(nums[i]==0)
            sum-=1;
            if(!hm.containsKey(sum))
            {
                hm.put(sum,i);
            }
            else
            {
                res=Math.max(res,i-hm.get(sum));
            }
        }
        return res;
    }
}

//Time Complexity: O(n), Where n is the length of the input array nums.

//Space Complexity: O(n), Where n is the number of unique cumulative sums that could be stored in the HashMap (in the worst case).