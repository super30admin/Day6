# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


prefix_sums_seen = defaultdict(int)
prefix_sums_seen[0] = 1
subarrays_count = 0
ongoing_sum = 0

for num in nums:
    ongoing_sum += num
    subarrays_count += prefix_sums_seen[ongoing_sum - k]
    prefix_sums_seen[ongoing_sum] += 1

return subarrays_count