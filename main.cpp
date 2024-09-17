#include <iostream>
#include <vector>
#include <map>
#include <set>
#include <string>

using namespace std;
class Solution {
public:
    int longestPalindrome(string s) {
        map<char,int> m;
        bool flag = false;
        int count = 0;
        for(int i =0; i< s.size();i++){
            m[s[i]]++;
        }
        for(auto itr = m.begin();itr != m.end();itr++){
            if((itr->second) % 2 == 0){
                count = count + (itr->second);
            }else{
                flag = true;
                count = count + ((itr->second) -1);
            }
        }
        if(flag){
            return count+1;
        }
        return count;
    }
};


int main() {
    string pattern = "abba";
    string s = "dog dog dog dog";
    wordPattern(pattern,s);
    return 0;
}
