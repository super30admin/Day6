// Time Complexity : O(N) where N is the number of element in the given array;
// Space Complexity :O(1) the alphabet size is fixed so the map would be of fixed size.
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No



// Your code here along with comments explaining your approach


class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char,int>umap;
        int result = 0;
        for(int i = 0; i < s.size();i++){
            umap[s[i]]++;
        }
        int flag = 0;
        for(auto x:umap){
            if(x.second%2==0)result+=x.second;//Adding all the even counts
            else{
                flag = 1;//if there is atleast one char with odd count
                result+=x.second-1;// for 1 count add 0 to result,for 3 add 2 etc 
            }
        }
        if(flag)return result+1;//if there was atleast 1 odd then it can act as pivot
        else return result;
    }
};