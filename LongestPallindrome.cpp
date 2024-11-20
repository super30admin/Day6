class Solution {
public:
    int longestPalindrome(string s) {
        int cnt=0;
        unordered_map<char,int>mpp;
        for(char c:s){
            if(mpp.find(c)!=mpp.end()){
                mpp.erase(c);
                cnt+=2;
            }
            else{
                mpp[c]++;
            }

        }
        if(!mpp.empty()){
            cnt+=1;
        }
        return cnt;
        
    }
};