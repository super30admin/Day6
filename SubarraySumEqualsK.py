"""
Approach: Running sum over linear traversal
Storage for results is in map of rSum:[count of how many times rSum is seen, current index where rSum is seen]
TC O(n)
SC O(n)

This problem uses additional space to store indices in order to allow printing of the subarrays, which is not required in the original problem
"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        d = {0:[1,-1]} # create dict and add base case for rSum 0 happened 1 time, and index -1 as it is non-existent
        rSum = 0
        count = 0
        for i,num in enumerate(nums):
            rSum += num   # add num to rSum
            if rSum - k in d:   # check if rSum-k is a key in dict
                # frequency will always be stored at first index in the list,
                # and all other indices will store index of where a rSum occured
                count += d[rSum -k][0]  # if yes, read the frequency and add to count
                # print subarray
                # logic :
                # print nums[value for d[rSum-k][last index item in the list]+1 -> to i +1(so ith index)]
                # print(nums[d[rSum-k][-1]+1:i+1])
            if rSum in d:
                # add 1 to frquency
                d[rSum][0] = d[rSum][0] + 1
                # append current index
                d[rSum].append(i)
            else: 
                # add 1 for frequency and the current index 
                d[rSum] = [1,i] 
        # print(d)
        return count

