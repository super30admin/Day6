//Longest Palindrome (LC 409)

// Time Complexity : O(1)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes initially I had problems with only adding 1 odd from the hashmap

//Delete from hash map if it exisits already and increase count by 2. I will check the hashmap if it isn't empty and add 1 to the count. I had two loops but I switched it to one loop. I could change hashmap to set too.
/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    if(s === null || s.length === 0){
        return 0;
    }
    let freqMap = {};
    let count = 0;
    for(let char of s){
        if(freqMap[char]){
            delete freqMap[char];
            count+= 2;
        } else {
            freqMap[char] = 1;
        }
    }
    if(Object.keys(freqMap).length > 0){
        count++;
    }
    return count;
};