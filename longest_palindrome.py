#palindrome can be formed from pairs of chars after retrieving the count of each char
#time= O(n) ; space = O(1)

def longest_palindrome(s):
    counter = {}
    
    for char in s:
        if char in counter:    
            counter[char]+=1
        else:
            counter[char] = 1  
    print(counter)
    length = 0
    odd_found = False

    for cnt in counter.values():
        if cnt%2 == 0:           #if count of char is even, the perfect pairs can be used
            length += cnt
        else:
            length += cnt -1      #if count of char is odd, then pair of that char is used after decrementing by 1 and flag is raised
            odd_found = True
    if odd_found:
        length+=1


    return length

s = "abcebbffabda"
print(longest_palindrome(s))  

# s = "a"
# print(longest_palindrome(s))  # Output: 1

# s = "bb"
# print(longest_palindrome(s))  # Output: 2