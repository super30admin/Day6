# Time Complexity : O(n) = n
# Space Complexity : O(n) = 1
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No problems after learning the solution in class

#Approach:
# Using the set method for class. Adding to the set if the element is not present in set else removing the element
# and incrementing count by 2. At the end if there are any element left add 1 to result to make if odd length
# palindrome

from collections import defaultdict
class Solution:
    def longestPalindrome(self, s):
        bag = set()
        result = 0
        for l in s:
            if l in bag:
                bag.remove(l)
                result += 2
            else:
                bag.add(l)
                
        if len(bag) > 0:
            result += 1
        return result

if __name__ == "__main__":
    s = Solution()
    print(s.longestPalindrome("abccccdd"))