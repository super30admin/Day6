class Solution:
    def longestPalindrome_hashmap(self, s: str) -> int:
        if not s:
            return

        count = 0
        smap = {}

        for i in range(len(s)):
            if s[i] in smap:
                smap[s[i]] += 1
            else:
                smap[s[i]] = 1
        odd = False
        maxodd = 0
        print(smap)
        for key, value in smap.items():
            if value % 2 == 0:
                count += value
            else:
                count = count + (value - 1)
                odd = True
        if odd:
            count += 1

        return count

    def longestPalindrome_hashset(self, s: str) -> int:
        if not s:
            return

        count = 0
        sset = set()
        for i in range(len(s)):
            if s[i] in sset:
                sset.remove(s[i])
                count += 2
            else:
                sset.add(s[i])
        if sset:
            count += 1
        return count