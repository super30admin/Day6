'''
LOGIC - Using Hashset
Time Complexity: O(n), where n is the length of the list
Space Complexity: O(n), where n is the length of the list
Successfully executed all the test cases
'''

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        temp = {0:1}
        rsum = 0
        result = 0
        for ind, ele in enumerate(nums):
            rsum += ele
            if rsum-k in temp:
                result += temp[rsum-k]
            if rsum not in temp:
                temp[rsum] = 0
            temp[rsum] = temp.get(rsum) + 1
        return result