# TC-O(n)
# SC-O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxi=0
        count=0
        hash1={}
        hash1[0]=-1
        for i in range(len(nums)):
            if nums[i]==0:
                count+=1
            else:
                count=count-1
            if count not in hash1:
                hash1[count]=i
            else:
                temp= i-hash1[count]
                if temp>maxi:
                    maxi=temp
        return maxi