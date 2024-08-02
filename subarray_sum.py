from collections import defaultdict

#tme complexity - O(n)
# space complexity - O(n)
#tested on leetcode
# keeping track of the running_sum and frequency for each number
# check if diff(running_sum - target) exists in the hashmap
# if it exists then increment count as we have found a subarray and add the running sum to the hashmap
# else just add the running sum to the hashmap and finally return count
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        hmap = defaultdict(int)
        print(hmap)
        hmap = {0:1} # dummy entry
        running_sum = 0
        count = 0
        if not nums:
            return 0
        for num in nums:
            running_sum += num
            key = running_sum - k
            if key in hmap:
                count += hmap.get(key)
            if running_sum in hmap:
                hmap[running_sum] += 1
            else:
                hmap[running_sum] = 1
        return count
     

        