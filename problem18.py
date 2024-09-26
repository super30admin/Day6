def longestPalindrome(self, s):
    """
    :type s: str
    :rtype: int
    """
    length = 0
    odd = 0
    dic = {}
    for i in s:
        if i in dic:
            dic[i] += 1
        else:
            dic[i] = 1
    for i in dic.values():
        if i % 2 != 0:
            odd = 1
            length += i - 1
        else:
            length += i
    if odd == 1:
        length += 1
    return length
# time- O(n)
# space - O(n)