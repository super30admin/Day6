'''
Time Complexity : O(n)
Space Complexity : O(n)
'''
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        if nums is None:
            return 0

        counter, result = 0, 0
        zeroonedict = dict()
        zeroonedict[0] = -1

        for i, num in enumerate(nums):
            if num == 0:
                counter -= 1
            else:
                counter += 1
            if counter not in zeroonedict:
                zeroonedict[counter] = i
            else:
                result = max(result, i - zeroonedict[counter])

        return result