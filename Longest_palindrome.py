# time complexity - O(n) single pass
# space complexity - O(1)
# executed on leetcode
# used a hashset to check if the ch was encountered. 
# if its encountered, then remove it from the hashset and increment count by 2
# finally if hashset is not empty add 1 to the count
 
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hset = set()
        count = 0
        for ch in s:
            if ch not in hset:
                hset.add(ch)
            else:
                hset.remove(ch)
                count += 2
        if len(hset):
            count += 1
        return count