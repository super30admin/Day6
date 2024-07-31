# Time Complexity : O(n)
# Space Complexity : O(n), worst case array is just 1's or 0's


class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        # Hashmap to track the running length, and their first index of occurence
        trackLen = {}

        # insert a dummy running sum, to cover the edge case when a contiguous subarray starts at nums[0]
        trackLen[0] = -1

        # track maximium length of subarray, update if we find a bigger length
        maxLen = 0

        # track running sum of our binary array
        trackSum = 0

        for i in range(len(nums)):
            if nums[i] == 0:
                trackSum -=1
            else:
                trackSum += 1

            if trackSum not in trackLen:
                trackLen[trackSum] = i
            
            elif trackSum in trackLen:
                distance = i - trackLen[trackSum]

                if distance > maxLen:
                    maxLen = distance
                else:
                    continue

        return maxLen
            



        
