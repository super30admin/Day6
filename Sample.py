##############560. Subarray Sum Equals K####################

// Time Complexity : N^2
// Space Complexity : N
// Did this code successfully run on Leetcode : Yes, faced "Time Limit Exceeded" when inputs are increased
// Any problem you faced while coding this : faced "Time Limit Exceeded" when inputs are increased

// Your code here along with comments explaining your approach in three sentences only
I create a list l1 which will hold cumulative sum for each index, once this list is created we will loop through cumulative sum list and for each element we will check if the k can be found by subtracting the current element with any of previous element in cumulative sum list

class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        l1=[0]
        sum=0
        cnt=0
        for i in nums:		# adding cumulative sum to l1
            sum+=i
            l1.append(sum)
        print(l1)
        for i in range(1,len(l1)):	# loop through cumulative sum list to find how many time k can be achieved
            for j in range(i):
                    if l1[i]-l1[j]==k:
                        cnt+=1
        return cnt
        

#############409. Longest Palindrome###################


// Time Complexity : N
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach in three sentences only
We created a dictionary where I saved count of occurrence for each distinct character. Once this dict is built we will loop through dict and sum up the count of each element in 2 variables sum_odd where sum of element have odd count are maintained (we will subtract -1 form each count since is palindrome) and sum_even where sum of element have even count are maintained and at last we return sum of both

class Solution:
    def longestPalindrome(self, s: str) -> int:
        dict1={}
        sum_even=0
        sum_odd=0
        cnt_odd=0
        for i in s:
            if i not in dict1:
                dict1[i]=1
            else:
                dict1[i]+=1
        print(dict1)
        for k,v in dict1.items():
            if v%2==0:
                sum_even+=v
            else:
                cnt_odd+=1
                sum_odd+=(v-1)
        print(sum_even,sum_odd)
        if cnt_odd==0:
            return sum_even
        else:
            return sum_even+sum_odd+1


  
        

#############525. Contiguous Array########################



// Time Complexity : 
// Space Complexity : 
// Did this code successfully run on Leetcode : 
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach in three sentences only

Not able to think of solution as there can scenario where the string start form beginning
        
