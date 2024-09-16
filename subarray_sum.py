# Time Complexity = O(n)
# Space Complexity: O(n)

class Solution(object):
    def subarraySum(self, nums, k):

        current_sum = 0
        count = 0
        mapping_map = {}
        # Updating map for condition where start element is included in sum
        mapping_map[0] = 1

        for i in range(len(nums)):
            current_sum += nums[i]
            # updating the map with key as sum and value
            # as number of occurrences of that sum in array when the sum is equal to target

            # if map present sum that is current sum - target then
            # we increment the counter to value of the sum occurrence
            if mapping_map.has_key(current_sum - k):
                count += mapping_map.get(current_sum - k)
            # if present in map increment the count sum occurrences
            if mapping_map.has_key(current_sum):
                mapping_map[current_sum] = mapping_map.get(current_sum) + 1
            #     else update that sum occurrence to 1
            else:
                mapping_map[current_sum] = 1
        return count
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
