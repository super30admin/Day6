# 409. Longest Palindrome
#Using hashmap
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash_map = {}
        count = 0
        flag = False

        for c in s:
            hash_map[c] = hash_map.get(c, 0) + 1

        for c in hash_map:
            freq = hash_map[c]

            if freq % 2 == 0:
                count = count + freq
            else:
                count += freq - 1
                flag = True
        if flag: return count+1
        return count

#Using Set
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash_set = set()
        count = 0

        for c in s:
            if c in hash_set:
                count += 2
                hash_set.remove(c)
            else:
                hash_set.add(c)
        if len(hash_set) > 0:return count + 1
        return count


        