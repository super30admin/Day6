# Time Complexity : Add - O(n)
# Space Complexity :O(1) ---> Theta(52
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
1.  Create a hashmap of charachters in the string with values as the count
2. The even count will be strictly added to the length of palindrome.
3. For the odd count except 1, lowest even value has to be added to the length
4. For 1, if the length so far is even then we can add 1, as it would act as the centre element
5. If length is odd means the centred element is already taken into account.
'''

from collections import defaultdict
def longestPalindrome(self, s):
    
    if s=="" or len(s) < 1:
        return 0
            
    count_dict = defaultdict(lambda : 0)
    
    for i in s:
        count_dict[i] += 1
        
    l = 0
    
    for i in count_dict.values():
        l += (i//2)*2
        
        if l%2 ==0 and i%2 ==1:
            l += 1
                  
    return l
                    
            
        
        