import collections
class Solution:
    def subArray(self,array,k):
        if not array:
            return 0


        running_sum = 0
        hashMap = collections.defaultdict(lambda:0)
        total = 0
        hashMap[0] = 1
        for x in array:
            running_sum += x
            sum = running_sum - k
            total += hashMap[sum]
            hashMap[running_sum] += 1
        return total

s = Solution()
print(s.subArray([3,4,7,2,-3,1,4,2,0,1],7))
print(s.subArray([1,2,3],3))