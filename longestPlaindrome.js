/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    //edge case
    if(s == null || s.length == 0) return -1;
    let set = new Set();
    let palCount = 0;
    for(i=0; i<s.length; i++){
        if(!set.has(s[i])){
            set.add(s[i]);
        } else {
            set.delete(s[i]);
            palCount = palCount +2;
        }
    }
    if(set.size){
        palCount = palCount + 1;
    }
    return palCount;
    
};

// Time Complexity : O(n) - As we have to iterate through the entire string of n elements size.
// Space Complexity : Constant. Irrespective of the length of the string, we can store atmost 52 characters (a-z, A-Z) in a set.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/* each character of the string is added to set. if the character already exists
then the existing character in the set is removed and the count is increased by 2.
if the set has still any elements then any of the elements of the set can be added to the string extracted.*/