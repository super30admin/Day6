class Solution:
    def subarray(self,nums,k):

        cur_sum = 0
        counter = 0
        hashmap = {}
        hashmap[0] = 1


        def compliment(num,t):
            #print("return:",num -t)
            return num-t

        for x in nums:
            cur_sum += x 
            #print(cur_sum)
            comp = compliment(cur_sum,k)

            if (comp in hashmap.keys()):
                counter += hashmap[comp]
                if (cur_sum in hashmap.keys()):
                    hashmap[cur_sum] = hashmap[cur_sum] + 1
                else:
                    hashmap[cur_sum] = 1

            else:
                 if (cur_sum in hashmap.keys()):
                    hashmap[cur_sum] = hashmap[cur_sum] + 1
                 else:
                    hashmap[cur_sum] = 1

        #print(hashmap)
        return counter                


#TC : O(n)
#SC : O(n)
