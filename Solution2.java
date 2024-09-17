

//Time Complexity:O(N)
//Space Complexity: O(N)
public class Solution2 {
	public int subarraySum(int[] nums, int k) {
        int rsum =0;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            rsum = rsum+nums[i];
            if(k-rsum ==0){
                count++;
            }
           if(map.containsKey(rsum-k)) {
               count = count+map.get(rsum-k);
           }
            if(!map.containsKey(rsum)){
                map.put(rsum,1);
            }
            else if(map.containsKey(rsum)){
                map.put(rsum,map.get(rsum)+1);
            }
        }
        return count;
    }
}
