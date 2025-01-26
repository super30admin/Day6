def findMaxLength(nums):
    d = {0: -1}
    count = 0
    ans = 0

    for idx, num in enumerate(nums):
        count += 1 if num == 1 else -1
        if count in d:
            ans = max(ans, idx - d[count])
        else:
            d[count] = idx
    
    return ans