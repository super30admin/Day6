def subarraySum(self, nums: List[int], k: int) -> int:
        dic ={0:1}
        s =0
        count = 0
        for num in nums:
            s += num
            if s-k in dic:
                count += dic[s-k]
            if s in dic:
                dic[s]+=1
            else:
                dic[s] = 1
        return count 
        
        
        '''let say we have [1,3,4,5,-1,3], k = 4
            I will keep track of total sum s.
            s = 0
            initiate dic as {0:1}
            --> [0 ,1,4,8,13,12,15]
            while traversing given nums,keeping track of S --> total sum, and maintaing a dictionary, 
            if s is not in dic, add it to dic with value 1. If it is present in dic already add 1 to value. 
            While traversing if at any point s-k is in dic, add the value of it to count which was inititated as 0. return count in end. tc and sc is o(n)''' 
