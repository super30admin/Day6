'''
time = O(n)

space = O(1)

was able to run on leet code -- yes

Faced any issue -- no

Method - Build a hasmap with character and its count. Run a for loop and see if the count is odd/even. If the number is even, add it directly to the result. If odd and greater than 1, subtract 1 from it and add it to the final result. If the count is 1, add it finally to the result
'''

class Solution:
    def longestPalindrome(self,s:str)->int:
        map = {}
        length = 0
        hasSingle = False
        for i in s:
            map[i]=map.get(i,0)+1
        
        for i in map:
            val = map[i]
            if(val%2==0):
                length+=val
            elif val==1:
                hasSingle=True
            else:
                length+=(val-1)
                hasSingle=True

        if hasSingle==True:
            length +=1

        return length

sol = Solution()
s = "abccccdd"
print(sol.longestPalindrome(s))