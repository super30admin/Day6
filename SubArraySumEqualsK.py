// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution:
    def subarraySum(self, lis: List[int], k: int) -> int:
        di={0:1} #initially hash as 0 sum and subarray ([]) as 1
        sum=0
        count=0
        for i in range(len(lis)): 
            sum+=lis[i] # adding current number to sum
            comp=sum-k 
            if comp in di: # using the calculated complement to check if its in hash
                count+=di[comp] # if its in hash, add the corresponding value to count ( because upto that index , we have subarrays with k as sum)
            if sum in di:
                di[sum]+=1 # if sum in subarray , then add count of subarray
            else:
                di[sum]=1 # else add new entry with key as sum and value as 1
        return count