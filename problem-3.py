"""
Approach

1. If we have a pair of characters then we can form palidrome of length, if we have a pair or 2 charecters then we can form palidrome of length 4
2. so our problem boild down to find the number of pairs of a character, if we find a pair we increate the global count by 2
3. we use a hashset to know if a pair exists, if a pair exists then we increase the count by 2
4. in the end if our hashset is not empty, this means we might have some charecters which are alone, in that case we increase the global count because those characters can be added between the alredy formed plindrome

"""


# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : yes	
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashSet = set()
        count = 0
        if str=="" or str == None:
            return 0
        for char in s:
            if char in hashSet:
                count+=2
                hashSet.remove(char)
            else:
                hashSet.add(char)
        if hashSet:
            return count+1
        else:
            return count
