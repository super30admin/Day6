# Longest palindrome -409 
# time complexity - o(N)
#space complexity - O(1)
# Approach : Using hashset method. If an element is already present in hashset then we add count by  2 (even number of counts) and at the same time we will remove the element. If in case element is not present then we add to the hashset. In the end we are left out with odd number of elements, we only need 1 element to form a palindrome. Then we add count by 1.

class Solution(object):
    def longestPalindrome(self, s):
        hashset=set()
        count=0
        for i in range(len(s)):
            if s[i] in hashset:
                count+=2
                hashset.remove(s[i]) #removing the element
            else:
                hashset.add(s[i]) # adding the number
        if hashset:
            count =count+1 # when hashset is not empty we are counting by 1
        return count