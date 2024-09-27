#time complexity : O(n) for going to the string
#space complexity : O(1) as the alphabets are constant
class Solution:
    def longestPalindrome(self, s: str) -> int:
        count = 0
        palin = set()
        #loop will work for all the charaters of string s
        for i in s:
            #if the character is already present in the set then the count will increase by 2 and then that character will be removed from the set.
            if i in palin:
                count += 2
                palin.remove(i)
            #if the character is not present in the set than the character is added in the set
            else:
                palin.add(i)
        #if any character is left in the set than we will increase the count by one as we can put in the middle
        if len(palin) != 0:
            count += 1
        return count
