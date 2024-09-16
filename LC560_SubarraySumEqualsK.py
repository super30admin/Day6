"""
[3,4,5,2,-1,1,4,2,0,1]
k = 7

Find all sub arrays such that sum = K

Brute force : do iterations from every index using nested iterations
for every index, maintain all sub arrays - TC = O(n*n)

We use the same concept of running sum 
IF we have the running sum till index a and index c, running sum of sub array from a to (c-1) = rs_a-rs_c
We need the running sum of the sub array to be equal to k
rs_a-rs_c= k
 i.e. rs_c = rs_a - k 

we check if this has occured before - if yes, we check the number of times it happened

we store { sub_array sum : count } in the dict

"""
# class Solution:
#     def  subarraySum(sum, nums : list[int], k : int) -> int:
#         store = {1:0}
#         r_sum = 0
#         result = 0
#         # we will check if r_sum - 7 has occured before. if yes, we increase the count. it is equivalent to finding if rsum_a - rsum_c == 7
#         for i in range(len(nums)):
#             r_sum += nums[i]
#             temp = r_sum-7
#             if temp in store :
#                 result+=store[temp]
#                 store[r_sum]+=1
#             else :
#                 store[r_sum]=1

#         return result

# nums = [3,4,7,2,-3,1,4,2,0,1]
# k=7    
# object = Solution()
# res = object.subarraySum(nums, k)
# print(res)


public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int[] sum = new int[nums.length + 1];
        sum[0] = 0;
        for (int i = 1; i <= nums.length; i++)
            sum[i] = sum[i - 1] + nums[i - 1];
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                if (sum[end] - sum[start] == k)
                    count++;
            }
        }
        return count;
    }
}



            
