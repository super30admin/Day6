

// Time Complexity : O(n) n is the size of string.
// Space Complexity : O(1) hashmap of only 52 chars max. 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

class Solution {
    
    unordered_map<char,int>mymap; // char and count
    bool odd = false;
public:
    int longestPalindrome(string s) {
        for( int i=0; i< s.length(); i++ ){
            mymap[s[i]]++;
        }
        
        int answer = 0;
        for( auto it=mymap.begin(); it!=mymap.end(); it++){
            int val = it->second;
            if( ( val % 2 ) == 0 ) {
                answer += val;
            } else {
                answer += val-1;
                // in this case one more can be added later in middle as it is odd
                odd = true;
                
            } 
        }
        if( odd ){
            return answer + 1;
        }
        return answer;
        
    }
};
