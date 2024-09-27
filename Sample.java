// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//1 409. Longest Palindrome
//Code
class Solution(object): //O(N)
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """

        hash_map = {}
        count = 0

        for char in s:
            if char in hash_map:
                hash_map[char] +=1
            else:
                hash_map[char] = 1
        for keys in hash_map.values():
            if keys % 2 == 0:
                count += keys
            else:
                count += keys - 1
        
        if len(s) > count:
            return count+1
        return count

//525. Contiguous Array
//Code
class Solution(object): //O(N)
    def findMaxLength(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        
        hash_map={0:-1}
        max_val = 0
        rSum = 0

        for i in range(len(nums)):

            if nums[i] == 0:
                rSum -=1
            else:
                rSum +=1
            
            if rSum in hash_map:
                max_val = max(max_val , (i - hash_map[rSum]))
            else:
                hash_map[rSum] = i
        return max_val
//560. Subarray Sum Equals K
class Solution(object):
    def subarraySum(self, nums, k): //O(N)
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        
        hash_map = {0:1} #rSum : count
        count = 0
        rSum = 0

        for i in range(len(nums)):
            rSum +=nums[i] #1
            comp = rSum - k #1-0=1
            if comp in hash_map:
                count+=hash_map[comp]

            if rSum in hash_map: #false
                hash_map[rSum] += 1
            else:
                hash_map[rSum] = 1 #{0:1,1:1}

        return count
                