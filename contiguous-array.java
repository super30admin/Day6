class Solution {
    public int findMaxLength(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int rsum = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            rsum = nums[i] == 1 ? rsum+1 : rsum-1;
            if(map.containsKey(rsum)){
                int length = i - map.get(rsum);
                max = Math.max(length, max);
            }else{
                map.put(rsum, i);
            }
        }
        return max;
    }
}

//Time Complexity : O(n)
//Spcae Complexity : O(n)