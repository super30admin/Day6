//Time complexity:O(n)
//Space complexity:O(n)
class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map=new HashMap();
        map.put(0,-1);
        int result=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)count--;
            if(nums[i]==1)count++;
            if(map.containsKey(count)){
                result=Math.max(result,i-map.get(count));
            }else{
                map.put(count,i);
            }
            
        }
        return result;
    }
}