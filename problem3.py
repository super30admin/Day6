"""
Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.

Input: s = "a"
Output: 1

Input: s = "bb"
Output: 2

Solution:
    check how many pairs of characters are present, and single characters.
    answer would number of pairs + 1 if single characters are present else it 
    would be number of pairs

    time complexity O(n)
    space complexity - constant assuming max size of hash set would be alphabet size.
"""

def longestPalindrome(s) -> int:
    mySet, count = set(), 0
    for ch in s:
        if(ch in mySet):
            mySet.remove(ch)
            count += 2
        else:
            mySet.add(ch)
    count = count+1 if len(mySet)!=0 else count
    return count 

print(longestPalindrome("abccccdd"))
print(longestPalindrome("a"))
print(longestPalindrome("bb"))
