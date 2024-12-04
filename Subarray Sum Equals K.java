//tc- O(n) sc-O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {
        //null

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count = 0;
        int rSum= 0;

        for(int i = 0; i < nums.length; i++){
            rSum += nums[i];
            int cmp = rSum - k;//y = z-x, x is k, z is rSum, if the y is present in rSum hashmap, that means there is 
            //k sum sub array , add count from hashmap

            if(map.containsKey(cmp)){
                count += map.get(cmp);
            }
            map.put(rSum, map.getOrDefault(rSum, 0) + 1);
        }
        return count;
    }
}