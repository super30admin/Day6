# Group Anagrams
# Time Complexity : 0(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = defaultdict(list)
        for i in strs:
            x = str(sorted(list(i)))
            if x not in d:
                d[x] = [i]
            else:
                d[x].append(i)
        return d.values()