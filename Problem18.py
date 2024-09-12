"""
Longest Palindrome

Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.

Letters are case sensitive, for example, "Aa" is not considered a palindrome here.



Example 1:

Input: s = "abccccdd"
Output: 7
Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
"""
"""
1)Loop through the frequencies of each char stored in dict1.
2)count == even ? ==> add count value to the total palindrome count
3)count == odd? ==> total palindrome count + 1, if count > 1, total palindrome count ==> count -1

"""
str = "abccccdd"
def LongestPalin(str):
    dict1={}
    palCount= 0

    for char in str:
        if char in dict1:
            dict1[char]+=1
        else:
            dict1[char]= 1
    addcenter= False

    for val in dict1.values():
        if val % 2==0:
            palCount+= val
        elif addcenter== False:
            palCount+= 1
            addcenter= True
        elif val > 1:
            palCount+= val -1
    return(palCount)

"""
Time Complexity: O(n)
Space : O(1)

"""    
