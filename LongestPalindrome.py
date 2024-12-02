"""
The approach here is to maintain a dictionary to keep count of all the characters. if the count is even
then we consider the character and add the count of element to the count variable, if element count is 
one we use this as middle element. if count is odd is and greater than 1 we deduct it with 1 and consider
the even count and add it. and also delete the odd element already used. finally if we have any element with
count 1 we use this as middle element and add the count to variable count.
"""

def longestPalindrome(self, s):
        dict1 = {}
        count = 0
        st = list(set(s))
        for i in s:
            if i in dict1:
                dict1[i] += 1
            else:
                dict1[i] = 1
        for j in range(len(st)):
            if dict1[st[j]] % 2 == 0:
                count += dict1[st[j]]
                del(dict1[st[j]])
            else:
                count += dict1[st[j]] - 1
                dict1[st[j]] = 1
        if dict1:
            return count + 1
        return count