'''

Any difficulties : Yes, what to hash and how hash is useful
Did it run on leetcode: TLE
Time Complexity: 0(n2)
Space Complexity: 0(n)

Algorithm:

1. Create a copy of nums but instead of having 0 here elements will be -1

and rest the algo is as same as what I did in the subarray_sum_equals_k 

This approach will give you TLE
'''

if not nums:
            return 0
        
        maxSize = -1
        count = 0
        nums2 = [ -1 if i==0 else 1 for i in nums]
        sums = [0]*len(nums2)
        sums[0] = nums2[0]
        for i in range(1,len(nums2)):
          sums[i] = sums[i-1]+nums2[i]
        
        print(nums2)
        print(sums)
        
        for i in range(len(nums2)):
          if sums[i]==0:
            maxSize = max(maxSize,i+1)
        
        for i in range(1,len(nums2)):
          for j in range(i,len(nums2)):
            if sums[j]-sums[i-1]==0:
              maxSize = max(maxSize,(j-i+1))
        
        return maxSize if maxSize!=-1 else 0