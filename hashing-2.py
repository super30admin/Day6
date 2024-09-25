#!/usr/bin/env python
# coding: utf-8

# In[1]:


#Time complexity: O(n)
#Space complexity:O(1)
#executed in leetcode
#no difficulty faced 
class Solution:
    def longestPalindrome(self, s: str) -> int:
        d=dict()
        length=0
        switch=False
        for l in s:
            if l in d:
                d[l]+=1
            else:
                d[l]=1
        for k in d.values():
            if k>=2:
                if k%2==0:
                    length=length+k
                else:
                    length+=k-1
                    switch=True
            else:
                switch=True
        return length+1 if switch else length


# In[ ]:


#time complexity: O(n)
#space complexity:O(n)
#executed in leetcode
#faced difficuylty in understanding how to deal when we get same running sum again
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count=0
        rsum=0
        d=dict()
        d[0]=1
        for i in range(len(nums)):
            rsum+=nums[i]
            if rsum-k in d.keys():
                count+=d[rsum-k]
            if rsum in d.keys():
                d[rsum]+=1
            else:
                d[rsum]=1
        return count


# In[ ]:


#Time complexity: O(n)
#Space complexity:O(n) in worst case
#executed in leetcode
#no difficulty faced 
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        rsum=0
        maxi=0
        d=dict()
        d[0]=-1
        #traverse once through list with running sum
        for i in range(len(nums)):
            if nums[i]==0:
                rsum-=1
            else:
                rsum+=1
            if rsum in d.keys():
                maxi=max(maxi,i-d[rsum])
            else:
                d[rsum]=i
        return maxi

