"""
// Time Complexity : O(N) , N length of a sting
// Space Complexity : O(C)/ O(1) , C : constant unique letters
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
1) single pass check if the character exist in hash set if yes remove and update counter by 2
2) if not present then add an extry for that character
3) once linear pass is done , check whether hash set is not empty , if its not add counter by 1
4) return counter
"""


class Solution:
    def longestPalindrome(self, s: str) -> int:
        hset = set()
        counter = 0
        for each_char in s:
            if each_char in hset:
                hset.remove(each_char)
                counter += 2
            else:
                hset.add(each_char)
        if len(hset) > 0:
            counter += 1
        return counter
