# TC-O(n)
# SC-O(n)
hash1 = {}
count = 0
currentsum = 0
hash1[0] = 1
for i in range(len(nums)):
    currentsum += nums[i]
    if (currentsum - k) in hash1:
        count = count + hash1[currentsum - k]
    if currentsum not in hash1:
        hash1[currentsum] = 1
    else:
        hash1[currentsum] += 1

return count