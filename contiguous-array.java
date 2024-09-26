//time complexcity: O(n)
//space complexcity: O(n)
//Did it run successfully on leetcode: YES

class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap();
        
        int rSum = 0;
        int max = 0;
        if(map.isEmpty()){
            map.put(rSum, -1);
        } 
        for(int i=0; i<nums.length; i++) {
            int temp;
            if(nums[i] == 0) {
                rSum = rSum - 1; 
            } else {
                rSum = rSum + 1;
            }
            if(!map.containsKey(rSum)){
                    map.put(rSum, i);
            } 
            else {
                    temp = i - map.get(rSum);
                    max = Math.max(max, temp);
            }
        }
        return max;
    }
}
