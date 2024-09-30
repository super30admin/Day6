// this approach will be using running sum concept. A hashmap is maintained to mark the running sum and the index at which the running sum is computed.At any point while computing the running sum at each index if the difference of the target and the running sum is presen, this means that the suarray between that index and the index of running sum that is equal to the difference would give us the subarray that has the sum equal to the target.

// Time Complexity: O(n) 
// Space Complexity: O(n) since we are using a HashMap.

class SubArraySum {
    public int subarraySum(int[] nums, int k) {
        
        if(nums.length ==0 || nums == null) return 0;
        
        //logic
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int rSum=0, numberOfArrays =0, target = k;
        map.put(0,1);
        for(int i: nums){
            rSum+=i;
            if(!map.containsKey(rSum)){  
                if (map.containsKey(rSum-target)){
                    numberOfArrays+=map.get(rSum-target);
                }
                map.put(rSum,1);
            }
            else{
                 if(map.containsKey(rSum-target)){
                    numberOfArrays+=map.get(rSum-target);
                }
                map.put(rSum, map.get(rSum)+1);
                
            }
        }
        return numberOfArrays;
        
    }
}