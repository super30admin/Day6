// time complexity: O(n)
// space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    let m = new Map();
    let max = 0;
    let oddFound = false;
    for(let i=0; i<s.length; i++){
        let char = s.charAt(i)
        if(m.has(char)){
            m.set(char, m.get(char)+1)
        } else {
            m.set(char, 1)
        }
    }
    m.forEach((val, key) => {
        if(val % 2 === 0){
            max += val;
        } else {
            max += val - 1;
            oddFound = true
        }
    })

    if(oddFound){
        max++;
    }

    return max;
};