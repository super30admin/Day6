/**
 * TC : O(N)
 * SC : O(N)
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function(s) {
    var set = new Set();
    for(let i=0;i<s.length;i++){
        if(set.has(s[i])){
            set.delete(s[i]);
        }
        else{
            set.add(s[i]);
        }
    }
    return s.length - (set.size===0?0:set.size-1);
};
