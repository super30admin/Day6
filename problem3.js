//// Time Complexity : O(n)
//// Space Complexity : O(n) using a hashmap of unknown size
//// Did this code successfully run on Leetcode : yes
//// Any problem you faced while coding this : none

//// Your code here along with comments explaining your approach
// count = 0
// hashmap = new Map()
// for each letter in string
//   if hashmap.has(letter)
//     remove letter from hashmap
//     count += 2
//   else
//     hashmap.set(letter)

// return hashmap.isEmpty() ? count : count + 1
var longestPalindrome;

longestPalindrome = function(s) {
  var count, hashmap;
  count = 0;
  hashmap = new Map();
  s.split('').map(function(letter, index) {
    if (hashmap.has(letter)) {
      hashmap.delete(letter);
      return count += 2;
    } else {
      return hashmap.set(letter);
    }
  });
  if (hashmap.size === 0) {
    return count;
  }
  return count + 1;
};

//longestPalindrome('abccccdd')

//# sourceMappingURL=problem3.js.map
