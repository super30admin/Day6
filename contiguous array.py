# Time Complexity : Add - O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
1. The algorithm leverages uses the running sum to find the balanced subaray between any given running sum
2. The Running sum is calculated by incrementing 1 for every 1 and decrementing 1 for every 0
3. IF running sum appears again, then it confirms the presece of balanced sub array. thus, to check if a running
   sum appeared earlier we need to search
4. Therefore I keep storing the running sum in a hashmap to enable O(1) key search
'''

def findMaxLength(self, nums):
    
    if nums == [] or len(nums) < 1:
        return 0

    rsum = 0
    rsum_dict = {rsum:-1}
    max_len = 0
    for i in range(len(nums)):
        if nums[i] == 1:
            rsum += 1
        else:
            rsum += -1

        if rsum in rsum_dict:
            max_len = max(max_len, i - rsum_dict[rsum])
        else:
            rsum_dict[rsum] = i

    print (rsum_dict)
    return max_len