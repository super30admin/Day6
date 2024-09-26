class Solution:
    def longestPalindrome(self, s: str) -> int:
        asset = set()
        count = 0
        for alphb in s:
            if alphb not in asset:
                asset.add(alphb)
            else:
                asset.discard(alphb)
                count += 2
        print(len(asset))
        return count+1 if len(asset) else count
                