class Solution:
    def findMaxLength(self, l: List[int]) -> int:
        sum_=0
        max_len =0
        idx=0
        dic={0:-1}
        for i in l:
            if i==0:
                sum_+=1
            else:
                sum_-=1
            if sum_ not in dic:
                dic[sum_]=idx
            else:
                max_len=max(max_len,idx-dic[sum_])
            idx+=1
        return max_len
        
'''if:
the sum (sum_) is not in dict dic then we add it in our dict (dic)
else:
if sum sum_ is already in dict dic then that subarray contains equal no of 0s and 1s .
so we simply take the value i(current index) - d[sum_]first occurrence

tc and sc o(n)'''
