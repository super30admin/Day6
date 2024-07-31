//TC: O(n)
//SC: O(n)
//Approach: Maintain a hashmap of running sums where the occurance of rsum at the earliest index is stores. Add (0 rsum at -1 index) to catch already balanced contiguous array at the start. When the rsum has occured before -> the sub array from index i to the earliest occurance is equal number of 0s and 1s.

class Solution {
    public int findMaxLength(int[] nums) {
        int maxL =0; int rsum = 0;
        HashMap<Integer,Integer> map = new HashMap();
        map.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==1) rsum++;
            else rsum--;

            if(map.containsKey(rsum)){
                maxL = Math.max(i-map.get(rsum), maxL);
            } else{
                map.put(rsum,i);
            }
        }
        return maxL;
    }
}