############## Find length of longest possible palindrome from given letters.  ######

# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# count the number of characters for each letter
# for every character with even count add its freq to the total
# and for character with odd count add freq - 1 to the total
# if we encountered atleast one odd count add 1 to total 

from collections import Counter

def longest_palindrome(s):
    if len(s) <=1:
        return len(s)
    counter = Counter(s)
    is_odd = False
    max_len = 0
    for k in counter.keys():
        if counter[k]%2 == 0:
            max_len += counter[k]
        else:
            is_odd = True
            max_len += counter[k] - 1
    if is_odd:
        return max_len + 1
    else:
        return max_len

print(longest_palindrome("abccccdd"))
