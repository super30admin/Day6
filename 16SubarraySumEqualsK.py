"""
// Time Complexity :O(n) where n=traveresing through each number
// Space Complexity :O(1) for HashMap
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NA

//Explanation:
When compl i.e k-rsum present in hashMap memory, increase count by compl value
store rsum in memory. if rsum already in memory, increas it's count
"""
from typing import List
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        memory = {}
        memory[0] = 1
        count,rsum,comp = 0,0,0

        #Edge case
        if nums is None or len(nums) == 0:
          return None

        for i in range(len(nums)):
          rsum += nums[i]
          compl = rsum-k

          if compl in memory:
            count += memory.get(compl)
          if rsum not in memory:
            memory[rsum] = 1
          else:
            memory[rsum] += 1

        #print(memory)
        return count

if __name__=="__main__":
  s=Solution()
  arr=[3,4,7,2,-3,1,4,2,0,1]
  k=7
  print("Continuous subarray sum=",s.subarraySum(arr,k))
