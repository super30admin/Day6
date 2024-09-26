def findMaxLength(self, nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    dic = {}
    dic[0] = -1
    dummysum = length = 0
    for i, val in enumerate(nums):
        if val == 0:
            dummy = -1
        else:
            dummy = 1
        dummysum += dummy
        if dummysum in dic:
            if length < (i - dic[dummysum]):
                length = i - dic[dummysum]
        else:
            dic[dummysum] = i
    return length

#time- O(n)
#worst case space- O(n)