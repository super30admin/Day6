// Time Complexity : O(N)
// Space Complexity : O(1) since the max number of chars in my set will be 26. Thus my tc is constant.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

var longestPalindrome = function (s) {
  let count = 0;
  const stringSet = new Set();
  // console.log("stringset:", stringSet);
  for (let i = 0; i < s.length; i++) {
    if (!stringSet.has(s[i])) {
      stringSet.add(s[i]);
    } else {
      stringSet.delete(s[i]);
      count += 2;
    }
  }
  if (stringSet.size) {
    return (count += 1);
  }
  return count;
};

console.log(longestPalindrome("abccccdd"));
