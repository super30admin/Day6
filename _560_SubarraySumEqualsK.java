class Solution {
    // space complexity - o(n)
        	//time - o(n)
          //Ran on leeetcode successfully : Yes
          // Problem faced  : No
        	//Approach : calculate Prefix sum array and store in map with frequency of that prefix sum, for current sum subtract target
          // and see if the number is there in map  and its hit, increase count by the frequency of prefix sum

    public int subarraySum(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap();
        map.put(0,1);

        int count  = 0;
        int sum = 0;
       for(int i = 0; i<nums.length; i++){
           sum += nums[i];
           if(map.containsKey(sum-k)){
               count = count + map.get(sum-k) ;
           }
           int sumCount = map.getOrDefault(sum, 0);
           map.put(sum,  sumCount+1);
        }
        return count;
    }

    // space complexity - o(n)
        	//time - o(n^2)
          //Ran on leeetcode successfully : Yes
          // Problem faced  : No
        	//Approach : calculate Prefix sum array, traverse the sum array to find sum of all possible subarrays
      public int subarraySum(int[] nums, int k) {

          int[] arr = new int[nums.length+1];

          for(int i=1; i<=nums.length; i++){
              arr[i] = arr[i-1] + nums[i-1];
          }

          int count  = 0;
         for(int i=1; i<arr.length; i++){
             for(int j=0; j<i; j++){
              int val  = arr[i] - arr[j];
                  if(val == k){
                      count++;
                  }
          }

          }
          return count;

      }
}
