# Time Complexity = O(n)
# Space Complexity: O(n)

class Solution(object):
    def findMaxLength(self, nums):

        high_len = 0
        counter = 0
        hash_map = {}
        # Updating map for condition where start element is included in result
        hash_map[0] = -1

        for i in range(len(nums)):
            # if current element is 1 then increment the counter by 1
            if nums[i] == 1:
                counter = counter + 1
            #  if there is 0 then decrement the counter by 1
            else:
                counter = counter + (-1)
            # Maintain map with sum and index where we got sum

            # If map has that counter already present in map then we check pick whichever is greater number
            if hash_map.has_key(counter):
                compare_no = i - hash_map.get(counter)
                if high_len < compare_no:
                    high_len = compare_no
            # If not then we add sum as key and current index as value in map
            else:
                hash_map[counter] = i

        return high_len

        """
        :type nums: List[int]
        :rtype: int
        """
