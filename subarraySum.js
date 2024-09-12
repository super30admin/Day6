// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes. I still find it very hard to understand the running sum concept.

// Optimized Approach
var subarraySum = function (nums, k) {
  let rSum = 0;
  let sumMap = {};
  let count = 0;
  sumMap[0] = 1;
  for (i = 0; i < nums.length; i++) {
    rSum += nums[i];
    if (sumMap[rSum - k] !== undefined) {
      count += sumMap[rSum - k];
    }
    if (!sumMap[rSum]) {
      sumMap[rSum] = 1;
      continue;
    }
    sumMap[rSum] = sumMap[rSum] + 1;
  }
  return count;
};

console.log(subarraySum([1, 2, 3, 0, 1, 1, 1, 2, 3, 3], 3));

// Brute force approach TC: O(n^2); SC: O(n);
var subarraySum = function (nums, k) {
  let count = 0;
  for (let i = 0; i < nums.length; i++) {
    let current = nums[i];
    if ((i === nums.length - 1 && nums[i] === k) || nums[i] === k) {
      count++;
    }
    for (let j = i + 1; j < nums.length; j++) {
      current += nums[j];
      if (current === k) {
        count++;
      }
    }
  }
  return count;
};
