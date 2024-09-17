from collections import Counter


class Solution:
    def longestPalindrome(self, s: str) -> int:
        """
            // Time Complexity: O(n)
            // Space Complexity: O(1)
            // Did this code successfully run on Leetcode :
                Yes
            // Any problem you faced while coding this :
                No
            // Your code here along with comments explaining your approach:
                Iterate over the string, add each char to a set.
                If the set already has that char then it means we have
                found a pair. Remove it since it can make a palindrome.
                Keep doing until we are done with a string.
                A palindrome string can have only one odd string which does
                not have a pair. If the set is not empty it means we have
                char which donot have a pair. We add one to the result.
        """
        count = set()
        result = 0
        for i in s:
            if i in count:
                count.remove(i)
                result += 2
            else:
                count.add(i)
        if count:
            result += 1
        return result

        # count_dict = Counter(s)
        # result = 0
        # odd_str = False
        # for i in count_dict.values():
        #     if i % 2 == 0:
        #         result += i
        #     else:
        #         result += i - 1
        #         odd_str = True
        # if odd_str:
        #     result += 1
        # return result


if __name__ == '__main__':
    h = Solution()
    print(h.longestPalindrome('abccccdd'))
