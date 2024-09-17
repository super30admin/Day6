# Running on Leetcode:   Yes
# Time cpmlexity:    O(n)
# Memory complexity:  O(n)


class Solution:
    def longestPalindrome(self, s):
        if not s:
          return 0
        d = {}
        for i in s:
            if i not in d:
                d[i] = 1
            else:
                d[i] +=1
        count = 0
        x = 0
        for i in d:
            if d[i]%2 != 0:
                if d[i]<2:
                    x +=1
                else:
                    count+=2*(d[i]//2)
                    x+=1
            else:
                count+=d[i]
            print("count",count)
        print(d)
        if not x:
            return count
        else:
            return count+1
