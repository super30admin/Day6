//Time complexity: O(N)
//Space complexity : O(N)
//did this problem run on leetcode: yes
// any questions?: no
//525. Contiguous Array
//https://leetcode.com/problems/contiguous-array/
class Solution {
    public int findMaxLength(int[] nums) {
        int count = 0;
        int max = 0;
        //store rsum and its index
        HashMap<Integer,Integer> smap = new HashMap<>();
        //edge case were we may miss the inital [1,0] subarray
        smap.put(0,-1);
        for(int i=0;i<nums.length;i++){
            //if 0 then count--
            if(nums[i]==0)
            {
                count = count - 1;
            }
            //if 1 count ++
            else {
                count = count + 1;
            }
            //if the count(ntng but rsum) calculated is already present, if not then add it along with its index
            if(!smap.containsKey(count)){
                smap.put(count,i);
            }
            //if present that means the count (or rsum) already hpnd before and we need to retrieve it as we need to get max subarray
            //if rsum already hpnd means between those indices there is a contigous subarray
            // so now we find if that rsum is already there before and subtrcat with current index to get length of subarray
            else{
                max = Math.max(i - smap.get(count),max);
            }
        }
        return max;
    }
}