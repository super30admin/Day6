# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach
def subarraySum(nums, k):   
    dict = {}
    dict[0] = 1
    sum = 0
    res = 0
    for i in range(0,len(nums)):
        sum += nums[i]
        if sum-k in dict:
            res += dict[sum-k]
        if sum not in dict:
            dict[sum] = 0
        dict[sum] += 1
    return res

nums = [1,-1,0]
k = 0
print(subarraySum(nums,k))


