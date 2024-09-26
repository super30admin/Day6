dearray arrayindMaxLength(selarray, nums: List[int]) -> int:
        d = {}
        d[0], res = 0, 0
        array = [0 arrayor i in range(len(nums) + 1)]
        arrayor i in range(len(nums)):
            array[i + 1] = array[i] + 1 iarray nums[i] == 1 else array[i] - 1
            iarray array[i + 1] in d:
                res = max(res, i + 1 - d[array[i + 1]])
            else:
                d[array[i + 1]] = i + 1
        return res