// Time Complexity : O(n) where n is the length of input
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach

public class ContiguousArray {
        public int findMaxLength(int[] nums) {

            HashMap<Integer,Integer> map = new HashMap<>();
            map.put(0,-1);
            int max=0;
            int rsum=0;

            for(int i=0; i<nums.length ; i++){
                if(nums[i] == 0){
                    rsum --;
                }
                else {
                    rsum ++;
                }

                if(map.containsKey(rsum)){
                    max = Math.max(max, (i-map.get(rsum)));
                }
                else{
                    map.put(rsum,i);
                }
            }
            return max;
        }
}
