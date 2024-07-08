class Solution:
    # Time Complexity O(N), Space : O(1)
    def longestPalindrome(self, s: str) -> int:
        # Using Set Time Complexity O(N), Space : O(1)
        mySet = set()
        count = 0
        # Loop over characters in the string
         # Loop over characters in the string
        for char in s:
            if char in mySet:
                # If character is already in the set, it means we found a pair
                count += 2  # Increase the count by 2
                mySet.remove(char)  # Remove the character from the set
            else:
                # If character is not in the set, add it to the set
                mySet.add(char)
        
        # If there are characters left in the set, it means we can add one more character to the palindrome
        if mySet:
            count += 1        
        return count 



        #using Dictionary: Time Complexity O(N), Space : O(1)
        # myDict = {}
        # for i in range(len(s)):
        #     if s[i] not in myDict:
        #         myDict[s[i]] = 0
        #     myDict[s[i]] += 1
        # has_odd_freq = False
        # count = 0
        # for freq in myDict.values():
        #     if freq%2 == 0:
        #         count += freq
        #     else:
        #         count += freq-1
        #         has_odd_freq = True
        # if has_odd_freq:
        #     count += 1
        # return count        
