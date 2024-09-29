# time complexity: O(n)
# space complexity: O(n)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        x = {}
        count = 0
        has_odd = False

        for char in s:
            if char in x:
                x[char] += 1
            else:
                x[char]=1

        for freq in x.values():
            if freq % 2 == 0:
                count += freq
            else:
                count += freq - 1
                has_odd = True
        
        if has_odd:
            count += 1
        
        return count

        # x = set()
        # count = 0

        # for char in s:
        #     # if char already in set count+2 and remove from set, else add to set
        #     if char in x:
        #         count += 2
        #         x.remove(char)
        #     else:
        #         x.add(char)
        # if len(x)!=0:
        #     return count+1
        # return count