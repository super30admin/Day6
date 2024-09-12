Q1) Subarray
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : nothing


// The code is about executing sum_i - k == sum_j  and then if seen earlier in hashmap which keeps count of running sum we update the count.

Q2) Contigous Array
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : nothing


// The code is same as 1 but we keep length(index) in hashmap for each sum. This sum is incremented when 1 is seen and decremented if 0 is seen.
// if same sum is seen twice that means between the two indices equal number of zeroes and 1s are satisfied

Q3) Longest Palindrome
// Time : O(n)
// Space : constant

// Idea we need max number of pairs for each character and we can afford one more if we have not exceeded length to make a palindrome.

