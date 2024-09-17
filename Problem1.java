//time - O(n)
//space - o(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int res = 0;
        int sum = 0;
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            int diff = sum - k;
            if ( map.containsKey(diff) ) {
                res += map.get(diff);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
                System.out.println(Arrays.asList(map));

        return res;   
    }
}