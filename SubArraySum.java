class SubArraySum {
    /*
    Brute force:
    would to check every possible subarray using 2 for loops. 
    this would be O(n^2) time and O(1) space
    */
    
    /*
    Method 1: to use sliding window technique to find the subarray havaing sum k
        does not work for all cases since test cases invlove negative numbers
        
        time complexity : O(n), n is the number of elements
        space complexity : O(1)
    */
//     public int subarraySum(int[] nums, int k)         
//     {
//         if(nums.length == 0 || nums == null){
//             return 0;
//         }
        
//         int count = 0;
//         int start =0;
//         int sum = 0;
        
//         */
//         for(int i =0; i < nums.length;i++){
//             //if the element itself is equal to k, the increment count
//             if(nums[i] == k){
//                 count++;
//             }
            
//             else{
//                 sum += nums[i];
//                 if(sum == k){
//                     count++;
//                     //reset the sum after finding the subarray
//                     sum = sum - nums[start];
//                     start = i;
//                 }
//             }
//         }
//         return count;
//     }
    
    
        /*
    method 2 - using HashMap
    Time complexit: O(n), n is the number of elements in the array
    space complexity: O(n)
    */
    public int subarraySum(int[] nums, int k) 
    {
        int count =0;
        int currSum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        
        for(int i =0 ;i < nums.length;i++)
        {
            //cumulative sum
            currSum += nums[i];
            //check if there exist an subaray  with sum k
            //this is done by check if currSum-k is present in hashmap
            if(map.containsKey(currSum - k))
            {
                count += map.get(currSum - k);
            }
            
            if(!map.containsKey(currSum))
            {
                map.put(currSum, 1 );
            }
            else{
                int val = map.get(currSum);
                map.put(currSum,val+1);
            }
        }
        
        return count;
    }
}
