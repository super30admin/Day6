#contiguous array
#leetcode solution accepted
#explaination [0,0,1,0,0,1,1]->lets start at 0
#Time complexity : O(n) where n is the size of the arraylist
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        dict ={}
        subarr,count =0,0
        for i in range(len(nums)):
            if nums[i]==1:
                count+=1
            else:
                count+=-1 #for values count =-1, -2 ,-1,-2,-3,-2,-1
            if count==0:
                subarr= i+1
            if count in dict:
                subarr = max(subarr,i-dict[count])#max(0,2-0)
            else:
                dict[count]=i #since not in dict {-1:0},{-2:1},{-3:4}
        return subarr
        