const { run } = require("jest");

// Time Complexity: O(n)
// Space Complexity: O(n)

/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function (nums) {
  let sumMap = new Map();
  let runningSum = 0;
  let length = 0;
  sumMap.set(0, -1);

  for (let index = 0; index < nums.length; index++) {
    if (nums[index] == 0) {
      runningSum -= 1;
    } else {
      runningSum += 1;
    }
    if (sumMap.has(runningSum) == false) {
      sumMap.set(runningSum, index);
    } else {
      let runningLength = index - sumMap.get(runningSum);
      length = Math.max(runningLength, length);
    }
  }

  return length;
};

test("Scenario #1: Basic Validation", () => {
  let input = [];
  expect(findMaxLength(input)).toStrictEqual(0);
});

test("Scenario #2: Happy Path", () => {
  let input = [1, 0, 1, 0];
  expect(findMaxLength(input)).toStrictEqual(4);
});

test("Scenario #3: Complex But Valid", () => {
  let input = [1, 1, 1, 0, 1, 0, 1, 1];
  expect(findMaxLength(input)).toStrictEqual(4);
});

test("Scenario #3: Negative", () => {
  let input = [1, 1, 1, 1, 1, 1, 1];
  expect(findMaxLength(input)).toStrictEqual(0);
});
