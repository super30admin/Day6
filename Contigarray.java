// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


public class Contigarray {
	public int findMaxLength(int[] nums) {
        if(nums == null||nums.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum = 0; int max = 0;
        for(int i = 0 ; i<nums.length; i++){
            if(nums[i]==0){
                rSum--;
            }else{
                rSum++;
            }
            if(map.containsKey(rSum)){
                int currlen = i - map.get(rSum);
                if(currlen>max){
                    max=currlen;
                }
            }
            else{
                    map.put(rSum,i);
                }
            

        }
                return max;
    }
}
