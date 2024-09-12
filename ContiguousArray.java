/*
// Time Complexity : O(n), n is the number of elements
// Space Complexity : O(1), Hashmap with constant space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
*/

class ContiguousArray {
    public int findMaxLength(int[] nums) {
        
        if(nums.length == 0){
            return 0;
        }
        
        int start =0;
        int count =0;
        int currsum =0;
        
        int maxLength = 0;
        
        
        /*
        for every 0 encountered, add +1 to sum
        else, if 1 encountered, add -1 to sum
        
        At any given point if sum == 0, that means the subarray has equal number of 0's and 1's, hence count++;
        
        */
        
        //method 1 : used sliding window technique didnt work for all test cases
//         for(int i =0; i < nums.length;i++){
//             int elt = nums[i];
            
//             if(elt == 0){
//                 currWindowSum = currWindowSum +1;
//             }
//             else if(elt == 1){
//                 currWindowSum = currWindowSum -1;
//             }
            
//             if(currWindowSum == 0){
//                 count++;
//                 currWindowSum = currWindowSum -1;
//                 int currWindow = i - start +1;
//                 if(currWindow > maxLength){
//                     maxLength = currWindow;
//                 }
//                 start =i;
//             }
//         }
//         return maxLength;
        
        //using hashmap to keep count of subarrays
        HashMap<Integer,Integer> map = new HashMap<>();
        
        
        //save sum,index as key,value pair in hashmap
    
       // map.put(0,-1);
        //for(int i= 0; i < nums.length;i++){
            
         //   int elt = nums[i];
           // if(elt == 0){
             //   currsum = currsum  - 1;
           // }else if(elt == 1){
           //     currsum = currsum + 1;
           // }
            
           // if(map.containsKey(currsum)){
           //     maxLength = Math.max(maxLength, i - map.get(currsum));
           // }else{
          //      map.put(currsum,i);
          //  }
       // }
       // return maxLength;
      /*
        method 3: running sum method explained in class
        Time complexity: O(n)
        space complexity :O(n)
        */
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int rSum =0;
        int maxLen =0;
        for(int i = 0; i < nums.length;i++){
            rSum = nums[i] == 0 ? rSum -1 : rSum +1;
            
            if(!map.containsKey(rSum)){
                map.put(rSum, i);
            }
            else{
                maxLen = Math.max(maxLen, i - map.get(rSum));
            }
        }
        
        return maxLen;
    }
}
