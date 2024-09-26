class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0,-1);
        int ps = 0;
        int ml = 0;
        for (int i=0; i<nums.length; ++i){
            ps += nums[i] == 0 ? -1:1;
            if(m.containsKey(ps)){
                int l = i - m.get(ps);
                ml = Math.max(ml,l);
            }else{
                m.put(ps,i);
            }
        }
        return ml;
    }
}
//t=O(n);
//s=O(n);
