# Time Complexity : O(N)
# Space Complexity : O(N)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A


# Your code here along with comments explaining your approach
def subarraySum(self, nums: List[int], k: int) -> int:
    hsh = {}
    curSum = 0
    count = 0
    hsh[0] = 1

    # Keep track of Cumulative Sum 
    for i in range(len(nums)):
        curSum += nums[i]

        # If curSum at nums[j] and curSum at nums[i] has a difference of `k`, we found a subarray with k sum
        if curSum - k in hsh:
            count += hsh[curSum - k]
            
        # We store the sum in the hash, so we can check if curSum-k is encountered before
        if curSum in hsh: 
            hsh[curSum] += 1
        else:
            hsh[curSum] = 1
        
    return count