'''
TC: O(n)
SC: O(n) considering the elements present in hashmap
Leetcode: unsuccessful
Problem: giving the wrong output but not sure where I might be going wrong.
'''


class Solution:
    def subarraySum(self, nums, k: int) -> int:
        currSum = 0
        diff = 0
        count = 0
        hashMap = {}
        hashMap[0] = 1
        for i in nums:
            currSum += i
            diff = currSum - k
            if diff in hashMap:
                count += hashMap[diff]
                hashMap[diff] = hashMap[diff] + 1
                hashMap[currSum] = 1
                print("Diff is : ",hashMap.keys()," and it's value: ",hashMap.values())
            else:
                hashMap[currSum] = 1
        print(hashMap)
        return count

        pass

s = Solution()
nums = [3,4,7,2,-3,1,4,2,0,1]
k = 7
"""nums = [-1,-1,1]
k = 0
nums = [1,-1,0]
k = 0
nums = [1,1,1]
k = 2

nums = [1,2,3]
k = 3

nums = [1,3,6,7,3,2,5,0,9,-3]
k = 6"""
# manual:
cnt = s.subarraySum(nums,k)
print("Count: ",cnt)
