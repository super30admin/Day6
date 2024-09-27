# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
#    - Was able to code brute force solution but It was not accepted by Leetcode because of time constraint.
#    - From the leetcode hints and this topic I knew taht I have to use hashtable to store some value.
#      But I wasn't able to figure out what to store in hashtable to optimize the code. I have to look throught discussion to get the idea. 

# Your code here along with comments explaining your approach
def sumofsubarray(nums, k):
    ans = 0
    data = dict()
    data[0] = 1
    total = 0
    for i in range(len(nums)):
        #keeping sum till ith element.
        total += nums[i]
        # If difference is found add count to the total number.
        if (total - k) in data:
            ans += data[total-k]
        #storing count of sum combination
        data[total] = data.get(total, 0) + 1
    return ans
