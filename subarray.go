// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
edge case set map[0] = 1
for each element increase sum by element
increase count if complement exists in map
increase map[sum] by one
return count at end of loop
*/

package main

import "fmt"

func subarraySum(nums []int, k int) int {
	count := 0
	sum := 0
	maps := map[int]int{}
	maps[0] = 1
	for i := 0; i< len(nums);i++ {
		sum += nums[i]
		count += maps[sum - k]
		maps[sum]++
	}
	return count
}

func MainSubArray() {
	fmt.Println(subarraySum([]int {1,1,1},2)) //expected 2
}
