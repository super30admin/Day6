// Time Complexity : O(n)
// Space Complexity : O(1)
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
//1. Calculate the count
//2. Increase the length by count of char if its occurs even number of times or by count-1 for odd  number of times
//3. Check for one last occurence of a single character

//Drawback: multiple iterations.

class Solution {
public:
    int longestPalindrome(string s) {
        //edge
        if(s.length()==0){
            return 0;
        }
        //logic      //char, count
        unordered_map<char, int> my_map;
        
        for(auto c: s){
            my_map[c]++;
        }
        int length=0;
        for(auto  count:my_map){
            int temp = count.second;
            count.second = count.second%2;
            if(count.second==0){
                length = length+temp;
            }else{
                length = length+temp-1;
            }
            my_map[count.first] = count.second;
        }
        
        for(auto count:my_map){
            if(count.second==1){
                length = length+1;
                break;
            }
        }
        return length;
    }
};

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//1. Edge case:return when empty or with one character
//2. Calculate even or odd occurances and return the result using set

class Solution {
 int maximum_palindrome_length(string s) {
     unordered_set <char> char_set ; 
     int max_count=0;
     for(int i=0;i<s.length(); i++){
            if(char_set.find(s[i]) == char_set.end()){
                char_set.insert(s[i]);
            }
            else{
               char_set.erase(s[i]);
                max_count+=2;
            }
        }
     if(!char_set.empty()){
          max_count++;
     }
     return max_count;
 }
public:
    int longestPalindrome(string s) {
        //1.
         if(s=="") 
            return 0;
        if (s.length()==1)
            return 1;
        //2.
        return maximum_palindrome_length(s);
    }
};
