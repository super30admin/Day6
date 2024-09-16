/* Time complexity: O(n)
Space complexity: O(n)
1. Hashmap is used to have the cumulative sum (x) as keys and the number of times it occured as values.
2. while keeping track of above record, for each element, if we realise that there is (x-k) element existing in the hashmap, then we increament the count with the value equivalent to the value in hashmap corresponding to the key x-k in hashmap
3. This count would give us the number of subarrays present whose sume would add upto k */

class Solution{
    public int SubarraySum(int[] nums, int k){

        HashMap<Integer, Integer> subarrayCount = new HashMap<> ();
        int count = 0;
        int CurrSum = 0;
        subarrayCount.put(0,1);

        for(int i=0; i<nums.length(); i++){
            CurrSum += nums[i];
            if(subarrayCount.containsKey(CurrSum-k)){
                count += subarrayCount.get(CurrSum-k);
            }

            if(subarrayCount.containsKey(CurrSum)){
                int val = subarrayCount.get(CurrSum);
                val += 1;
                subarrayCount.put(CurrSum,val);
            }

            else{
                subarrayCount.put(CurrSum,1);
            }
        }

        return count;

    }
}