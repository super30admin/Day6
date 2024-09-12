//TC : O(n)
//SC : O(n)

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        hm.put(0,-1);
        int sum=0;
        int max=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {sum+=-1;}
            else
            {
                sum+=1;
            }
            if(hm.containsKey(sum))
            {
                max=Math.max(max,i-hm.get(sum));
            }
            else
            {
                hm.put(sum,i);
            }
        }
        return max;
    }
}
