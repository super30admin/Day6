#Time Complexity=O(n)
#Space Complexity=O(n)-hashmap takes the extra space-Auxilary space
#Ran succeffully in leetcode-Yes


# Here while we traverse through the array, we increment the count by 1 if we encounter 1 and decrement by 1 if we encounter 0.
#THIS PREFIX SUM IS STORED WITH RESPECT TO ITS INDEX IN A HASH MAPTo count the equal number of o's and 1s we see when the count is equal to 0 , then calculate the length of the subarray from index 0 to the present index palce. 
# Also for the subarrays present in the middle of the array, we check if we encounter the count again the that is stored in the hashmap, if so then we calculate the maxlength from the previous_index+1 to present index. 




class Solution:
    def findMaxLength(self, nums: List[int]) -> int:
        count=0
        maxlength=0
        hashmap={0:0}
        for idx,val in enumerate(nums,1):
            if val==0:
                count-=1
            else:
                count+=1
                
            if count in hashmap:
                maxlength=max(maxlength,idx-hashmap[count])
            else:
                hashmap[count]=idx
        return maxlength
            
