// subarraySum
// Time Complexity : O(n)
// Space Complexity : O(n)
class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> hMap = new HashMap<>();
        int count = 0;
        int rSum = 0;
        hMap.put(0,1);

        for(int i = 0; i<nums.length; i++) {
            rSum = rSum + nums[i];
            if(hMap.containsKey(rSum - k)) {
                count += hMap.get(rSum - k);
            }

            if(hMap.containsKey(rSum)) {

                hMap.put(rSum, hMap.get(rSum) + 1);
            } else {
                System.out.println(rSum);
                hMap.put(rSum, 1);
            }
        }

        return count;

    }
}