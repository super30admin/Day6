"""
// Time Complexity :O(n) where n=number of characters in string
// Space Complexity :O(1)Hashmap will store 26 keys for each alphabet
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NA

//Explanation:
Check if character is present in hashMap.
If present(Second occurrence)-> Remove character.
Increase count+=2(Taking characters only in pair of two)
If hashMap is not empty at the end,Increase count+=1
"""
class Solution:
    def longestPalindrome(self, s: str) -> int:
        count=0
        memory={}

        #Edge case
        if s==None or len(s)==0:
            return None

        for char in s:
          if char in memory:
            del memory[char]
            count+=2
          else:
            memory[char]=0

        if len(memory)!=0:
          count+=1

        return count


if __name__=="__main__":
  str="abccccdd"
  s=Solution()
  print("Count=",s.longestPalindrome(str))
