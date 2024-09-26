
// this program is exceeding time limit and i am not able to figure out why.

// In this program I am checking whether that character already exists or not in the map if it does than I increment its frequency by 1 otherwise assign its freq to 1.
// then i am traversing through the map through an iterator and checking if the frequency is even or odd . If it is even than i am adding it in the length variable
// as it is if it is odd them i decrement its freq by 1 and then add in length variable. After that we check if map is empty or not if it is than we return length as it is else we increment the length by 1 and
// then return .since we can have one extra character in between that could make a palindrome
class Solution {
public:
    int longestPalindrome(string s) {
        int length=0;
        unordered_map<char,int> mapp;
        for(int i=0;i<s.length();i++)
        {
            if(mapp.count(s[i])<1)
            {
                mapp[s[i]]=1;
            }
            else
                mapp[s[i]]++;

         }
        unordered_map<char,int>:: iterator it;
        it=mapp.begin();
        while(it!=mapp.end())
        {
            if((it->second)%2==0)
            {
                length+=(it->second);
            }
            else
            {
                int a=(it->second)-1;
                length+=a;

            }

        }
        if(mapp.empty())
        {
            return length;
        }
        else
            return length+1;
    }
};

// this will have o(n) time complexity and O(1) space complexity
