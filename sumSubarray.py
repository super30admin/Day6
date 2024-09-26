# As taught in the class I maintained a hash map and then found the occurrence of running sum, then returned the numbr of timee the running sum occured.
##Time Complexity: O(n)
#Space Complexity: O(n)
def findCount(arr,k):
    count = 0
    if (arr is None or len(arr)==0):
        return 0
    rSum = 0 
    hmap = dict()
    hmap[0] = 1
    for i in range(len(arr)):
        rSum = rSum + arr[i]
        compliment  = rSum - k
        if (compliment in hmap):
            count = count + hmap[compliment]
        if (rSum not in hmap):
            hmap[rSum] = 1
        else:
            hmap[rSum] = hmap[rSum] + 1
    return count





nums = [1,1,1]
k = 2
cnt = findCount(nums,k)
print(cnt)

