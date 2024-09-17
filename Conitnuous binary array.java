//Time complexity: O(n)
//Space complexity: O(n)

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        int count=0; int max=0;
        map.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                count-=1;
            }
            else
            {
                count+=1;
            }
            if(map.containsKey(count))
            {
                max=Math.max(max, i- map.get(count));
            }
            else
                map.put(count, i);
        }
        return max;
    }
}