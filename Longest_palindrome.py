#Approach : Can solve using hashmap and hashset
#TC: O(n) iterating over string and putting them into hashmap
#SC: O(1) 26 characters only so constant time

class Solution:
    def longestPalindrome(self, s: str) -> int:
        count=0
        #initialize count with 0
        set_vals=set()
        #in set maintain elements so basically will check if element is already there then increase count with +2 and remove that element 
        #set doesn't contain any duplicate element
        #also palindrome is only possible when char are even in number 
        #and in end if set is not empty then we can have any element in middle to make it palindrome 
        #example : abccccdd
        #a->(a)
        #b->(a,b)
        #c->(a,b,c)
        #again c ->(a,b) increase the count by 2 and remove that element 
        # c->(a,b,c)
        # again c -> (a,b) increase the count again by 2 so 4 and remove the element
        # d->(a,b,d) 
        # again d->(a,b) increase count by 2 more so 6 
        # now (a,b) means set is not empty so we can have any char in palindrome string so increase count by 1 
        # total_count : 7
        for i in range(len(s)):
            char=s[i]
            if char in set_vals:
                count+=2
                set_vals.remove(char)
            else:
                set_vals.add(char)
        if len(set_vals)!=0:
            count+=1
        return count