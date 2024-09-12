// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
edge case set map[0] = -1
for each element if its 0 decrease sum by 1 else add by 1
check if current sum exists in map if not then add current index
if exists check if max length is more than current index and last entry
if its more then replace max
return max
*/

package main

import "fmt"

func findMaxLength(nums []int) int {
	max := 0
	sum := 0
	m := map[int]int{}
	m[0] = -1
	for i:= 0; i<len(nums);i++ {
		if nums[i] == 0 {
			sum =sum - 1
		} else {
			sum = sum + 1
		}
		temp, e := m[sum]
		if e {
			if i - temp > max {
				max = i - temp
			}
		} else {
			m[sum] = i
		}
	}
	return max

}

func MainContiguous() {
	fmt.Println(findMaxLength([]int {0,1,0})) //expected 2
}
