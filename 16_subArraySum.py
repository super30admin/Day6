# accepted in leetcode
# time - O(N), space - O(N)
# implemented using the complement of the running sum at everypoint, which will check for rest of the sub-array while iterating once.
def subarraySum(nums,k):
    map = {}  # new hashmap
    count = 0
    running_sum = 0
    map[0] = 1  # base case, index 0 is count 1
    for i in range(len(nums)):
        # print(map.keys())
        running_sum += nums[i]  # calculating running sum
        compliment = running_sum - k  # calculating compliment of running sum, it gives at every point if there are any sub arrays which contribute to sum 'k'.
        if compliment in map.keys():  # if compliment exists in hashmap , we increment count

            count += map[compliment]
            # print(compliment,count)

        if running_sum in map.keys():  # if running sum exists , increment count else add a new key to hashmap
            map[running_sum] += 1
        else:
            map[running_sum] = 1

    return count  # return count at the end

print(subarraySum([3,4,7,2,-3,1,4,2,0,1,2,2,3],7))