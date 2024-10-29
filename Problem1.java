package PACKAGE_NAME;

public class Problem1 {
    public int subarraySum(int[] nums, int k) {

        Map<Integer,Integer> freq = new HashMap<>();
        freq.put(0,1);
        int sum = 0;
        int rsum = 0;
        for(int i=0;i<nums.length;i++){

            rsum+=nums[i];
            if(freq.containsKey(rsum-k)){
                sum+=freq.get(rsum-k);
            }
            freq.put(rsum,freq.getOrDefault(rsum,0)+1);


        }


        return sum;

    }
}
