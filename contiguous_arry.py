"""
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
// Your code here along with comments explaining your approach
Algorithm explanation
1) Initialize a map with <count,index>
max_len = 0
2) Iterate over the array,
    - If the element is 0
        update count:= count - 1
    - if element is 1
        update count:= count + 1
    - If the count is present in the map
        - update max_len - maximum(max_len,curr_index - map.get(count))
    - Else
        - update map[count] = curr_index
 """
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        """
        Idea - To have a sliding window that keeps track of 0's and 1's 
        Hashmap(counter) keeping track of 0's and 1's per window
        Algo
        - Initialize start and end pointers for the window
        - 
        """
        counts = {}
        counts[0] = -1
        n = len(nums)
        max_len = 0
        count = 0
        for i in range(n):
            if nums[i] == 0:
                count-=1
            else:
                count+=1
            if count in counts:
                max_len = max(max_len,i - counts.get(count))
            else:
                counts[count] = i
        return max_len