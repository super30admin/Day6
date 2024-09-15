#LC 290 , Word Pattern
# Time Complexity : O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        if len(pattern) == 1: 
            return True 
        my_dict = {}
        if ' ' in s:
            s = s.split()
        else:
            return False
        if len(pattern) < len(s): 
            return False
        for i in range(len(pattern)):
            if pattern[i] not in my_dict:
                if s[i] not in list(my_dict.values()):
                    my_dict[pattern[i]] = s[i]
                else:
                    return False
            else:
                if s[i] != my_dict[pattern[i]]:
                    return False
        return True
        