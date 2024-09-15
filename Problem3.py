# Time Complexity : O(n) where n is the number of elements that we add in the hashMap in n times
# Space Complexity : O(1) so we keep on removing the elements when the count becomes 2 and which makes the space constatn
# Did this code successfully run on Leetcode :  Yes 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach : - We add the element in hashMap and if the element is in hashMap then we remove the element and add 2 to the count 
# and at the last when we are done till the end of the loop then we check if the length of hashMap is greater than 1 then we add the 1 to the count as it may have 1 odd element.
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashMap = {}
        count = 0
        for i in range(len(s)):
            if s[i] in hashMap: 
                count +=2
                del hashMap[s[i]]
            else:
                hashMap[s[i]] = s[i]
        if len(hashMap)>0:
            count+=1
        return count 
        