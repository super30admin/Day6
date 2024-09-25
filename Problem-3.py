#Approach
# Iterate over the charaters if a character is not present in hashset add into it else add 2 to the count and remove that character.
#At last if any characters left in the hashset that means there are odd no of characters in set so include +1 in the count


#Complexities
# Time Complexity : O(n)
# Space Complexity: O(1)



class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        count = 0
        for char in s:
            if char in hashset:
                count += 2
                hashset.remove(char)
            else:
                hashset.add(char)
        if len(hashset) > 0:
            return count + 1
        return count

