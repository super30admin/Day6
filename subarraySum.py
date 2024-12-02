"""
Time complexity: O(n)
Space complexity: O(n)
"""


def subarraySum(nums, k):
    hm = {0: 1}
    prefix_sum = 0
    result = 0

    for num in nums:
        prefix_sum += num
        if prefix_sum - k in hm:
            result += hm[prefix_sum - k]
        if prefix_sum in hm:
            hm[prefix_sum] += 1
        else:
            hm[prefix_sum] = 1

    return result


print(subarraySum([1, 1, 1], 2))
print(subarraySum([1, 2, 1, 2, 1, 2, 1], 3))
