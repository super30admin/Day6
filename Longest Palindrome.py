#TC: O(n)
#SC: O(1) 

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash_map = dict()
        count = 0
        for i in range(len(s)):
            if s[i] in hash_map:
                hash_map[s[i]] += 1
            else:
                hash_map[s[i]] = 1
        odd_flag = False
        for item in hash_map.values():
            if item % 2 == 0:
                count += item
            else:
                if item > 1:
                    count += item - 1
                    odd_flag = True
                elif odd_flag == False and item == 1:
                    odd_flag = True
        if odd_flag == True:
            count += 1
        return count
                
            