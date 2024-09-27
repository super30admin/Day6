class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        #initializing the hashmap
        hashmap=collections.defaultdict(int)
        currentsum=0
        count=0
        #initializing 0 key in the hashmap with value 1
        hashmap[0]=1
        for i in range(len(nums)):
            #updating the current sum
            currentsum+=nums[i]
            #checking condition for sub arrays
            if (hashmap.get(currentsum-k)):
                #updating the count of sub-arrays
                count+=hashmap.get(currentsum-k)
            #checking the condition to update values of current sum keys
            if(hashmap.get(currentsum)):
                newcount=hashmap.get(currentsum)
                newcount+=1
                hashmap[currentsum]=newcount
            else:
                hashmap[currentsum]=1
        return count