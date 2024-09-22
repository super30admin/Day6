// Time Complexity : O(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    var map = {};
    var count = 0;
    var sArray = s.split("");
    var oddCount = false;
     for(let i = 0; i < sArray.length; i++){
         if(sArray[i] in map){
             map[sArray[i]] += 1;            
         }else{
              map[sArray[i]] = 1;
              
         }
     }
     for(let char in map){
         if(map[char] % 2 === 0){
             count += map[char];
         }else if((map[char] -1 ) % 2 === 0){
              count += map[char]-1;
              oddCount = 1;
         }
     }
     if(oddCount) count +=1;
     return count; 
 };