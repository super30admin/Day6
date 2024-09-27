#// Time Complexity : O(n)
#// Space Complexity : O(n)
#// Did this code successfully run on Leetcode : Yes
#// Any problem you faced while coding this : None


#// Your code here along with comments explaining your approach:
#we used hashing technique for this problem.
#In this problem,while traversing through the string we see that if the frequency of the character is 2,we add that count to the resultant and delete that particular character from the dictionary,we go doing the same procedure till the end and if the dictionary still contains any characters then we increment 1 to the count.The count gives the value of the longestPalindrome that can be formed.




class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        d=dict()
        count=0
        for i in s:
            if i not in d:
                d[i]=1
            else:
                count=count+2
                del d[i]
        if len(d)!=0:
            count=count+1
        return count