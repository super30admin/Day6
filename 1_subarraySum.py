'''
Method 1: brute force:
# time complexity = O(n^2)
# space complexity = O(1)
# working on Leetcode = yes


Method 2: Optimize solution:
# time complexity = O(n)
# space complexity = O(n)
# working on Leetcode = yes

'''

#Method 1: brute force
# 1) start =0 and move another pointer from 0 - n and sum
# 2) if sum == k, count+=1
# 3) update start =1 and repeat again
def bruteForce(nums,k):
    count=0
    for i in range(len(nums)):
        sum = 0
        for j in range(i,len(nums)):
            sum +=nums[j]
            if sum == k:
                count+=1

    return count
# Method 2: optimum solution
# logic : cummulative sum at position= x if we know in past we had a cummulative sum = x-k
# then it means we had a sub array which has sub array whose sum is equal to k.
# ex: nums=[1,1,1] k=2 -> cum_sum=[1,2,3]
# cum_sum[0]=1, no past; cum_sum[1]=2 ->do we have 2-2=0 in past (initialize past with 0:1) count+=past;
# cum_sum[2]=3 in past we had 3-2=1, yes, count+= number of time past repeataion
# use hashmap(key=cum_sum, value=count of cum_sum)

def optimum(nums,k):
    hashmap={0:1}
    cum_sum=0
    count=0
    for i in nums:
        cum_sum+=i
        # is cum_sum in my hashmap
        if cum_sum-k in hashmap:
            count+=hashmap[cum_sum-k]
        if cum_sum in hashmap:
            hashmap[cum_sum]+=1
        else:
            hashmap[cum_sum]=1

    return count





nums=[1,1,2,3,-1,4,2,1,1]
k=2
import time

tic=time.time()
print('brute force solution',bruteForce(nums,k))
toc=time.time()
print(toc-tic)

tic=time.time()
print('optimum solution',optimum(nums,k))
toc=time.time()
print(toc-tic)

