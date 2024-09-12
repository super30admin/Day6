class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        countArray=dict()
        maxc=0
        curcount=0
        countArray[0]=-1
        curSum=0
        for i in range(len(nums)):
            if (nums[i])==0:
                curSum-=1
            else:
                curSum+=1
            #If curSum present 
            if curSum in countArray:
                
                maxc=max(maxc,i-countArray[curSum])
            else:
                countArray[curSum]=i
        return maxc
      #Time O(n)
      #Space O(n)
