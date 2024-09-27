def subarraySum(nums, k) -> int:

    dic = {}
    dic[0] = 1
    count = 0
    rSum = 0
        
    for i in range(len(nums)):
        rSum = rSum + nums[i]
            
        if rSum - k in dic:
            count = count + dic.get(rSum-k)
            
        if rSum not in dic:
            dic[rSum] = 1
                
        else:
            dic[rSum] = dic.get(rSum)+ 1
                
                
    return count


coun = subarraySum([1,2,3], 5)

print(coun)