/* Time complexity: O(n)
Space complexity: O(n)
1. Using hashmap to find the longest subarray with equal number of 1's and 0's by storing the cumulative sum as key and the index of it as value
2. whenever 1 occurs in array, cumulative sum is incremented by 1 and otherwise the same is decremented by 1. 
3. When the cumulative sume equals 0 (k=0), increment the count variable by the value corresponding to the key, x-k (same as x since k=0 here). which shpuld give the length of the subarray at any point with equal number of 1s and 0s. */


class Solution{
    public int subarrayLength(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<> ();
        int count = 0;
        int index = 0;

        for(int i=0; i<nums.length(); i++){
            if(nums[i] == 1){
                count += 1;
            }
            else{
                count -= 1;
            }

            if(count == 0){
                index = i+1;
            }

            if(!map.containsKey(count)){
                map.put(count, i);
            }
            else{
                index = Math.max(index, i-map.get(count));
            }
        }

        return index;
    }
}

