'''
# time complexity = O(n)
# space complexity = O(n)
# working on Leetcode = yes
# need to return max length
'''

def contiguous(nums):
    cum_sum=0
    length=0
    hashmap={0:-1}
    for i in range(len(nums)):
        if nums[i]==0:
            cum_sum-=1
        else:
            cum_sum+=1
        if cum_sum in hashmap :
            if  i-hashmap[cum_sum]>length:
                length=i-hashmap[cum_sum]
        else:
            hashmap[cum_sum]=i
    return length

nums=[0,1,1,0]
print(contiguous(nums))


