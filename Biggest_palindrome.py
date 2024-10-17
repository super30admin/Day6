class Solution:
    def longestPalindrome(self, s: str) -> int:
      if len(s) == 0 or s == None:
        return 0
      # myset = set()
      Hash_set = []
      count = 0
      for i in range(len(s)):
        char = s[i]

        # Now we need to find out what are the palindrome couples:
        if char not in Hash_set:
          Hash_set.append(char)
        else:
          count += 2
          Hash_set.remove(char)
        
      # My palindrome will be greater at least count char

      if len(Hash_set) >=1:
        return count +1
      else:
        return count

        