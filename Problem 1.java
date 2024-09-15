
//(runtime-O(n^2), space complexity-O(1))
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        int add=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i;j<nums.length;j++)
            {
                add+=nums[j];
                if(add==k)   count++;
             
            }
            add=0;
        }
        return count;
    }
}


//Solution 2(runtime-O(n), space complexity-O(n))
class Solution {
    public int subarraySum(int[] nums, int k) {
        int currsum=0;
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            currsum+=nums[i];
            int diff= currsum-k;
           
            if(map.containsKey(diff))   count+=map.get(diff);
            map.put(currsum,(map.getOrDefault(currsum,0))+1);
           
            
        }
        return count;
        
    }
}