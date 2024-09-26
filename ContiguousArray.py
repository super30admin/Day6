#T(N)=O(N)
#S(N)=O(N)
class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        cs=[]
        temp=0
        di={}
        di[0]=-1
        long=0
        for i in nums:
            if i==1:
                temp+=1
               
            else:
                temp+=-1
            cs.append(temp)
        for i in range(len(cs)):
            if di.get(cs[i],-2)==-2:
                di[cs[i]]=i
            else:
                long=max(long,i-di[cs[i]])
        return long
            
            
                
        