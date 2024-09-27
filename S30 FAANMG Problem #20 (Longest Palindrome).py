def longestpalindrome(s):
    ref = set()

    for n in s:
        if n not in ref:
            ref.add(n)
        else:
            ref.remove(n)

    if len(ref) != 0:
        return len(s) - len(ref) + 1
    else:
        return len(s)

s = "bccccddb"
print(longestpalindrome(s))