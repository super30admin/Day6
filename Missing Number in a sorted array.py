# time complexity is o(n), where 'n' is the number of elements in the input
# space complexity is o(1)
def missing(nums):
    low = 0
    high = len(nums) - 1
    while(low <= high):
        mid = low + (high - low)//2
        if(mid == 0 or mid == len(nums)-1):
            return -1
        if(nums[mid] - nums[mid-1] > 1):
            return nums[mid] - 1
        elif(nums[mid + 1] - nums[mid] > 1):
            return nums[mid] + 1
        if(len(nums[low:mid+1]) != abs(nums[mid] - nums[low]) + 1):
            high = mid - 1
        else:
            low = mid + 1
    return -1