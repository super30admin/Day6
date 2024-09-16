# Time complexity = O(n)
# Memory : O(n)
# Yes solved on leetcode

from collections import defaultdict

# The approach is to store the summ of all the
# elements that we've come accross in the loop
# and store them in a dictionary.
# calculate a difference, if the difference is 
# in the dictionary, that means that there exists
# a sub array with sum k
def subarray_k(array, k):
    d = defaultdict(int)
    d[0] = 1
    ans = 0
    summ = 0

    for num in array:
        summ += num
        diff = summ - k

        if diff in d:
            ans += d[diff]
        d[summ] += 1
    
    return ans

array = [1,1,1,1]
k = 2

print(subarray_k(array, k))