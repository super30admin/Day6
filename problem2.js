//// Time Complexity : O(n)
//// Space Complexity : O(n)
//// Did this code successfully run on Leetcode : yes
//// Any problem you faced while coding this :
// huge mental leaps just understanding the solution, cannot intuit it

//// Your code here along with comments explaining your approach
// sum = 0, max = 0
// for each element in input of [1s and 0s]
//   if element == 0 sum += 1
//   else sum -= 1

//   if sum == 0 you have a max from 0..currentindex which is equal to currentindex+1 length

//   if !hashmap.has(sum) hashmap.add(sum, currentindex)
//   else it has an entry...
//     ...see if the distance from currentindex to hashmap.get(sum) is greater than max
//     max = Math.max(max, currentindex-hashmap.get(sum)
var findMaxLength;

findMaxLength = function(nums) {
  var hashmap, max, sum;
  sum = 0;
  max = 0;
  hashmap = new Map();
  nums.forEach(function(num, index) {
    if (num === 0) {
      sum += 1;
    } else {
      sum -= 1;
    }
    if (sum === 0) {
      max = index + 1;
    }
    if (!hashmap.has(sum)) {
      return hashmap.set(sum, index);
    } else {
      return max = Math.max(max, index - hashmap.get(sum));
    }
  });
  return max;
};

findMaxLength([0, 1]);

findMaxLength([0, 0, 1, 0, 0, 0, 1, 1]);

//# sourceMappingURL=problem2.js.map
