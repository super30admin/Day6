#longest palindrome

# // Time Complexity : O(N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


def longestPalindrome(s: str) -> int:
    hashset=set()
    count=0
    if(len(s)==0):
        return 0
    
    for i in s:
        if i in hashset:                    #if the character is already in the set, then add 2 to the palindrome count and remove it
            count+=2
            hashset.remove(i)
        else:
            hashset.add(i)
            
    if(len(hashset)>0):
        count+=1
    return count

#testing
print(longestPalindrome("abaababebghefgjoaok"))