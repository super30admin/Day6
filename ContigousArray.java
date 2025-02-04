class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int freq=0;
        int rSum=0;
        for(int i=0;i<nums.length;i++){
            rSum+=nums[i];
            if(map.containsKey(rSum-k)){
                freq+=map.get(rSum-k);
            }
            if(map.containsKey(rSum)) map.put(rSum,map.get(rSum)+1);
            else{
                map.put(rSum,1);
            }

        }
        return freq;
    }
}