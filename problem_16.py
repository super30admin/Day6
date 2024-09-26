
class Solution(object):
    def subarraySum(self, nums, k):
        # self.nums=nums
        dict_sub = {}  # empty dictionary for storing and updating runnimg sums and corresponding occurances
        count = 0
        # sum=0
        dict_sub[0] = 1  # initialise the dict with 0 as 1 as this is the base case and shpuld          have this for the logic to work
        i_sum = 0
        complimentary = 0
        for i in nums:
            i_sum += i
            complimentary = i_sum - k
            if complimentary in dict_sub: #case when nums=[1] and k=0 complimentary value if its updated in the same cycle should not be used so put this up and before updating dict
                count += dict_sub[complimentary]
                #print("ccc---", complimentary,dict_sub[complimentary])
            #print(i,'ii')
            if i_sum in dict_sub:
                dict_sub[i_sum] = dict_sub[i_sum] + 1
            else:
                dict_sub[i_sum]=1

            #print("ccc",complimentary)


        return count



class Solution(object):
    def subarraySum(self, nums, k):
        # self.nums=nums
        dict_sub = {}  # empty dictionary
        count = 0
        # sum=0
        dict_sub[0] = 1  # initialise the dict with 0 as 1 as this is the base case and shpuld          have this for the logic to work
        i_sum = 0
        complimentary = 0
        for i in nums:
            i_sum += i
            #print(i,'ii')
            if i_sum in dict_sub:
                dict_sub[i_sum] = dict_sub[i_sum] + 1
            else:
                dict_sub[i_sum]=1
            complimentary = i_sum - k
            #print("ccc",complimentary)
            if complimentary != i_sum and  complimentary in dict_sub: #case when nums=[1] and k=0 complimentary value if its updated in the same cycle should not be used
                count += dict_sub[complimentary]
                #print("ccc---", complimentary,dict_sub[complimentary])
            elif complimentary == i_sum and  complimentary in dict_sub:
                count += dict_sub[complimentary]-1

        return count


