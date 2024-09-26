# // Time Complexity :O(n)
# // Space Complexity :O(n)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


# // Your code here along with comments explaining your approach




class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dict={}
        dict[0]=-1
        max=0
        rsum=0
        for i in range(len(nums)):
            if nums[i]==0:
                rsum=rsum-1
            else:
                rsum=rsum+1
            
            print(rsum)
            if rsum not in dict.keys():
                dict[rsum]=i
            else:
                a=i-dict[rsum]
                if(a>max):
                    max=a
        print(dict)
        return max