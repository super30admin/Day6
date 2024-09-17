#409. Longest Palindrome
#time complexity = O(n)
#space complexity = O(n)
#Algorithm : calculated the counts of each char in string and stored in map
#2.iterated through the hashmap if count val of char is divisble by 2 then add that val to maxcount
#3 if count value is odd  & none of the odds have been added to max count then we enable a flag and add its count to maxcount
#4 else we add count - 1 value to max and return it.
#Ran on Leetcode: Yes
class Solution:
    import collections
    def longestPalindrome(self, s: str) -> int:
        counts = Counter(s)
        odd_added = False
        longest = 0
        for c in counts:
            if counts[c] % 2 == 0:
                longest += counts[c]
            elif odd_added is False:
                longest += counts[c]
                odd_added = True
            else:
                longest += counts[c] - 1
        return longest