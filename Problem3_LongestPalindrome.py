#Time Complexity: O(n)
#Space Complexity: O(n)
#Working on LeetCode: Yes
class Solution:
    def longestPalindrome(self, s):
        count_mapper = {}
        flag = False
        for i in s:
            if i not in count_mapper:
                count_mapper[i] = 1
            else:
                count_mapper[i] += 1
        result = 0
        for i in count_mapper:
            if count_mapper[i]%2 == 0:
                result+=count_mapper[i]
            else:
                flag = True
                result+=count_mapper[i]-1
        
        if flag:
            return result+1
        return result
        

if __name__ == "__main__":
    obj = Solution()
    s = "abccccdd"
    print(obj.longestPalindrome(s))