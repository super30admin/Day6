// Time Complexity : O(n) where n is length of string s
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/**
 * @param {string} s
 * @return {number}
 */
 var longestPalindrome = function(s) {
    const set = new Set();
    let count = 0;
    for (let i=0; i<s.length; i++) {
        const char = s[i];
        if(set.has(char)) {
            count += 2;
            set.delete(char);
        } else {
            set.add(char);
        }
    }
    if(set.size !== 0) count++;
    return count;
};


//Hash Map Solution

//  var longestPalindrome = function(s) {
//     let hashMap = new Map();
//     let count = 0;
//     for(let i = 0; i < s.length; i++) {
//         if(hashMap.has(s[i])) {
//             hashMap.set(s[i],hashMap.get(s[i]) + 1);
//         } else {
//             hashMap.set(s[i],1);
//         }
//     }
//     let oneUsedFlag = false;
//     hashMap.forEach((value,key) => {
//         let c = 0;
//         if(value%2 !== 0) {
//             c = Math.floor(value/2)*2;
//             if(!oneUsedFlag) {
//                 c += 1;
//                 oneUsedFlag = true;
//             }
//             hashMap.set(key,value-c);
//         } else {
//             c = value;
//             hashMap.set(key,value-c);
//         }
//         count += c;
//     });
//     return count;
// };