#Time Complexity :  O(N)  # iterate through every element and calculate occurences
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no


from collections import Counter
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        counts = Counter(s)
        if len(counts)==1:  #if all are same element or only 1 element
            return len(s)
        
        else:
            odd = False
            count = 0
            for k,v in counts.items():
                if v%2 == 0:   # if its even number use all occurences
                    count = count+v
                else:
                    if not odd:   # if its odd and u using odd occurence for first time use all
                        count = count +v
                        odd = True
                    else:
                        count = count +(v-1) #next odd occurences -1
                        
        return count