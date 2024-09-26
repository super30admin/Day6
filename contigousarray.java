//Time complexity:O(n)
//Space complexity:O(n)



class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> counts = new HashMap();
        counts.put(0,-1);
        int count=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                count--;
            }
            else{
                count++;
            }
            if(counts.containsKey(count)){
                result=Math.max(result,i - counts.get(count));
            }
            else{
                counts.put(count,i);
            }
        }
        return result;
    }
}