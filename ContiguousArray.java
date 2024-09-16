//Time Complexity- O(n)
//Space Complexity=O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums.length<=1 ||nums==null)
        {
            return 0;
        }
        int sum=0;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum+=1;
            }
            else{
                sum-=1;
            }
            if(sum==0)
            {
                max=i+1;
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            else{
                max=Math.max(max,i-map.get(sum));
            }
        }
        return max;
        
    }
}