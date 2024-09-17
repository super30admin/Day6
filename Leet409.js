// Time Complexity : O(1)
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach : linear search and set using O(1) approach

/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    var sh = new Set();
    for(let i =0;i<s.length;i++)
    {
        if(!sh.has(s[i]))
        {
            sh.add(s[i]);
        }
        else
        {   sh.delete(s[i]);
            
        }
    }
    return s.length - (sh.size===0?0:sh.size-1);
    
};