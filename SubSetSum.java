import java.util.HashMap;

// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : I have to see the leet code for this solution. I came with the solution using two for loop where complexity was O(n^2) and Space complexity as O(1)


class SubSetSum {
    public static int subarraySum(int[] nums, int k) {
        //base condition
        if(nums.length==0)
        {
            return 0;
        }
        if(nums.length==1)
        {
            return nums[0]==k?1:0;
        }
        int count = 0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i =0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k))
            {
                count+=map.get(sum-k);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args)
    {
        System.out.println(subarraySum(new int[]{1,2,3,4,7,4,3},3));
    }
}