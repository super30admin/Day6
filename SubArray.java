// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach


class SubArray {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer, Integer> map = new HashMap<>(); 
        int rSum = 0;
        int count = 0;
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            rSum +=nums[i];
            int y = rSum - k;
            if(map.containsKey(y)){ 
                count+= map.get(y);
            }
            if(map.containsKey(rSum)){
                int j = map.get(rSum) +1;
                map.put(rSum,j);
            }else{
                map.put(rSum,1);
            }
        }
        return count;
    }
}