// I could only come up with this partial solution, it does not work correctly on test cases where the subarray is present at the end.
class Solution {
    public int findMaxLength(int[] nums) {
      HashMap<Integer,Integer> map = new HashMap<>(2);
        map.put(0,0);
        map.put(1,0);
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.get(nums[i])+1);
            if((Math.abs(map.get(0)-map.get(1)))>(nums.length-1-i))
            {
                map.put(nums[i],map.get(nums[i])-1);
                break;   
            }    
        }
        return Math.min(map.get(0),map.get(1))*2;
    }
}