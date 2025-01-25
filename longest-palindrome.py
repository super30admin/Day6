# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


seen = set()
count = 0
for char in s:
    if char in seen:
        seen.remove(char)
        count += 2
    else:
        seen.add(char)

return count + 1 if count != len(s) else count