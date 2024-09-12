# Time Complexity : O(n)
# Space Complexity : O(26) --> O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
# Your code here along with comments explaining your approach
# create a set and add values to it if the value is not present in the set
# if it is present in the set which means a pair is found increment counter by 2 and remove that element from set
# at last we check whether there is any element in set,
# if yes which means there is an element that is unpaired, we can add that to our palindrome
# simply add 1 to count.

class Solution:
    def longestPalindrome(self, s: str) -> int:
        h = set()
        count = 0
        for i in s:
            if i not in h:
                h.add(i)
            elif i in s:
                count += 2
                h.remove(i)
        if h:
            count += 1
        return count


check = Solution()
print(check.longestPalindrome("abccccdd"))


# class Solution:
#     def longestPalindrome(self, s: str) -> int:
#         dictu = {}
#         for i in s:
#             if i not in dictu:
#                 dictu[i] = 1
#             else:
#                 dictu[i] += 1
#         count = 0
#         flag = 0
#         for i in dictu:
#             if dictu[i] % 2 == 0:
#                 count += dictu[i]
#             else:
#                 count += dictu[i] - 1
#                 flag = 1
#         if flag == 1:
#             count += 1
#         return count
#
#
# check = Solution()
# print(check.longestPalindrome("abccccdd"))