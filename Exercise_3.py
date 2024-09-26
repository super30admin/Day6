class Solution:
    """
    List of odd chars
    TC - O(n)
    SC - O(1)
    """

    def approach1(self, s: str) -> int:
        hp = list()
        lp = 0
        for char in s:
            if char in hp:
                hp.remove(char)
                lp += 2
            else:
                hp.append(char)
        if len(hp) > 0:
            lp += 1

        return lp

    """
    Set of odd chars
    TC - O(n)
    SC - O(1)
    """

    def approach2(self, s: str) -> int:
        hp = set()
        lp = 0
        for char in s:
            if char in hp:
                hp.remove(char)
                lp += 2
            else:
                hp.add(char)
        if len(hp) > 0:
            lp += 1

        return lp

    def longestPalindrome(self, s: str) -> int:
        if len(s) == 1:
            return 1
        elif s is None or len(s) == 0:
            return 0
        # return self.approach1(s)
        return self.approach2(s)

