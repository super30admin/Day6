class Solution:
    def longestPalindrome(self, s: str) -> int:

        letterCount = {}
        totalLength = 0
        numOdd = 0
        for letter in s:
            if letterCount.get(letter):
                letterCount[letter]+=1

            else:
                letterCount[letter]=1
            
        print(letterCount)
        for counts in letterCount.values():
            if counts%2==0:
                totalLength +=counts
            else:
                totalLength+=counts-1
                numOdd = 1

        if numOdd ==1:
            return totalLength+1

        return totalLength

