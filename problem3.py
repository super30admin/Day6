#Approach : Take a set and this set size will have max of 52 elements which are upper case and lower case. Loop over the given string if the element is already present in the set then remove the element from the set and add two to the counter. After looping over the given string is over, if set is not empty then add one to the counter since palindrome with odd elements can have one center element.
#Time Complexity : O(n)
#Space Complexity : O(1) since the max space can be 54.
class Solution(object):
    def longestPalindrome(self, s):
        
        if(len(s)==0):
            return 0
        else:
            my_set = set([])
            count =0
            for i in s:
                if(i in my_set):
                    count = count +2
                    my_set.remove(i)
                else:
                    my_set.add(i)
        if(len(my_set)!=0):
            count = count +1
        return count
        """
        :type s: str
        :rtype: int
        """
        
