// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
Using an HashMap. Calculated the rsum and complement which is rsum - k. If Comp is not in the hashmap then put the rsum and add the count as 1.
If the comp is present then increase the count by 1 and put the rsume with value count++. Then return count.
class SubArraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int rsum=0;
        int count = 0;
        map.put(0,1);
        for(int i=0; i< nums.length ; i++) {
            rsum += nums[i];
            int comp = rsum - k;
            if(map.containsKey(comp)){
                count += map.get(comp);
            }
            if(map.containsKey(rsum)){
                map.put(rsum, map.get(rsum)+1);
            }else {
                map.put(rsum, 1);
            }
        }
        return count;
    }
}