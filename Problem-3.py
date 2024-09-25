'''
    Time Complexity: O(n)
    Space Complexity: O(1)
    Approach: Use a hashset to add characters on odd occurences and remove on even occurences. 
    On even occurence add 2 in result during traversal. 
    After traversal check if there are more characters and add 1

'''
class Solution:
    def longestPalindrome(self, s: str) -> int:
        # hashMap = {}
        # oddFlag = False
        # count = 0

        # for char in s:
        #     if char in hashMap:
        #         hashMap[char] += 1
        #     else: 
        #         hashMap[char] = 1

        # for char in hashMap.keys():
        #     freq = hashMap[char]

        #     if freq % 2 == 0:
        #         count += freq
        #     else:
        #         count += freq - 1
        #         oddFlag = True

        # if oddFlag:
        #     count += 1

        # return count

        charSet = set()
        count = 0

        for char in s:
            if char not in charSet:
                charSet.add(char)
            else:
                count += 2
                charSet.remove(char)

        if len(charSet):
            count += 1

        return count