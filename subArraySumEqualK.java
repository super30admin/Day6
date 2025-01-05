import java.util.HashMap;

//Used Rsum along with Hashmap which obtained the TC = O(n) and SC = O(n)
// HashMap key = rSum and value = frequency of the rSum
class subArraySumEqualK {
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int cnt = 0;
        int rSum = 0;
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            rSum = rSum + nums[i];
            //Need to check if map contains key (rSum-k) if present increase the counter by also checking the value of the map.
            if(map.containsKey(rSum-k)){
                cnt = cnt+map.get(rSum-k);
            }
            // Add the key and value if rSum is not there add the key as value of rSum and value as 1
            map.put(rSum,map.getOrDefault(rSum,0)+1);
        }
        return cnt;
    }
}
