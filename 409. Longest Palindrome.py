## Time Complexity : O(n)
## Space Complexity : O(n)
## Maintain hashmap to track count of char. if char count is even, add 2 to our counter
## do a final check in our hashmap, stop on any even count char, add 1 to our counter, break, return final result

class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        track = {}

        longestPal = 0

        for i in s:

            if i not in track:
                track[i] = 1

            else:
                track[i] +=1 
                if track[i] % 2 == 0:
                    longestPal += 2
        
        for j in track.values():

            if j % 2:
                longestPal += 1
                break
        
        return longestPal

        



