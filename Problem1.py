"""560. Subarray Sum Equals K
Time Complexity - O(n)
Space Complexity - O(n)
1. Create a hashmap with initial elements as {0:1}
2. Calculate sum while traversing the list
3. Calculate compliment i.e. sum - target verify i compliment in hashmap
    i) If yes,then increment count
    ii) else,
        a) check if compliment in hashmap 
            If Yes, then increment value by 1 for hashmap[compliment]
            else, Add key value pair in hashmap.
"""
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        current_sum = 0
        count = 0
        hashmap = {0 : 1}
        
        for i in range(len(nums)):
            current_sum += nums[i]
            compliment = current_sum - k
            if compliment in hashmap:
                count += hashmap[compliment]
                
            if current_sum in hashmap:
                hashmap[current_sum] += 1
            else:
                hashmap[current_sum] = 1
                
        return count