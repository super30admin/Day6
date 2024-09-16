# Time Complexity = O(n)
# Space Complexity: O(1)

class Solution(object):
    def longestPalindrome(self, s):

        hash_set = set()
        max_count = 0

        for i in range(len(s)):
            #   While iterating over the given string
            #   We check if that character is present in the the hash set
            #  if not then we add the character in set
            #  if it is already present then we remove
            #  the already present character from set and increment the counter by 2
            #   As we have now found the pair of same character ( even numbers of characters)
            if s[i] in hash_set:
                hash_set.remove(s[i])
                max_count += 2
            else:
                hash_set.add(s[i])

        #  In the end we will check if there is any element
        #  present in the hashset after above operation then
        #  We increment the counter by 1 and return that count
        if len(hash_set) > 0:
            max_count += 1

        return max_count

        """
        :type s: str
        :rtype: int
        """
