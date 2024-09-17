// Time: O(n), Space:O(1) - because max characters are 26
// Solution runs on leetcode and is accepted as well
var longestPalindrome = function(s) {
    if(s.length === 0 ) return 0;
    let hash_map = {}, max_len=0;
    for(let i=0;i<s.length;i++){
        if(s[i] in hash_map){
            max_len = max_len + 2;
            delete hash_map[s[i]]
        }else{
             hash_map[s[i]] = 1;
        }
    }
    if(Object.keys(hash_map).length >0){
        max_len++;
    }
    return max_len
}