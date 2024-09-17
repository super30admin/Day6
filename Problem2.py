"""
525. Contiguous Array
Time Complexity - O(n)
Space Complexity - O(n)
1. Make a hash map with key 0 and value as -1 , initialize all varibles
2. Calculate current sum where 0 = +1 and 1 is -1
3. Check if current_sum in hashmap or not
    i) If it is then find the length o string i.e.e index - hashmap[current_sum] and check if it is max
    ii) Else storing key as current_sum and index as value
4. return max value
"""
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        hashmap = {0 : -1}
        max_val = 0
        current_sum = 0
        for i in range(len(nums)):
            if nums[i] == 0:
                current_sum += 1
            else:
                current_sum -= 1
            if current_sum in hashmap:
                max_val = max(max_val,(i - hashmap[current_sum]))
            else:
                hashmap[current_sum] = i
        return max_val
                

                