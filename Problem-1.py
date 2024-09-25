'''
    Time Complexity: O(n)
    Space Complexity: O(n)
    Approach: Running Sum - Calculate running sum of each index and store the count of its appearances. 
    Calculate complement = rSum - k, check if complement appeared as a running sum. 
    If yes, add the count of the complement appearance to the result.
'''
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count = 0
        rSum = 0
        rsumMap = {0: 1}

        for i in range(len(nums)):
            rSum += nums[i]
            complement = rSum - k

            if complement in rsumMap: 
                count += rsumMap[complement]

            if rSum not in rsumMap: 
                rsumMap[rSum] = 1
            else:
                rsumMap[rSum] += 1

        return count

            

