// Approach 1 - In 2 passes
// Time Complexity - O(n). It actually is O(2n) since we go over the string twice in this approach, where n is the length of the string.
// Space Complexity - O(26) i.e. constant space since we will have to store a maximum of 26 elements in our maps.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    int longestPalindrome(string s) {
        unordered_map<char, int> counterMap;
        for(char c : s) counterMap[c]++; // store count(value) of each character(key) in the map
        
        int size = s.size() - 1;
        int answer = 0;
        bool oddPresent = false;
        
        for(auto& count : counterMap){ // iterate over the map again and see if the characters have even or odd counts.
            if(count.second % 2 == 0)
                answer += count.second;
            else{
                oddPresent = true;
                answer += count.second - 1;
            }
        }
        if(oddPresent)
            answer++;
        return answer;
    }
};


// Approach 2 - In a single pass
// Time Complexity - O(n). Since we go over the string once in this approach, where n is the length of the string.
// Space Complexity - O(26) i.e. constant space since we will have to store a maximum of 26 elements in our maps.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    int longestPalindrome(string s) {
        set<char> charSet;
        int size = s.size();
        int answer = 0;
        for(char c:s){
            if(charSet.count(c)){   // checks if the key is present in the map
                answer += 2;
                charSet.erase(c);
            }
            else
                charSet.insert(c);
        }
        
        // for(int i = 0; i < size; i++){
        //     if(charSet.count(s[i])){
        //         answer += 2;
        //         charSet.erase(s[i]);
        //     }
        //     else
        //         charSet.insert(s[i]);
        // }
        
        if(!charSet.empty())
            answer++;
        return answer;
    }
};
