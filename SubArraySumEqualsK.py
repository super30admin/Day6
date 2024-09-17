# Time Complexity : O(N) where N is the len of input array
# Space Complexity : O(N) when each num in nums > 0
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        d = {}
        d[0] = 1 # To account for SubArrays starting at the beginning
        
        runningTotal = 0
        numSolutions = 0
        for num in nums:
            runningTotal += num
            diff = runningTotal - k # Query map using difference
            
            # Add count to numSolutions. 
            # Count > 1 is going to account for subarrays that have zeros or negative numbers.
            numSolutions += d.get(diff, 0) 


            # Query before update because when target is 0 if you query after update. 
            # Each count in the map will get added to numSolutions 
            # diff = runningTotal - 0, diff = runningTotal, we updated runningTotal and then queried running total, LOL.
            # Hence, query before update.
            # Maintain count of running total in map. Query before updating count.
            
            d[runningTotal] = d.get(runningTotal, 0) + 1 
        
        return numSolutions