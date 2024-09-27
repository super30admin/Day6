import java.util.HashMap;

class subArraySumEqualsK{
    public int subarraySum(int[] nums, int k) {
        if(nums == null || nums.length == 0) return 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum = 0;
        int total =0;
        map.put(0, 1);

        for(int i=0;i<nums.length;i++){
            rSum = rSum + nums[i];
            if(map.containsKey(rSum-k)){
                total += map.get(rSum-k);
            }
            map.put(rSum, map.getOrDefault(rSum, 0)+1);
        }
        return total;
    }

    public static void main(String[] args) {
        subArraySumEqualsK sa = new subArraySumEqualsK();
        int[] nums = {1,1,1};
        int k =2;
        System.out.println(sa.subarraySum(nums, k));
    }
}