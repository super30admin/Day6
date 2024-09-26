// Time Complexity : O(n)
// Space Complexity : O(52) which is O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :

// ## Problem3 (https://leetcode.com/problems/longest-palindrome)
// Given a string which consists of lowercase or uppercase letters, find the length of 
// the longest palindromes that can be built with those letters.

// This is case sensitive, for example "Aa" is not considered a palindrome here.

// Note:
// Assume the length of given string will not exceed 1,010.

// Example:

// Input:"abccccdd"

// Output:7

// Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.


// --------------------------------------------------------------------

// if set has the char
//       remove it from the set and increase evenCount by 2
//else 
//       add char to the set 
//at the end check if set has elements in to see if you need to add +1 for 
//a single val in the middle
var longestPalindrome = function(s) {
    let charSet = new Set();
    let evenCount = 0;
    for(let char of s) {
        if(charSet.has(char)) {
            charSet.delete(char);
            evenCount += 2;
        }
        else charSet.add(char);
    }
    if(charSet.size > 0) return evenCount + 1;
    return evenCount;
};


