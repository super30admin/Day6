#TC = O(n)
#SC= O(n)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        subarray=0
        count=0
        dict1={}
        for i in range(len(nums)):
            if nums[i]==0:
                count+=-1
            else:
                count+=1
            if count==0:
                subarray=i+1
                
            if count in dict1:
                subarray=max(subarray,i-dict1[count])
            else:
                dict1[count]=i
        return subarray 