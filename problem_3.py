'''https://leetcode.com/problems/longest-palindrome/
Given a string s which consists of lowercase or uppercase letters, 
return the length of the longest palindrome that can be built with 
those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
'''

# Time Complexity : O(N) where N is len of input string s
# Space Complexity : O(N) HashMap solution. O(1) Set solution
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


'''Using Hashmap'''
class Solution:
    def longestPalindrome(self, s: str) -> int:
        # maintain counts of all characters in s
        # for even counts, add them to total
        # for odd counts, add odd-1(even) to total.
        # if odd count exists, add +1 to total for add length pelindrome
        # example abb should give len('bab') = 3
        # example abbccc should give len('bcccb') = 5        
        counts = {}
        odd = False
        for c in s:
            if counts.get(c) is None:
                counts[c] = 1
            else:
                counts[c] += 1
        
        total = 0
        for v in counts.values():
            if v%2 == 0: # even
                total += v
            else: # odd. add odd-1 elements to total as it is even
                total += (v-1)
                odd = True
        if odd:
            total += 1
        return total


'''Using Set'''
class Solution2:
    def longestPalindrome(self, s: str) -> int:
        # we store/remove chars from the set to check for even/odd
        charset = set() 
        total = 0
        
        for c in s:
            if c in charset: # 'c' was seen before, so this must be second c
                # even length palindrome
                total += 2
                charset.remove(c)
            else:
                charset.add(c)
        
        if len(charset) != 0: # single chars left, odd lenght palindrome
            total += 1
        return total
