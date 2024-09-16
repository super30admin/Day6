//Time Complexity O(n)
//Space Complexity O(n)
class Solution {
public:
    int longestPalindrome(string s) {
        
    unordered_map<char,int> new_map ;

    for(int i=0;i<s.length();i++) 
    {
        new_map[s[i]]++ ;
    }
    int count = 0,k =0;
    for(auto x:new_map){
        if(x.second%2 == 0){
            count += x.second ;
        } else {
            if(x.second > 2){
                  count += x.second-1 ;
            }
            k++;
        }
    }
    if(k > 0) return count+1 ;
    return count ;
}
};