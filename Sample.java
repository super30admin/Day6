// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



// class Solution {
//     // TC O(n) , SC O(n)
//     public int subarraySum(int[] nums, int k) {
//          if(nums == null || nums.length ==0) return 0;

//         HashMap<Integer, Integer> map = new HashMap<>();
//          int total = 0;
//          int rSum = 0;
//          map.put(0,1);
//          for(int i =0; i<nums.length;i++){
//              rSum = rSum + nums[i];
//              if(map.containsKey(rSum-k)){
//                  total += map.get(rSum-k);
//              }
//              //map.put(rSum, map.getOrDefault(rSum, 0)+1);
//              if(map.containsKey(rSum)){
//                  int temp = map.get(rSum);
//                  map.put(rSum, temp+1);
//              }
//              else {map.put(rSum, 1);}
//          }
//         return total;

//     }
// }

// class Solution {
//     public int findMaxLength(int[] nums) {
//         if(nums == null || nums.length ==0) return 0;

//         HashMap<Integer, Integer> map = new HashMap<>();
//         map.put(0, -1);
//         int count = 0;
//         int max = 0;
//         for(int i =0; i<nums.length; i++){
//             if(nums[i] ==0){
//                 count--;
//             } else {
//                 count++;
//             }
//             if(map.containsKey(count)){
//                 max = Math.max(max, i - map.get(count));
//             } else{
//                 map.put(count, i);
//             }
//         }
//         return max;

//     }
// }



// class Solution {
//     //TC: O(n) SC: O(1)
//     public int longestPalindrome(String s) {
//         int maxPalendrome = 0;
//         HashSet<Character> myset = new HashSet<>();
//         for(int i =0; i<s.length();i++){
//             char c = s.charAt(i);
//             if(myset.contains(c)){
//                 maxPalendrome +=2;
//                 myset.remove(c);
//             }
//             else{
//                 myset.add(c);
//             }

//         }
//     if(myset.isEmpty()){

//         return maxPalendrome;

//     }else

//         return maxPalendrome+1;




//         }
// }





