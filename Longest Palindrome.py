class Solution:
    def longestPalindrome(self, s: str) -> int:
        # map = {}
        # for i in range(len(s)):
        #     schar = s[i]
        #     if schar not in map:
        #         map[schar] = 1
        #     else:
        #        map[schar] = map[schar] + 1


       
        # count = 0
        # odd = False
        # for key in map:
            
        #     if map[key] % 2 == 0:
        #         count = count + map[key]
        #         map[key] = None
        #     elif map[key] > 1:
        #         count = count + map[key] - 1
        #         map[key] = 1
        #         odd = True
        #     else:
        #         odd = True

        # if odd == True:
        #     count = count +1
        
        # return count       
        if s == None or len(s) == 0:
            return 0
        count = 0
        myset = set()

        for i in range(len(s)):
            if s[i] not in myset:
                myset.add(s[i])
            else:
                count = count+2
                myset.remove(s[i])   

        if myset:
            count = count + 1
        return count             






        