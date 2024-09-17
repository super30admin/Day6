# Problem 1: Subarray sum equals k -> Time Complexicity: O(n), Space Complexicity: O(n)

class Solution:
    
    def subarraySum(self, nums: List[int], k: int) -> int:
        
        """
        Use compliment of running sum and target (k):
        - add running sum's count to the dictionary 
        - add the count by calling the number of times running sum has occured
        - initialize running sum of 0 with count = 1 in the dictionary
        """
        
        num_dict = {}; count = 0
        rSum = 0; num_dict[0] = 1
        for i in range(len(nums)):
            rSum += nums[i]
            if rSum - k in num_dict.keys():
                count += num_dict[rSum-k]

            if rSum in num_dict.keys():
                num_dict[rSum] += 1
            else:
                num_dict[rSum] = 1

        return count



# Problem 2: Contiguous sub-array with sum = 0 (consisting equal amounts of zeros and ones)
# Time complexicity: O(n), Space Complexicity: O(n)

class Solution:
    
    def findMaxLength(self, nums: List[int]) -> int:
    
        """
        Use running sum with initial sum = 0 at index = -1 (edge case)
        - with each coming 0 reduce 1 from the running sum and add 1 for 1
        - max contiguous length comes when index of running sum already present in a hash table contain sum at a given index
        """
        
        num_dict = {}; max_len = 0
        num_dict[0] = -1; rSum = 0
        for i in range(len(nums)):
            if nums[i] == 0: rSum -= 1
            else: rSum += 1
            if rSum in num_dict.keys():
                max_len = max(max_len, i - num_dict[rSum])
            else:
                num_dict[rSum] = i
                
        return max_len


# Problem 3: Longest Palindrome -> Time Complexicity: O(n), Space Complexicity: O(1) 

class Solution:
    
    def longestPalindrome(self, s: str) -> int:  
        
        """
        Use a set in python to add characters and remove if already exist (counting twice)
        - add 1 if the set is not empty at the end (for longest palindrome)
        """
        
        sSet = set(); max_len = 0
        for char in ",".join(s).split(","):
            if char in sSet:
                sSet.remove(char)
                max_len += 2
            else:
                sSet.add(char)

        if len(sSet) > 0:
            max_len += 1
            
        return max_len