# Time Complexity: O(n)
# Space Complexity: O(1) Maximum - lowercase charecters(unique) - 26
# Solution using Hashset
# Code ran successfully on Leetcode
class Solution:
    def longestPalindrome(self, s: str) -> int:
        # Hash set to check the occurence
        counter = set()
        count = 0
        for ch in s:
            # if a charecter is already present, add 2 as 
            if ch in counter:
                count += 2
                # remove the key from set
                counter.remove(ch)
            else:
                # if no occurence, add the key to set
                counter.add(ch)
        # if any element is present, means that odd length 
        if len(counter) != 0:
            count +=1
        return count
s = Solution().longestPalindrome("abccccdd")
print(s)