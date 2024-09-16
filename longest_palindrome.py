# Time Complexity : O(n)   - we are traversing through the given array to find the prefix-sum in linear time
# Space Complexity : O(1)   - we are using constant space without having extra space.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No 



class Solution:
    def longestPalindrome(self, s: str) -> int:
        
        hMap = {} #Creat empty Hash map dictionary
        count = 0 #Creat a counter to count the longest of plaindrome   
        
        #basically, inorder to form a palindrome which is largest, all values must be present twice and atmost one element can repeat once
        
        for i in s:  
            if i in hMap:
                hMap[i] += 1     #if the character as key is already in hashmap, increase its value by 1
                if hMap[i] == 2:    # when the value is equal to two, increase the counter by 2 
                    count +=2        
                    hMap[i] = 0     # now change the value of char key back to zero, so if next time it's found, it's value can go upto 2 and can be appended to count        
            else:
                hMap[i] = 1  #if the key is not in hashmap,include the key and increase it's value from zero to 1
            
        if 1 in hMap.values():  #as atmost 1 element can be repeated once, if there's a case, increase the count by one
            return count + 1
        else:
            return count