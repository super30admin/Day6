# accepted on leet code
# time complexity - O(N), space - O(1)
def longestPalindrome(s):
    unpair_letters = set() # new hash set
    count = 0
    for i in s: # iterating over the string
        if i in unpair_letters: # if the letter already exist.
            unpair_letters.remove(i) # remove it
            count += 2 # add count 2 (adding/removing)
        else:
            # print(unpair_letters)
            unpair_letters.add(i) # if not exists add it.
    if unpair_letters == set(): # if the set is empty at the end return count
        return count
    else: # if not empty add 1 to count for odd letters
        return count+1
print(longestPalindrome("pppko"))