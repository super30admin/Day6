class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        '''
        T = O(N)
        S = O(N)
        '''
        dict_ = collections.defaultdict(int)
        res = 0 
        curr_sum = 0 
        for i in range(len(nums)):
            curr_sum += nums[i]
            if curr_sum == k:
                res += 1
            if ( curr_sum - k ) in dict_:
                res += dict_[curr_sum - k]
            dict_[curr_sum] += 1 
        return res
