# Time Complexity :O(n)
# Space Complexity :O(n)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 409


# Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
#
# Letters are case sensitive, for example, "Aa" is not considered a palindrome here.

# Example 1:
#
# Input: s = "abccccdd"
# Output: 7
# Explanation:
# One longest palindrome that can be built is "dccaccd", whose length is 7.


def main():
    s = "abccccdd"
    ans = longestPalindrome(s)
    print(ans)
def longestPalindrome(s):
    """
    :type s: str
    :rtype: int
    """

    # Simple basic idea. Whenever a character has to be palindrome we need to check if the total count is in pairs. For example: abccccdd : Here there are two pairs of c and 1 pair of d
    # and the rest all is single. So we can only take one out of them no matter what.

    # We eased out by creating a set and then whenever the same char occurs second time we
    # remove it from the set and then add 2 to the size.
    # At the end we check if there are single characters in set, if yes we add 1 to size and return.
    mySet = set()

    size = 0

    for char in s:
        if char in mySet:
            size += 2
            mySet.remove(char)
        else:
            mySet.add(char)

    if not len(mySet) == 0:
        size += 1
    return size

if __name__ == '__main__':
    main()