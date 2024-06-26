def subarraySum(self, nums: List[int], k: int) -> int:
    i, j = 0, 0
    curr_sum = 0
    total_sub_arrays = 0
    print(nums[0])
    while (i <= j and j <= len(nums) - 1):

        if curr_sum + nums[j] == k:
            total_sub_arrays += 1
            curr_sum = curr_sum + nums[j] - nums[i]
            i += 1
            j += 1

        elif curr_sum + nums[j] > k:
            curr_sum = curr_sum - nums[i]
            i += 1


        else:
            curr_sum += nums[j]

            if j + 1 <= len(nums) - 1:
                j += 1

            else:
                i += 1

    return total_sub_arrays
