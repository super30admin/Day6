# TC = O(n)
# SC = O(1) storing chars is definite size
# We could do this in 2 pass hashmap- storing the count of each char then going over values to check if palin. With hashset(or array) i can do in single pass. As I encounter new char I will store it in set and if I encounter the char again I remove the char from set incrementing count by 2. At the end if there are chars remaining they can be considered as one entity - increment count by 1

def longestPalin(s):
    if not s or len(s) == 0: return 0
    count = 0
    hashSet = set()
    for char in s:
        if char in hashSet:
            hashSet.remove(char)
            count += 2
        else:
            hashSet.add(char)
    if hashSet:
        count += 1
    return count

s = "abccccdd"
print(longestPalin(s))
