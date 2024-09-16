// Time Complexity : O(n) where n length of string s.
// Space Complexity : O(1) auxilliary space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/**
Algorithm : Using Hash Set

Whenever we find second character remove from set and increment longestPalindrome by 2.
In the end just check if we have odd frequency character in set by checking set.size()
if true then add 1 else return longestPalindrome
**/

/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    const palSet = new Set();
    let longestPalindrome = 0;
    
    for(var ch of s){
        if(palSet.has(ch)){
            longestPalindrome = longestPalindrome + 2;
            palSet.delete(ch); 
        }
        else palSet.add(ch);
    }
    
    if(palSet.size > 0)
        return longestPalindrome+1;
    return longestPalindrome;
    
    
};