#409. Longest Palindrome
"""
// Time Complexity : O(n) n = size of string
// Space Complexity : O(n) n = size of hash set for worst case
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
A letter from string can be used twice if its frequency is twice or in even number. If it occurs one time then
it can only be used once i.e. in centre. Also, out of all letters that have frequency = 1, one can be used at
a time so even if we have so many single element with f=1, only one is used at a time.
eg, x, can be used as <something>x<something>
"""

class Solution:
    def longestPalindrome(self, s: str) -> int:
        hash_set = set()
        count = 0
        for i in s:
            #if a letter is in a set, then remove it if occurence is 2nd time.
            if i in hash_set:
                count += 2 #coun+=2 because we got f=2 for i. So, two letters can be fatched and used in
                           #palimdrome. eg aa, can be used as a<someting>a
                hash_set.remove(i)

            #if a letter is not in set, add it.
            else:
                hash_set.add(i)

        #if there are eny element left in set, they wll be having f=1(since we are removing as soon as
        # we get f=2). So, out of all single element, eny one can be used.
        if len(hash_set) != 0:
            count += 1

        return count
