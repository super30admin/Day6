# Time Complexity: O(n)
# Space Complexity: O(1) since there are only 52 character at max for every input
# leetcode execution: YES
class Solution:
    def longestPalindrome(self, s: str) -> int:
        # we will be creating the hash map where we will be storing key as character and value as its occurance
        # space comploxty is O(1) as there are only 52 character at max at any given input 
        mapping={}
        # looping to map all the characters and their occurance
        for x in s:
            if x in mapping:
                mapping[x]+=1
            else:
                mapping[x]=1
        counter=0
        flag=0
        # flag to check if there is a chacter where we can place only once in center
        # looping through the map to calculate the length if %2==0 then even occuracne we can count all of it if not even but the value is greter than one than we subtarct -1 and add it to the counter if the a value is only 1 then we just increment flag to 1  
        for x in mapping:
            a=mapping[x]%2
            if a==0:
                counter+=mapping[x]
                mapping[x]=0
            elif a==1 and mapping[x]>1:
                counter+=mapping[x]-1
                mapping[x]=1
                flag=1
            else:
                flag=1
            
        if flag==1:
            counter+=1
        return counter