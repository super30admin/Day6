# Time Complexity : O(n)
# Space Complexity : Constant(In order of Allowed Chharacter)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :
    

def longestPalindrome(self, s: str) -> int:
    data = dict()
    ans = 0
    # flag for keeping track of odd frequency
    flag = False
    
    # Calculating frequeny of character
    for char in s:
        data[char] = data.get(char, 0) + 1
        
    #iterating over frequency dictionary
    for key, value in data.items():
        #if frequency of character is even we can directly add it to create palindrome.
        if value % 2 == 0:
            ans += value
        #if frequency of character is odd we have to remove one charcter to craete palindrome and also keep check that we found odd frequency.
        else:
            ans += value - 1
            flag = True
    # If we found odd frequency than we can add 1 to the length of palindrome to increase the size by 1 otherwise return original answer
    if flag:
        return ans + 1
    else:
        return ans
            