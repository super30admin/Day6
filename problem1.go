// Time Complexity : O(n) 
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

func subarraySum(nums []int, k int) int {
    if len(nums) == 0{
        return 0
    }
    
    count := 0
    m:= make(map[int]int) //initiates values with 0 value if not there 
    sum := 0
    m[sum] = 1
    
    for i:=0;i<len(nums);i++{
        sum += nums[i]
        
        if _,ok:=m[sum-k];ok{
            count += m[sum-k]  
        }
        
        m[sum] += 1
    }
    
    return count
}
