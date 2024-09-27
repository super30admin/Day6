def findMaxLength(nums) -> int:

    hashMap = {}
    hashMap[0] = -1
    rSum = 0
    count = 0
        
    for i in range(len(nums)):
        if nums[i]==0:
            rSum = rSum -1
            if rSum not in hashMap:
                hashMap[rSum] = i
            else:
                c = hashMap.get(rSum)
                c = i - c
                if c > count:
                    count = c
        else:
            rSum = rSum+1
            if rSum not in hashMap:
                hashMap[rSum] = i
            else:
                c = hashMap.get(rSum)
                c = i - c
                if c > count:
                    count = c
                        
    return count
            

count = findMaxLength([1,1,0,0,1,1,0,0,1,1])
print(count)