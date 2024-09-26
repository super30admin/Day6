# Time Complexity : O(n)
# Space Complexity : O(1) - at most the number of char in alphabet space would be used
# Did this code successfully run on Leetcode : yes
# Any problem you faced while coding this : no

class Solution:
  def longestPalindrome(self, s: str) -> int:
    # Store elements in hashset         
    # Only odd number elements will remain
    # if so one of them can be used in palindrome
    hset = set()
    max_length = 0
    for i in s:
      if i in hset:
        # remove from hashset if element is found again 
        hset.remove(i)
        # increase palindrome count by 2 as even no. of elements
        # can be used in palindrome
        max_length += 2                
      else:
        hset.add(i)                

    # if elements still remain in set => odd numbers
    # => one of them can be used in palindrome creation
    # hence increase count
    if len(hset) > 0:
      max_length += 1
        
    return max_length
                
            
        