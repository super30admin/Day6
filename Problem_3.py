class Solution:
    def longestPalindrome(self, s: str) -> int:
        if s == None or len(s) == 0:
            return 0
        mySet = set()
        count = 0
        
        for char in s:
            if char in mySet:
                count +=2
                mySet.remove(char)
            else:
                mySet.add(char)
        
        if len(mySet) != 0:
            count += 1
        
        return count
        

obj = Solution()
print(obj.longestPalindrome("abccccdd"))
print(obj.longestPalindrome("a"))
print(obj.longestPalindrome("bb"))

# Time Complexity : O(n)
# Space Complexity : O(1)