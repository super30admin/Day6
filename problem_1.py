# TC: O(n)
# SC: O(n)

def subarraySum(nums, k):
    d = {0:1}
    count = total = 0

    for n in nums:
        total += n

        if total - k in d:
            count += d[total - k]
        
        d[total] = 1 + d.get(total, 0)
    
    return count