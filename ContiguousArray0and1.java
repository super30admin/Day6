class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> storage = new HashMap();
        HashMap<Integer, Integer> subArrayPointers = new HashMap();
        ArrayList list = new ArrayList();
        int rSum =0; int maxSubArrayLen = 0;
        int start =0; int end=0;
        //base case
        storage.put(0,-1);
        
        for (int idx = 0 ;idx<nums.length;idx++){
            rSum = nums[idx]==0  ? rSum - 1 : rSum + 1; //Calculate rSum properly before starting to access storage
            if(storage.containsKey(rSum)){
              //  prevrSumIndex =  storage.get(rSum);  
                int curr = idx - storage.get(rSum);
              //  maxSubArrayLen = Math.max(maxSubArrayLen,curr);  to find maxlength of array
                if(curr > maxSubArrayLen){
                    maxSubArrayLen = curr;
                    start = storage.get(rSum);
                    end = idx;
                   
                    subArrayPointers.put(start,end);
                    list.add(subArrayPointers); //to collect all subarrays start and end. Iterate over them to get the values in the subarray 
                }
                
            }
            else{
                storage.put(rSum,idx);
            }
            
        }System.out.println("start "+start+" : end "+end);
        //next element from start for the subarray with max length
        for(int i = start+1 ;i<= end ;i++)
            System.out.println(nums[i]+",");
     return maxSubArrayLen;
   
}}

/*
TimeComplexity: O(n)
SpaceCompexity: O(n) hashmap used
*/