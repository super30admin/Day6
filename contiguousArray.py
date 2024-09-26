#The brute force way to solve this problem is to count the number of zeros and ones in each combination and return maximum
#Time Complexity: O(n)
#Space Complexity: O(1)
def maxLen(arr):
    if (arr is None or len(arr)==0):
        return 0
    map = dict()
    rSum = 0
    map[0] = -1
    maxS = 0
    for i in range(len(arr)):
        if (arr[i] == 0):
            rSum = rSum - 1
        else:
            rSum = rSum + 1
        if rSum in map:
            maxS = max(maxS,i - map[rSum])
        else:
            map[rSum] = 1
    return maxS
    


arr = [0,1]
m = maxLen(arr)
print(m)