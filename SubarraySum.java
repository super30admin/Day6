//o(n) time and space complexities
//passed all leetcode cases
//used approach discussed in class

class Solution {
    public int subarraySum(int[] nums, int k) {
        //edge
        if(nums==null || nums.length ==0) return 0;
        int count = 0;
        int rsum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            rsum += nums[i];
            int compliment = rsum-k;
            if(map.containsKey(compliment)){
                count+=map.get(compliment);
            }
            if(!map.containsKey(rsum)){
                map.put(rsum,1);
            }else {
                map.put(rsum,map.get(rsum)+1);
            }
        }
        return count;
    }
}