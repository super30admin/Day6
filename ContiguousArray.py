#Time complexity:O(n)
#Space complexity:O(n)
class Solution:
    def findMaxLength(self, nums) -> int:
        dict1={0:-1}
        max_res=0
        running_sum = 0
        for i in range(len(nums)):
            if nums[i]==1:
                running_sum+=1
            else:
                running_sum-=1
            if running_sum in dict1:
                max_res= max(max_res,i-dict1[running_sum])
            else:
                dict1[running_sum]=i
        return max_res