# Time, Space Complexity: O(n), O(n)
# RUNNING SUM TECHNIQUE
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        x = {0:-1}
        max1=0
        c = 0 # running sum
        j=0
        for i in nums:
            if(i==0):
                c-=1
            else:
                c+=1
            if(c not in x):
                x[c] = j
            else:
                if(max1<j-x[c]):
                    max1 = j-x[c]
            j+=1
        return max1