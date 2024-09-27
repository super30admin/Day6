class Solution {
    //Time complexity: O(n)
    //Space complexity: O(n)
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int c=0,m=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                c++;
            }
            else{
                c+=-1;
            }
            if(hm.containsKey(c)){
                m=Math.max(m,i-hm.get(c));
            }
            else{
                hm.put(c,i);
            }
        }
        return m;
    }
}