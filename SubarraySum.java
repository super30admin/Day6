//time complexity:O(n)
//space complexity: O(n)
public class SubarraySum {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(0,1);
        int currentSum=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            currentSum=currentSum+nums[i];
            if(map.containsKey(currentSum-k)){
                result=result+map.get(currentSum-k);
            }
            if(!map.containsKey(currentSum)){
                map.put(currentSum,0);

            }
            map.put(currentSum, map.get(currentSum)+1);
        }
        return result;
    }
}
