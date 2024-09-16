# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
# // Your code here along with comments explaining your approach:
# Create a hashmap with keys as the elements in the string. Iterate through the string, and maintain the number of occurance
# in the values of the keys in hashmap. if the occurance of an element reaches 2, remove the element from the hashmap, and increment global count by 1.
# Continue iterating the strings, and adding key, value pairs in the hashmap. At last, check if the hashmap is empty. if its not empty, increment global
# count by 1.


class Solution:
    def longestPalindrome(self, s: str) -> int:

        hashmap = {}
        result = 0
        for string in s:
            if string not in hashmap:
                hashmap[string] = 1

            else:

                hashmap[string] += 1
                if hashmap[string] == 2:
                    result += 2
                    del hashmap[string]  # remove that key

        if len(hashmap) > 0:  # not empty
            result += 1

        return result

