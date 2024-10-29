class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        arr= [0]
        sum = 0
        for i in nums:
            if i == 0:
                sum = sum - 1
                arr.append(sum)
            else:
                sum = sum + 1
                arr.append(sum)
        result = {}
        maxc = 0
        for i in range(len(arr)):
            if arr[i] in result:
                maxc = max(maxc, i - result[arr[i]])
            else:
                result[arr[i]] = i
        return maxc



        