// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
#Problem 1
# Time Complexity: O(n) - We iterate through the array once.
# Space Complexity: O(n) - In the worst case, the running_sum_freq_map could store n different sums.

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        # We use a dictionary such that 
        # Key   --> Running Sum
        # Value --> How many times that sum has appeared
        
        n = len(nums)
        running_sum_freq_map = {0: 1}  # One way to get running sum 0, empty subarray
        running_sum = 0
        ans = 0

        for i in range(n):
            running_sum += nums[i]

            # For current running sum, required sum will be current_running_sum - k
            required_sum = running_sum - k

            # If required_sum has already appeared
            if required_sum in running_sum_freq_map:
                # We update ans with the number of times that required_sum has appeared
                ans += running_sum_freq_map[required_sum]

            # Append/update current_running_sum in map
            if running_sum in running_sum_freq_map:
                # If already present, increment its count/frequency
                running_sum_freq_map[running_sum] += 1
            else:
                running_sum_freq_map[running_sum] = 1
                    
        return ans

#Problem 2
# Time Complexity: O(n) - We iterate through the array once.
# Space Complexity: O(n) - In the worst case, the table could store n different counts.

class Solution(object):
    def findMaxLength(self, nums):
        count = 0
        max_length = 0
        table = {0: 0}  # Initialize table with count 0 at index 0

        for index, num in enumerate(nums, 1):
            if num == 0:
                count -= 1
            else:
                count += 1
            
            if count in table:
                max_length = max(max_length, index - table[count])
            else:
                table[count] = index
        
        return max_length

#Problem 3
# Time Complexity: O(n) - We iterate through the string once to build the frequency count and once more to process it.
# Space Complexity: O(1) - The space used by the count dictionary is constant (limited to the number of unique characters).

class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = {}  # Hash table to store the frequency of each character
        ans = []    # List to store the frequencies of characters
        odd = 0     # To count the number of characters with odd frequencies

        for word in s:
            if word not in count:
                count[word] = 1
            else:
                count[word] += 1
        
        for times in count.values():
            ans.append(times)
            if times % 2 != 0:
                odd += 1  # Increment odd count if the frequency is odd
        
        if odd != 0:
            return sum(ans) - odd + 1  # Adjust to account for the odd character in the middle
        else:
            return sum(ans)  # All frequencies are even, use them all
