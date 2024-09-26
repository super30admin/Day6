//time - O(n)
//space - O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        if(nums==null || nums.length < 2) return 0;

        Map<Integer, Integer> map = new HashMap();
        int rsum = 0, maxLen = 0;
        map.put(0, -1);

        for(int i=0; i<nums.length; i++){
            if(nums[i]==1) rsum++;
            if(nums[i]==0) rsum--;
            if(map.containsKey(rsum)){
                maxLen = Math.max(maxLen, i-map.get(rsum));
            }
            else
                map.put(rsum, i);
        }

        return maxLen;
    }
}