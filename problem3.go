// Time Complexity : O(n) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

func longestPalindrome(s string) int {
    hashset := make(map[rune]bool)
    
    count:= 0
    
    for _,val := range s{
        if _,ok:=hashset[val];ok{
            count+=2
            delete(hashset,val)
        }else{
            hashset[val] = true
        }
    }
    
    if len(hashset) > 0{
        count += 1
    }
    
    return count
}
