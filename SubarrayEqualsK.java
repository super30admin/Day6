class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0; int rSum = 0;
        
        int complement = 0;
        HashMap<Integer,Integer> map = new HashMap();
        //base case
        map.put(0,1);
        for(int i=0;i<nums.length;i++ ){
            rSum = rSum + nums[i];
             complement = rSum - k;
            if(map.containsKey(complement)){
                count += map.get(complement); // rsum| subArray length
            }
            if(!map.containsKey(rSum)){
                map.put(rSum,0);
            }
            map.put(rSum,map.get(rSum)+1);
        }
        
        return count;
    }}
/*
Time Complexity : O(n)
Space Complexity: O(n) map used
*/
    