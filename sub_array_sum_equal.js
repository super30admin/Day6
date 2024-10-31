const { run } = require("jest");

// Time Complexity: O(n)
// Space Complexity: O(n)

/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var subarraySum = function (nums, k) {
  let map = new Map();
  let count = 0;
  let runningSum = 0;
  map.set(0, 1);
  for (let index = 0; index < nums.length; index++) {
    runningSum += nums[index];
    let complement = runningSum - k;
    if (map.has(complement)) {
      count += map.get(complement);
    }
    map.set(runningSum, map.get(runningSum) ?? 1);
  }
  return count;
};

test("Scenario #1:", () => {
  let numbers = [3, 4, 7];
  let target = 7;
  expect(subarraySum(numbers, target)).toStrictEqual(2);
});

test("Scenario #1:", () => {
  let numbers = [3, 2, 1];
  let target = 3;
  expect(subarraySum(numbers, target)).toStrictEqual(2);
});

test("Scenario #2:", () => {
  let numbers = [1, 1, 1];
  let target = 2;
  expect(subarraySum(numbers, target)).toStrictEqual(2);
});

test("Scenario #3:", () => {
  let numbers = [1, 1, 1, 1, 1, 1];
  let target = 3;
  expect(subarraySum(numbers, target)).toStrictEqual(4);
});

test("Scenario #4:", () => {
  let numbers = [2, 4, 5];
  let target = 1;
  expect(subarraySum(numbers, target)).toStrictEqual(0);
});
