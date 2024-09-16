# // Time Complexity : O(n) 
# // Space Complexity : O(1) as possible number of chars in 
# hashset at any point of time could not be more than total lowercase+uppercase letters
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none
# // Your code here along with comments explaining your approach

# ************************************************************************************************************************
# ************************************************************************************************************************
#                   Method 1
# ************************************************************************************************************************
# ************************************************************************************************************************
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashmap = defaultdict(int)
        
        for ch in s:
            hashmap[ch] += 1
        
        odd = False
        count = 0
        
        for key,val in hashmap.items():
            # char freq is even then take all the occurrences
            if val % 2 == 0:
                count += val
            else:
                # else case when 
                # freq is odd
                # if it is less than equal to 1, 
                # we just consider 1 for it later
                
                # if val > 1 then we use the even number of chars in it
                # which would be val-1
                if val > 1:
                    count += val-1
                odd = True
        # for that all chars whose freq were odd,
        # we just consider one char
        if odd:
            count += 1
        return count
        

# ************************************************************************************************************************
# ************************************************************************************************************************
#                   Method 2
# ************************************************************************************************************************
# ************************************************************************************************************************
# // Time Complexity : O(n) 
# // Space Complexity : O(1) as possible number of chars in 
# hashset at any point of time could not be more than total lowercase+uppercase letters  
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : none



# // Your code here along with comments explaining your approach
class Solution:
    def longestPalindrome(self, s: str) -> int:
        hashset = set()
        count = 0
        for ch in s:
            if ch in hashset:
                hashset.remove(ch)
                count += 2
            else:
                hashset.add(ch)
        if hashset:
            count += 1
        
        return count