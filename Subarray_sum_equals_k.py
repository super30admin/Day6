#Approach 
#TC and SC: O(n)
# concept is will be finding running sum let say x 
# now we have given k =3 if we figure out rSum-k will get the subarray that's is having subarray with k value 
# x is rSum and z is targeted value will be finding y =x-z
# example : [1,1,1]
# Now having {0:1}
# 1 -> {rSum=2: count : 1}
# 1-> {rSrum=3 : count : 1}
# try dry run again 
class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        count=0
        rSum=0
        hash_map={}
        # {0:1} initially store 0:1 as k-v pair
        hash_map[0]=1

        for i in range(len(nums)):
            # first find the running sum
            rSum+=nums[i]
            
            # first will check if we have any subrray (rSum-k) in hashmap
            # if yes then then will increase count (count is value here and rSum is key)
            if (rSum-k) in hash_map:
                count+=hash_map[rSum-k]
            # if rSum is not in hasp map then add in map 
            # if rSum is there then increase value count
            if rSum not in hash_map:
                hash_map[rSum]=1
            else:
                hash_map[rSum]+=1
        return count