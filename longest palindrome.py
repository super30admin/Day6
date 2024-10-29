class Solution:
    def longestPalindrome(self, s: str) -> int:
        map = {}
        for char in s:
            if char not in map.keys():
                map[char] = 1
            else:
                map[char] += 1
        
        count = 0
        flag = False
        for key in map.keys():
            if map[key] % 2 == 0:
                count += map[key]
            else:
                flag = True
                count += map[key] - 1
        
        if flag == True:
            return count + 1
        return count
        
