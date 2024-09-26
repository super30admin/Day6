"""
time complexity O(n)
Space Complexity O(n)

-if char already exist in dictionary increase count by two and remove that element 
-if char not in set add that in set
-at the end if the set is not empty add 1 to the count 

"""
class Solution_palindrom:
    def longestPalindrome(self, s: str) -> int:
        if s is None or len(s)==0:
            return 0
        set1= set()
        count=0
        for i in range(len(s)):
            if s[i] in set1:
                count+=2
                set1.remove(s[i])
            else:
                set1.add(s[i])
        if set1:
            count+=1
        return count
            
        