# Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes.
# Any problem you faced while coding this : Had a hard time understanding how to tackle the first DICTIONARY key value
# pair as {0:-1}. Tried to do the solution without ENUMERATE has also given me trouble. 


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hmap={0:-1}  #Why dictionary is 0:-1?
                #This makes sense as you need it when the first occurrence of 0 is let’s say 1
#index 1 to 0 is length 2. 
#index-hmap[0] ⇒ 1-(-1) = 2

        ct,res=0,0
        for i,val in enumerate(nums):
            if val==1:
                ct+=1
            else:
                ct-=1
            """
            if ct==0:
                res=i+1
            """
            
            if ct not in hmap:
                hmap[ct]=i
            else:
                if res< (i-hmap[ct]): #Instead of using MAX built-in function, do the comparision
                    res=(i-hmap[ct])
        #print(hmap)
        return res
