"""
560. Sub Array sum equals K
Approach --
1. Calculate running sum. Create an hMap and add {0:1} to
2. For each running sum check if rSum is in hMap. if so increase the value by 1. If not in hMap add the nums[i] with
value 1 to hMap.
3. Every time an element found in hMap, increment the count by 1 by first getting the correct value of this element
in hMap
4. Return the count
Time complexity - O(n) since we're traversing through the array
Space complexity - O(n) since we are including the entire array in hMap with their unique rSums
"""

arr = [1, 2, 3]
j = 3


def subarraySum(nums, k):
    if nums is None or len(nums) == 0 or k is None: return 0

    n = len(nums)
    rSum = 0
    count = 0

    # {0:1} is added to the hMap to cover the edge case
    hMap = {0: 1}

    for i in range(n):
        rSum = rSum + nums[i]

        if rSum - k in hMap:
            count = count + hMap[rSum - k]
        hMap[rSum] = hMap.get(rSum, 0) + 1

    return count


if __name__ == '__main__':
    print(subarraySum(arr, j))
