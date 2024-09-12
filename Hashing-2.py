#Problem 1
#Time Complexity: O(n)
#Space Complexity: O(n)
#Did this code successfully run on leetcode: yes
'''
Main idea:
We traverse the array to have the total sum until i for each i.
The thing to notice here is that if sum[j]-sum[i]=k, it means that
nums[i]+nums[i+1]+...+nums[j]=k, since up to i the elements are the same.
So when traversing the array, we can store the sum as key in the hashmap and
increment the count of that sum as the value for the hashmap.We can
check if in that hashmap how many times we had stored sum[i]-k,  let's call them
j (their index). It would mean that nums[j]+nums[j+1]+...+nums[i] is k. We increment
a count of every such occurences and return it at the end.
'''

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        if not nums:
            return 0
        h={}
        sum_i=0
        equals_k=0
        for i in range(len(nums)):
            sum_i+=nums[i]
            if sum_i-k in h:
                #this block should go before because if target 0, it will be counted
                # one time more
                #if sum_i-k is in h, it means there's a j <i such that sum_i-sum_j is k
                #meaning that the indices from j to i sum to k
                equals_k+=h[sum_i-k]
            if sum_i==k:
                #It is possible that the cumulative sum is already k
                equals_k+=1
            if sum_i in h:
                h[sum_i]+=1
            else:
                h[sum_i]=1
        return equals_k



#Problem 2
#Time Complexity: O(n)
#Space Complexity: O(n)
#Did this code successfully run on leetcode: yes
'''
Main idea:
if 0 we -1 the sum if 1 we +1 the sum. If the count is zero it means it's the same.
if the count is the same at two points, it means that the indices in between (i to j)
have the same number of ones and zero, because it means that it added 0
from i to j, meaning same number of 0 and 1. Also we can store the first occurence of each
sum, since we want the longest continuous subarray. So when we encounter a sum,
we check it it's in the hash, and do that index-same_occurence_first_index to get the length.
We compare it to the max length up until now and update. Similar to problem 1.
'''

class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        #idea: if sum=0, has property
        #edge case
        if not nums:
            return 0
        sum_i=0
        max_sub=0
        h={}
        for i in range(len(nums)):
            if nums[i]==1:
                sum_i+=1
            else:
                sum_i-=1
            if sum_i==0:
                #if the whole array until now has a count of 0
                #obviously it's the max length until now
                max_sub=i+1
                continue
            if sum_i in h:
                # i-h[sum_i] is the length of subarray that has the property, since we exclude the first index
                max_sub=max(i-h[sum_i],max_sub)
            else:
                h[sum_i]=i
        return max_sub


#Problem 3
#Time Complexity: O(n)
#Space Complexity: O(n)
#Did this code successfully run on leetcode: yes
'''
Main idea:
Keep a count of each letters, every pair of 2 can be added to my palindrome word
also keep track of letters to determine if we can add a letter to the center
to increase count
'''
class Solution:
    def longestPalindrome(self, s: str) -> int:
        #edge case
        if not s:
            return 0
        counts={}
        letters_left=len(s)
        max_l=0
        for c in s:
            if c in counts:
                counts[c]+=1
            else:
                counts[c]=1
        for c in counts:
            #if we have two of them, we can add the two in the palindrome
            n=2*(counts[c]//2)
            max_l+=n
            letters_left-=n
            #keep track of letters left to see if we can add on in the middle at the end

        if letters_left:
            return max_l+1
        return max_l
