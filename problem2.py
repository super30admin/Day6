class Solution:
    def findMaxLength(self, nums):

        max_length = 0
        cur_sum = 0
        hashmap = {}
        hashmap[0] = -1

        for x in range(len(nums)):
            
            cur_sum   += 1 if (nums[x] == 0) else -1
            if (cur_sum in hashmap.keys()):

                length = x - hashmap[cur_sum]
                #print(nums[x] ,hashmap[cur_sum])
                #print(length)
                max_length = max (length, max_length)
                #print("if","Max:",max_length,cur_sum,hashmap)

            else:
                

                hashmap[cur_sum] = x
                #print("else:",cur_sum,hashmap)



        return max_length


# TC : O(n)
# SC : O(n) as hashmap
