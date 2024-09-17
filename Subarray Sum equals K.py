# // Time Complexity : O(n) 
# // Space Complexity : O(n) 
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No


class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        prefixSumMap = dict()
        prefixSumMap[0] = 1
        #print(prefixSumMap)
        prefixSum = 0
        ctr = 0
        for num in nums:
            prefixSum += num
            print("PrefixSum:",prefixSum)
            excess = prefixSum - k
            print("Excess:", excess)
            if excess in prefixSumMap.keys():
                ctr += prefixSumMap[excess]
            else:
                ctr += 0
            if prefixSum in prefixSumMap.keys():
                prefixSumMap[prefixSum] += 1
                #print(prefixSumMap)
            else:
                prefixSumMap[prefixSum] = 1
                #print(prefixSumMap)
        return ctr
        