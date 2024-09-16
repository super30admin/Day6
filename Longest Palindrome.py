# time complexity is o(n), where 'n' is the size of the input
# space complexity is o(1)
class Solution:
    def longestPalindrome(self, s: str) -> int:
        sset = set()
        count = 0
        for i in s:
            if( i not in sset):
                sset.add(i)
            else:
                count += 2
                sset.remove(i)
        if len(sset) >= 1:
            return count + 1
        else:
            return count
            
        