//Time Complexity = O(n)
//Space Complexity = O(n)


class Solution {
    public int subarraySum(int[] nums, int k) {
        if(nums==null || nums.length==0 ) return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int sum  = 0;
        map.put(0,1);
        for (int num:nums){
            count = count+num;
            if(map.containsKey(count-k)){
                sum = sum + map.get(count-k);
            }

            int h = map.getOrDefault(count, 0);
            map.put(count,h+1);

        }
        return sum;
        
    }
}