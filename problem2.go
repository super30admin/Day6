// Time Complexity : O(n) 
// Space Complexity : O(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
func findMaxLength(nums []int) int {

    if len(nums) == 0{
        return 0
    }
    
    maxlength := 0
    count := 0
    current_length := 0
    m := make(map[int]int)
    
    m[0] = -1
    
    for i:=0;i<len(nums);i++{
        if nums[i] == 0{
            count -=1
        }else{
            count += 1
        }
        
        if _,ok:=m[count];ok{
            current_length = i-m[count]
            if maxlength < current_length {
                maxlength = current_length
            }
        }else{
            m[count] = i
        }
        
    }
    
    return maxlength
}
