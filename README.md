# Hashing-2

Explain your approach in **three sentences only** at top of your code


## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if(len(nums) ==0 or nums ==[]):
            return 0
        rsum = 0
        count = 0
        dictionary = {}
        dictionary[0] = 1
        for i in range(len(nums)):
            rsum = rsum + nums[i]
            diff = rsum - k
            if diff in dictionary:
                count = count + dictionary[diff]
            if rsum in dictionary:
                dictionary[rsum] = dictionary[rsum]+1
            else:
                dictionary[rsum] = 1
        return count
    
<!-- #Time Complexity: O(n) n - number of elements in the list
#Space Complexity: O(n) hash map  -->
<!-- # Approach - Keep a running sum value and a count. Given k which is the total sum we have to obtain from the array elements. Traverse through the array and keep adding array element to the running sum, and simultaneously check the difference of k and running sum. If the difference is found in the dictionary it means that sum has been found at that index, and then increment the count of the value (answer). Also keep adding the new running sums to the dictionary with its frequency count to 1. IF rsum is encountered more times then increment the respective count value that many times in teh dictionary. Return count.   -->
        


## Problem2 (https://leetcode.com/problems/contiguous-array/)

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        rsum = 0
        maximum = 0
        dictionary = {}
        dictionary[0] = -1
        for i in range(len(nums)):
            if nums[i]==1:
                rsum=rsum+1 
            else:
                rsum=rsum-1
            if rsum in dictionary:
                maximum = max(maximum, i - dictionary[rsum])
            else:
                dictionary[rsum] = i
        return maximum
<!--     
    #Time Complexity:O(n) n - length of nums
    #Space Complexity: O(n) hash map usage
    # Approach: Three steps : 1. Maintain a running sum which is set to increment by 1 if it encounters a 1 in the array and else decerement it if it encounters a 0. 
#     2. In the hash map already store a default (0:-1) mapping. when ever we update rsum query and find it out whether it is present in the dictionary, if yes, then calculate max using the index value. else store the rsum mapped to the index in the map. 3. Return max once we finished traversing through out the array.  -->


## Problem3 (https://leetcode.com/problems/longest-palindrome)

class Solution:
    def longestPalindrome(self, s: str) -> int:
        if len(s) == 0 or s == " ":
            return 0
        count = 0
        dictionary = {}
        for i in s:
            if i not in dictionary:
                dictionary[i] = 1
            else: 
                del dictionary[i]
                count = count +2
        if len(dictionary)>=1:
            return count+1
        else:
            return count
<!-- #Time Complexity: O(n) n - avg length of the string
#Space Complexity: O(n) hash map involved.  -->
<!-- #Approach: traverse through all the charecters of a string -> while traversing if found already which tells us that the frequency of the charecter is 2, then add the value to the count and delete that charecter from the dictionary. Else just keep adding into the dictionary. In the end if there are charecters still present (i.e if dictionary size is greater than 1), then add count +1 and return it else just return count. 
# Based on the property that if the frequency of the charecter is even it contributes to the palindrome and if not then only one of the charecter might just be located at the centre.  -->

            
                        
        
        