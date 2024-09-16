#TC: O(nk)
#SC: O(1)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        dict = {}
        for char in s:
            if char in dict:
                dict[char] += 1
            else:
                dict[char] = 1
        
        print(dict)
        odd = False
        count = 0
        for key in dict:
            if dict[key]%2 != 0:
                odd = True
            count += 2*(dict[key]//2)
        if odd:
            count += 1
        return count
