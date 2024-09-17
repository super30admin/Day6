#LC 525 : Contiguous Array
#Time Complexity - O(n)
#Space Complexity - O(n)
d ={0:-1}
ml,c = 0,0
if nums.count(0) == nums.count(1):
    return len(nums)
for i in range(len(nums)):
    if nums[i] == 1:
        c= c + 1
    else:
        c = c - 1
    if c in d.keys():
        if ml < i - d[c]:
            ml = i - d[c]
    else:
        d[c] = i

return ml