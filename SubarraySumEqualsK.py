# TC: O(N) where N is the size of the input array
# SC: O(N) space for the hashmap used to store mapping of the running sum and the number of time that particular running sum has occured before. 

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        csum = count = 0
        hmap = {}
        hmap[0] = 1
        for i in range(len(nums)):
            csum += nums[i]
            if (csum - k) in hmap:
                prev_count = hmap.get(csum - k)
                count += prev_count
            
            if csum in hmap:
                num = hmap.get(csum)
                hmap[csum] = num + 1
            else:
                hmap[csum] = 1
        return count
