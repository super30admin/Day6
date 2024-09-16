class Solution {
    public int subarraySum(int[] nums, int k) {
HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int n: nums)
        {
            sum+=n;
            int compliment=sum-k;
            if(map.containsKey(compliment))
            {
                count+=map.get(compliment);
            }
            if(!map.containsKey(sum))
            {
                map.put(sum,1);
            }
            else{
                map.put(sum,map.get(sum)+1);
            }
        }
        return count;
    }
}