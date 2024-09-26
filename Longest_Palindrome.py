
# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes

class Solution:
    def longestPalindrome(self, s: str) -> int:
        dic = {}
        # Storing count of each alphabet 
        for i in s:
            if i not in dic.keys():
                dic[i]=1
            else:
                a = dic[i]
                dic[i]= a + 1
        count = 0        
        c=0

        flag = False # to check if any odd count exists
        #Counting the length of palindrome
        for i in dic:
            # if even then add 
            if dic[i] % 2 == 0:
                count = count + dic[i]
            # if odd add n-1
            elif dic[i]%2==1:
                flag = True
                count = count + dic[i]-1
                a = dic[i]
                dic[i]=1
            
        if flag == True: 
            return count+1
        else:
            return count        