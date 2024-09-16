# Longest Palindrome
# Time Complexity : O(n); n = length of the string
# Space Complexity : O(n); n = length of the set
# Did this code successfully run on Leetcode : Yes
# Approach: We use a set to keep obeservation of the letters that has occured uptil now. If the letter is not in the set then just add it in the set. If its in the set that means the letter has encountered again and we can make a palindromic string using that. So we increase the count by 2 and remove the letter from set. At the end of the loop if the set is not empty that means we can add one more letter at the middle and make a palindrom.

class Solution:
    def longestPalindrome(self, s: str) -> int:

        count_set = {0,}
        result = 0
        
        for i in s:
            if i in count_set:
                result += 2
                count_set.remove(i)
            else:
                count_set.add(i)
                
        if len(count_set) >= 2:
            return result + 1
        return result
            
            
