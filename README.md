# Hashing-2

Explain your approach in **three sentences only** at top of your code



## Problem1 (https://leetcode.com/problems/subarray-sum-equals-k/)
Main idea here is we will keep running sum as key in hashmap. In this first we will iterate through all elements in the array. If map already contains running sum we will increase the count of the running sum by one and if it is already not there then we will add it map with count 1. To get the count of sub arrays which has sum k we will check running sum - k is present in the map or not and if it is present we will increase count by that number.



## Problem2 (https://leetcode.com/problems/contiguous-array/)
In this problem we have just 0s or 1s. If it is a first time then we will add running sum with it's index and we will store the maximum index difference in max. If the element is 0 we will decrease running sum by 1 and if element is 1 we will increase running sum by 1. If we already have running sum stored in the map then we will check the current index - running sum index is more than current max then we will update it. 



## Problem3 (https://leetcode.com/problems/longest-palindrome)
A very simple approach for this problem is we will add a new element in hashset and remove element if it is already there in the set. Everytime we remove the element from set we will add 2 to the count as it will be added to palindrome string. If the set is not empty then we can add one element at the middle of the string and increase count by 1. 