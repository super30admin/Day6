# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : y
# Any problem you faced while coding this : n


# Your code here along with comments explaining your approach

class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not s:
            return 0
        
        mySet = set()
        count = 0
        
        for c in s:
            if c not in mySet:
                mySet.add(c)
            else:
                count += 2
                mySet.discard(c)
                
        if len(mySet) == 0:
            return count
        return count + 1
        
s = Solution()

string = "civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"

s.longestPalindrome(string)

# iterating through string. storin characters in set if first occured, else removing from set for 2nd occurance
# and increasing the counter by 2. in the end, if set is empty, returning count. if not empty, return count+1