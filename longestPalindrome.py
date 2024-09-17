# Time Complexity :  O(n), where n is the length of the string s
# Space Complexity : O(52) OR O(1), Since this problem has an input
#                    set of lower and upper case alphabets only.
# Did this code successfully run on Leetcode : Yes!
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class Solution(object):
    # Keeping track of the number of unique elements while traversing the string.
    # If an element is encountered once store the element and for
    # the second time remove the element and increment the count by 2
    # if any remaining elements in set increment count by 1 and return
    def longestPalindrome(self, s):
        store = set()
        retVal = 0
        for i in s:
            if i in store:
                store.remove(i)
                retVal += 2
            else:
                store.add(i)

        if len(store) != 0:
            retVal += 1
        return retVal


print(Solution().longestPalindrome("racecar"))
