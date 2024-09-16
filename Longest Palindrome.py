#Time complexity : O(n)
# Space Complexity: O(n)
# Run on Leetcode: Yes
class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s) == 1:
            return 1
        elif len(s) == 0:
            return 0
        counter = Counter(s)
        count = 0
        oddEligible = False
        for i in counter:
            if counter[i] % 2 == 0:
                count += counter[i]
            elif counter[i] % 2 == 1:
                count += counter[i]-1
                oddEligible = True
        if oddEligible:
            count += 1
        return count