//Time Complexity - O(N)
//Space Complexity - O(N)
class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char,int>m;
        int i,n=s.size(),c=0,ans=0;
        for(i=0;i<n;i++){
            m[s[i]]++;
        }
        unordered_map<char,int>:: iterator it=m.begin();
        for(it=m.begin();it!=m.end();it++){
            if((it->second)%2==0){
                ans=ans+(it->second);
            }
           else
                ans += 2 * (it->second / 2);
        }
        if (ans < s.size() && ans % 2 == 0)
            ans += 1;
        return ans;
    }
};