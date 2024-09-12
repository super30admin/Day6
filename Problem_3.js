// Time Complexity : O(N), where N is the length of array
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Problem3 (https://leetcode.com/problems/longest-palindrome)

/**
 * @param {string} s
 * @return {number}
 */
 var longestPalindrome = function(s) {
    if(s===null || s.length===0){
        return 0;
    }
    let ans = 0;
    let set = new Set();
    // Iterate through each char
    for(let i=0; i<s.length; i++){
        let ch = s[i];
        // If set contains the char, it occurs even times 
        // So, ans+=2. Then delete the char.
        if(set.has(ch)){
            ans+=2;
            set.delete(ch);
        } else {
            // Else add the char
            set.add(ch);
        }
    }
    // If the set has values. It has at least 1 odd char
    // So, ans++
    if(set.size>0){
        ans++;
    }
    return ans;
};