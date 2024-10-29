def longestPalindrome(s) -> int:
    arr = []
    result = {}
    for char in s:
        arr.append(char)
        if char in result:
            result[char] += 1
        else:
            result[char] = 1
    count = 0
    flag = False
    for char in result:
        if result[char] % 2 == 0:
            count = count + result[char]
        else:
            flag = True
            count = count + result[char]-1
            
    if flag:
        return count + 1
    return count
    
    
s = "aaa"

print(longestPalindrome(s))
        
    