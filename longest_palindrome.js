// Time Complexity: O(n)
// Space Complexity: O(n)

/**
 * @param {string} s
 * @return {number}
 */
var longestPalindrome = function (s) {
  let charSet = new Set();
  let count = 0;

  for (let index = 0; index <= s.length - 1; index++) {
    let charactor = s.charAt(index);
    if (charSet.has(charactor) == true) {
      count += 2;
      charSet.delete(charactor);
    } else {
      charSet.add(charactor);
    }
  }

  return charSet.size > 0 ? count + 1 : count;
};

test("Scenario #1: Basic Validation", () => {
  let input = "";
  expect(longestPalindrome(input)).toStrictEqual(0);
});

test("Scenario #2: Happy Path", () => {
  let input = "aba";
  expect(longestPalindrome(input)).toStrictEqual(3);
});

test("Scenario #3: Negative", () => {
  let input = "abc";
  expect(longestPalindrome(input)).toStrictEqual(1);
});

test("Scenario #4: Complex Positive", () => {
  let input = "abccccdd";
  expect(longestPalindrome(input)).toStrictEqual(7);
});
