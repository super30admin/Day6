# Idea is maintaining the running sum. At any point if we encounter a running_sum - k that means the inbetween window is the array
# that has sum equal to k. So we know how many times we got running_sum - k then we can maintain a counter to track how 
# many subarrays have occured
# Time Complexity: O(n)
# SPace complexity: O(n)
class Solution:
    # I missed the assumption that values can be negatives and lots of zeros can be there which should be included
    # So we can;t break the loop when we find sum being equal to k we have to continue
    def subarraySum(self, nums: List[int], k: int) -> int:
        running_sum = 0
        hmap = {0:1}
        counter = 0
        for i in range(len(nums)):
            running_sum += nums[i]
            if running_sum - k in hmap.keys():
                counter += hmap[running_sum - k ]
            hmap[running_sum] = hmap.get(running_sum,0) + 1
        return counter

            



        