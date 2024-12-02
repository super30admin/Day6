def subarraySum(nums,k):
        hashMap = { 0: 1 }
        count = sum = 0
        for l in nums:
            sum += l
            if sum - k in hashMap:
                count += hashMap[sum - k]
            
            hashMap[sum] = hashMap.get(sum, 0) + 1

        return count
#Time Complexity=O(N)
#Space Complexit=O(N)