# Hashing-2

Explain your approach in **three sentences only** at top of your code


## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
1. using running sums.
2. we will go through the array calculating running sums and keeping them in HashMap as key and their occurrence as value.
3. in each position on i in the array we will check if (running sum - k) occurred before and will keep adding that occurrences to a count to find the total no. of the subarray that form k.


## Problem2 (https://leetcode.com/problems/contiguous-array/)
1. same as running sum for 1 adding 1 and for 0 add -1.
2. to find the longest we keep the early occurrence of the number in the hash map.
3. we compare each index and its early occurrence difference with a previous max occurrence.

## Problem3 (https://leetcode.com/problems/longest-palindrome)
1. keep the counts in hash map 
2. check for odds 

1. keep the count of the character in hashset
2. if count is 2 remove that number from set and add that to a counting variable.
3. if by the end if any character in hash set then total will be counting variable count+1
4. else it is value of counting variable.