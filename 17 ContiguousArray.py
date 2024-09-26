"""
// Time Complexity :O(n) where n=traveresing through each number(0/1)
// Space Complexity :O(1) for HashMap
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NA

//Explanation:
if num==1-->rsum+=1, if num==0-->rsum-=0
store rsum in hashmap to avoid repitative calculations
The rsum value in hashmap stores only LEAST INDEX at which rsum occurred
since problem is to return the length of maximum contiguous array.
max is updated if rsum exists in memory(returns least index value at
which rsum occurred) and the difference between current index and rsum> max
"""
class Solution:
  def findMaxLength(self, nums: List[int]) -> int:
    memory={}
    rsum=0
    max=0
    memory[0]=-1

    for idx in range(len(nums)):
      if nums[idx]==0:
        rsum-=1
      else:
        rsum+=1

      if rsum not in memory:
        memory[rsum]=idx
      else:

        max=idx-memory.get(rsum) if idx-memory.get(rsum)>max else max
    return max




if __name__=="__main__":
  s=Solution()
  print("Max Contiguous=",s.findMaxLength([1,0,1,0,1,1,1,1,0,0,0,1,0,0]))
