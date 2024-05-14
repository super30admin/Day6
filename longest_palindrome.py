#time complexity: O(n)
#space complexity: O(n)
#approach: even number of elements are added as it is and odd count of elements are added only one in total.
# increment the rsum's value in hashmap by 1
# return the count

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        count = 0
        for letter in s:
            if letter in hashset:
                count = count + 2
                hashset.remove(letter)
            else:
                hashset.add(letter)
        if len(hashset)==0:
            return count
        else:
            return count+1
        