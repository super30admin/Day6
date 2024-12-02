#Time Complexity: O(n)
#Space Complexity: O(n)
#Problem sucessfully accepted in leetcode: yes
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
#If only element is present, return 0
        if len(nums)==1:
            return 0
#Make all 0s in num array to -1
        for i,ele in enumerate(nums):
            if ele == 0:
                nums[i] = -1
        ans = 0
#Initialize hasmap
        freq = {0:-1}
#Iniliaze prefix sum to 0
        prefix = 0
        for i,ele in enumerate(nums):
#Add current element to prefix sum
            prefix = prefix+ele
#If prefix sum is present, max length of subarray
            if prefix in freq:
                ans = max(ans,i-freq[prefix])
#If prefix sum is not present, add it to hashmap with  current index
            else:
                freq[prefix] = i
        return ans