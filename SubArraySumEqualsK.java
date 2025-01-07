import java.util.HashMap;
public class SubArraySumEqualsK {

    //time complexity: O(n)
    //space complexity: O(n)
    //thought process:
    //1. create a running sum array
    //2. create a hashmap to store the running sum and the count of the running sum
    //3. iterate through the array and add the running sum to the hashmap
    //4. if the running sum is equal to k, add the count of the running sum to the result
    //5. return the result
    public int subarraySum(int[] nums, int k) {
        
        if (nums == null || nums.length ==0 ){
            return 0;
        }
        int[] rSum = new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int count =0;
        // get running sum
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            rSum[i] = sum;
            int lPos = rSum[i] -k;
                if (map.containsKey(lPos)){
                    count = count + map.get(lPos);
                }
            map.put(rSum[i], map.getOrDefault(rSum[i],0)+1);
        }
      
            return count;

    }
}
