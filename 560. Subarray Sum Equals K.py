# Time complexity - O (n), as we have to traverse through our nums variable 
# Space Complexity - O (n), worst case k is zero and we have store all of our running sums
# idea is to track the running sum, follow x = y + k approach
# x is index we're looking at, y we will search in hashmap. if x - k = y exists in hashmap, our counter of subbary count goes up by 1

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        trackerMap = {}
        trackerMap[0] = 1

        # below var tracks number of subarrays whose sum equals to k
        counter = 0
        runningSum = 0

        for i in nums:
            runningSum += i
            if (runningSum - k) in trackerMap:
                counter += trackerMap[runningSum - k]
            
            if runningSum in trackerMap:
                trackerMap[runningSum] +=1
            else:
                trackerMap[runningSum] = 1
        
        return counter



