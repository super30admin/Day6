def subarraySum(self, nums, k):
    """
    :type nums: List[int]
    :type k: int
    :rtype: int
    """
    #         count=0
    #         # summ=0
    #         for i in range(len(nums)):
    #             summ=0
    #             for j in range(i,len(nums)):

    #                 summ+=nums[j]
    #                 if summ==k:
    #                     count+=1
    #         return count
    dic = {}
    dic[0] = 1
    summ = count = 0
    for i in nums:
        summ += i
        if summ - k in dic:
            count += dic[summ - k]
        if summ not in dic:
            dic[summ] = 1
        else:
            dic[summ] += 1
    # print(dic)
    return count

#time - O(n)
#space- O(n)