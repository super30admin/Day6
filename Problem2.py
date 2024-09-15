# Time Complexity : O(n) n is the length of the array which we traverse
# Space Complexity : O(n) we use extra space to create a hashMap and add the running sum along with its index
# Did this code successfully run on Leetcode :  Yes 
# Any problem you faced while coding this : Was failing to cover the edge case 


# Your code here along with comments explaining your approach : - Here we create a running sum if number is 1 we add 1 or else 0 then we subtract 0 and also we keep a track of running sum in hashTable 
# if we come across the same running sum value we calculate the length by subtarcting the current and previous array index. And in the end we keep a max value in a variable in return that.


def findMaxLength(self, nums: List[int]) -> int:
        hashMap = {}
        rsum = 0
        hashMap[0] = -1
        length = 0 
        
        for i in range(len(nums)):
            if nums[i] == 1:
                rsum += 1
            else:
                rsum -=1
            if rsum in hashMap:
                length = max(length, i- hashMap[rsum])
            else:
                hashMap[rsum] = i
        return length