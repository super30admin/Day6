class Solution:
    def longestPalindrome(self, s: str) -> int:
        # Time Complexity : O(N), space complexity : O(1)
        map_count = {}
        for i in s:
            if i in map_count:
                map_count[i] += 1
            else:
                map_count[i] = 1

        count = 0
        print(map_count)
        for i, v in map_count.items():
            count += v // 2 * 2
            if count % 2 == 0 and v % 2 == 1:
                count += 1
        return count
