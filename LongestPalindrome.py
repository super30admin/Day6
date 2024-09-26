# Time Complexity: O(n); n is the length of the string
# Space Complexity: O(1); as 52 characters upper/lowercase letter can max be entered to hashset
  
#  Here we are adding to the list if it is seen for the first time, else increase count of the string by 2 and remove that char from the hashset
# If there are still chars on hashset add 1 to the result


class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashSet = set()
        cnt = 0;
        
        for c in s:
            if c in hashSet:
                cnt += 2
                hashSet.remove(c)
            else:
                hashSet.add(c)
        
        if len(hashSet) > 0:
            return cnt + 1
        else:
            return cnt
                
        
