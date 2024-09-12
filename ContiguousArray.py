# TC: O(N) where N is the size of the input array.
# SC: O(N) since we are using the hashmap to store and map the running sum to the index.

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        maxi = rSum = 0
        dict = {}
        dict[0] = -1
        
        for i in range(len(nums)):
            rSum = rSum + 1 if nums[i] == 1 else rSum - 1
            if rSum in dict:
                maxi = max(maxi, i - dict.get(rSum))
            else:
                dict[rSum] = i
        return maxi
