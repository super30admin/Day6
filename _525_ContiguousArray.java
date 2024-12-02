// space complexity - o(n)
    	//time - o(n)
      //Ran on leeetcode successfully : Yes
      // Problem faced  : No
    	//Approach : same as subarray sum equals to k, changee 0 to -1 and k =0 (calculate Prefix sum array and store in map with frequency of that prefix sum, for current sum subtract target
      // and see if the number is there in map  and its hit, increase count by the frequency of prefix sum)
class Solution {
    public int findMaxLength(int[] nums) {

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                nums[i] = -1;
            }
        }

        int len = 0 ;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        for(int i=0; i<nums.length; i++){
           sum += nums[i];
            if(map.containsKey(sum-0))
                len = Integer.max(len, i-map.get(sum-0));

          if(!map.containsKey(sum)){
             map.put(sum ,i);
          }
        }

        return len;

    }

}
