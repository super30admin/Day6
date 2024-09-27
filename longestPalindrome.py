# Time Complexity : O(N) where N is length of string
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no
class Solution:
    def longestPalindrome(self, s: str) -> int:
        count_dict = dict()
        for i in s:
            if i not in count_dict:
                count_dict[i] = 0

            count_dict[i] += 1

        values = list(count_dict.values())
        char = 0
        max_length = 0

        for i in values:
            if i % 2 == 0:
                max_length += i
            else:
                max_length += i - 1
                char = 1

        return char + max_length


r = Solution()
s = "abccccdd"
print("Length of longest palindrome that can be built is:", r.longestPalindrome(s))
