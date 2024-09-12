// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
/*
in the map if we already have one existance and encounter again then remove from map and increase count by 2
if its not present in map then just set to true
at last if any one of the element is true, increase count by 1
*/
package main

import "fmt"

func longestPalindrome(s string) int {
	count := 0
	arr := map[rune]bool{}
	for _, v := range s {
		if arr[v] == false {
			arr[v] = true
		} else {
			arr[v] = false
			count = count + 2
		}
	}
	for _, v := range arr {
		if v == true {
			count++
			return count
		}
	}
	return count
}

func MainLongestPalindrome() {
	fmt.Println(longestPalindrome("abccccdd")) //expected 7
}
