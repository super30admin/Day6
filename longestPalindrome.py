#The easy way to solve this problem is to maintain a set and incease the coount by 2 for every duplicate and then at last increase count by 1 for uiniquee elements
#Time Complxity: O(n)
#Space Complexity: O(1)
def longestPalindrome(arr):
    set1 = list()
    count = 0
    if (arr is None or len(arr)==0):
        return -1
    for i in range(len(arr)):
        if arr[i] in set1:
            count = count + 2
        else:
            set1.append(arr[i])
    if len(set1)!=0:
        return count+1

arr = "abccdd"
print(len(arr))
l = longestPalindrome(arr)
print(l)