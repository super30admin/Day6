#space: O(1)
#Time: O(n)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:

        rs = 0
        hashmap= dict()
        mx=0
        hashmap[0] = -1
        for j in range(len(nums)):
            if ( nums[j] == 0):
                rs -= 1
                arr.append(rs)
            else:
                rs += 1
                arr.append(rs)
            if rs not in hashmap:
                hashmap[rs] = j

            mx= max(mx, (j - int(hashmap[rs])))
        return mx



        
