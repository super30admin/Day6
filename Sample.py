'''
// Time Complexity :
# Problem 1 : O(n) Length of the input array
# Problem 2 : O(n) Length of the input array
# Problem 3 : O(n) Length of the input string
// Space Complexity :
# Problem 1: O(1) as lookup in the hashmap is O(1) and we return length
# Problem 2: O(1) as lookup in the hashmap is O(1) and we return the constant value of max length
# Problem 3: O(1) As the number of alphabets is always a constant
// Did this code successfully run on Leetcode :
# Yes the code submission ran successfully. 
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
'''
## Problem 1: Subarray Sum Equals K
# Initialize a running summ and increment it with each array element. We will initialize the hashmap
# with value 1 for key 0 when the running sum is 0.
# Check if running sum - K (key) already exists in the hashmap then it means the subarray exists and
# update the final count by count (value) mapped to the running sum (key).
# If the running sum does not exist we will insert in the map or else increment value by 1.
class Solution(object):
    def subarraySum(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if nums is None or len(nums) <= 0:
            return 0
        
        rsumm = 0
        n = len(nums)
        answer = 0
        data_map = {}
        data_map[0] = 1

        for i in range(n):
            rsumm += nums[i] #Start with the array element
            if (rsumm-k in data_map): #Check if difference as key already exists in the map
                answer += data_map[rsumm - k] #update the count by the value of the key
            if rsumm not in data_map:
                data_map[rsumm] = 1 #if running sum does not exist insert in the map
            else:
                data_map[rsumm] += 1 #if running sum exists we update the map
        return answer                

##Problem 2: Contiguous sub-array
# Initialize running sum variable, result variable and an hash map to store 1s and 0s where the first
# entry would be -1 for "0" for the edge case that the array is empty.
# Iterate over the array and if we get a "0" we decrement the running sum or when we get "1" we 
# increment the running sum by 1.
# We will look for the running sum as key in the hashmap, if the key does not exist we insert it else
# we will update it by taking the maximum as we need to return the Max length of sub-array.  
class Solution(object):
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if nums is None or len(nums) <= 0:
            return 0        
        rsumm = 0
        n = len(nums)
        answer = 0
        data_map = {}
        data_map[0] = -1
        for i in range(n):
            if nums[i] == 0:
                rsumm -= 1
            else:
                rsumm += 1
            if rsumm not in data_map:
                data_map[rsumm] = i 
            else:
                answer = max(answer, (i - data_map[rsumm]))
        return answer

## Problem 3: Longest Palindrome
# We need to check if the input string is in palindrome, which means it should have the same characters
# when read backward and forward except the pivot character at the center.
# We will use the hashset data structure as it will allow us to get characters and check if pairs form
# If the same character is inside the string we remove the character and increase the result by 2
# If the character does not exist we add it. In case there remains a single or multiple characters we 
# add 1 to the result as we can pick only one char to make it a Palindrome. 
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        result = 0
        set_result = set()
        for i in range(len(s)):
            ch = s[i]
            if ch in set_result:
                result += 2
                set_result.remove(ch)
            else:
                set_result.add(ch)
        if len(set_result) != 0:
            result += 1
        return result