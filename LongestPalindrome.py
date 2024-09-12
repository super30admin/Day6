class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
#         mem = set()
#         pairs = 0
#         for c in s:
#             if c in mem:
#                 pairs+=1
#                 mem.remove(c)
#             else:
#                 mem.add(c)
        
#         if(len(mem) != 0):
#             return 2*pairs+1
#         return 2*pairs

        # Time Complexity is O(n) and 
        # space complexity is O(1), since we only need to store a maximum of 26 lowercase alphabets
        mem = set()
        for c in s:
            if c in mem:
                mem.remove(c)
            else:
                mem.add(c)
        if(len(mem) != 0):
            return len(s) - len(mem) + 1
        return len(s)-len(mem)