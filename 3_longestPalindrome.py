'''
# time complexity = O(n)
# space complexity = O(1)
# working on Leetcode = yes
# need to return max length
'''

def palindrome(s):
    hashmap={}
    length=0
    for i in range(len(s)):
        if s[i] not in hashmap:
            hashmap[s[i]]=1
        else:
            hashmap.pop(s[i])
            length+=2

    if length!=len(s):
        return length+1
    else:
        return length


s='aabbccdffe'

print(palindrome(s))

