# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

hmap = {}
hmap[0] = -1
globalmax = 0
prefixexcess = 0

for idx in range(len(nums)):
    if nums[idx] == 1:
        prefixexcess += 1
    else:
        prefixexcess -= 1

    if prefixexcess in hmap:
        globalmax = max(globalmax, idx - hmap[prefixexcess])

    # update hmap
    if prefixexcess not in hmap:
        hmap[prefixexcess] = idx

return globalmax