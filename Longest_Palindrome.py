# Time Complexity : O(n)
# Space Complexity :O(n)
# Did this code successfully run on Leetcode :Yes
# Any problem you faced while coding this :No
# initialize set and count
# if char in not in set add to set
# else remove from set and increase count by 2
# after loop ends if set is not empty then increase count by 1
# return count
def longestPalindrome(self, s: str) -> int:
    count = 0
    Set = set()
    for i in range(len(s)):
        if s[i] not in Set:
            Set.add(s[i])
        else:
            Set.remove(s[i])
            count+=2
        
    if Set:
        count+=1
    return count

    