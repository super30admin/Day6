'''
Using set
TC: O(n)
SC:O(1)
'''
'''
class Solution:
    def longestPalindrome(self, s: str) -> int:
        map_char = set()
        count = 0
        for i in s:
            if i in map_char:
                map_char.discard(i)
                count += 2
            else:
                map_char.add(i)

        if len(map_char)>0:
            count  += 1
        return count

'''
'''
using dictionary
TC:O(n)
SC:O(1)
'''


class Solution:
    def longestPalindrome(self, s: str) -> int:
        dict1 = {}
        count = 0

        for char in s:
            if char not in dict1:
                dict1[char] = 1
            else:
                dict1[char] += 1

        for c in dict1:
            if dict1[c] % 2 == 0:
                count += dict1[c]
                dict1[c] = 0
            elif dict1[c] % 2 == 1 and dict1[c] != 1:
                count += dict1[c] - 1
                dict1[c] = 1
        for i in dict1:
            if dict1[i] == 1:
                count += 1
                break
        return count


