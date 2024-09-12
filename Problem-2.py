# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : N/A


# Your code here along with comments explaining your approach
def findMaxLength(self, nums: List[int]) -> int:
    hsh = { 0: -1}
    count = 0
    maxLen = 0

    # Cumulative Sum approach
    for i in range(len(nums)):

        # If nums[i] is 1, we increase count, else decrease
        if nums[i]:
            count += 1
        else:
            count -= 1
        
        # If the current count is encountered earlier, we know that the count of 1s and 0s is the same 
        # from the previous index till current
        if count in hsh:
            maxLen = max(maxLen, i-hsh[count])
        else:
            hsh[count] = i
    return maxLen