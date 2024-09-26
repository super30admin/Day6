Time Complexity-O(n)
Space Complexity-O(1) *constant space*
Did the code run on Leetcode? Yes

#include <iostream>
#include<map>
#include<vector>
using namespace std;

class Solution {
public:
    int longestPalindrome(string s) {
        if(s.length()==0)
        {
            return 0;
        }
        int result=0;
        int flag=0;
        map<char,int>m;
        for(int i=0;i<s.length();i++)
        {
            m[s[i]]++;
        }
        for(auto i=m.begin();i!=m.end();i++)
        {
            if(i->second%2!=0)
            {
                flag=1;
                result+=i->second-1;
            }
            else
            {
                result+=i->second;
            }
        }
        if(flag==0)
            return result;
        else
            return result+1;
    }
};

int main() {
	int res;
	string s="abccccdd";
	Solution soln;
	res=soln.longestPalindrome(s);
	cout<<res;
	return 0;
}