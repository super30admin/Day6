"""
525. Contiguous Array

HashMap Approach --

Why is hMap initialized with base value {0 : -1}
1. If we had num = [0, 1], the rSum would be -1, 0 and the hMap without base condition would be hMap = {-1 : 0, 0 : 1}.
2. This would give us length = 0. However, the correct length is 2
3. Hence, if we had base condition hMap = {0: -1} , rSum --> 0, -1. The hMap would be hMap = {0: -1, -1 : 0} and for
the last value 0:1, we'd see the key 0 is already present in the hMap.
Hence, length would be, length = new_idx - old_idx_val , i.e. 1 - (-1) = 2

TC - O(n)
SC - O(n)
"""

# arr = [0, 1]
arr = [0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1]


def findMaxLength(nums):
    if nums is None or len(nums) == 0: return 0

    n = len(nums)
    rSum = 0
    hMap = {0: -1}
    maxLen = 0

    for i in range(n):
        if nums[i] == 1:
            rSum += 1
        else:
            rSum -= 1

        if rSum not in hMap:
            hMap[rSum] = i
        else:
            maxLen = max(maxLen, i - hMap[rSum])
    return maxLen


if __name__ == '__main__':
    print(findMaxLength(arr))
