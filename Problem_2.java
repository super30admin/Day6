//Time complexity-O(n)
//Space complexity-O(n)
//something too complex for my level, so followed the class approach
class Solution {
    public int findMaxLength(int[] nums) {
        
        int sum=0;
        int max=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                sum=sum+1;
            }
            else
            {
                sum=sum-1;
            }
            if(sum==0)
            {
                max=i+1;
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,i);
            }
            else
            {
                max=Math.max(max,i-map.get(sum));
            }
            
        }
        return max;
        
    }
}
