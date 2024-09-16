//TC-O(N)
//SC-O(N)
class Solution {
public:
    int longestPalindrome(string s) {
        //using hashmap
        unordered_map<int,int> h;
        for(auto p:s){
            h[p]++;
        }
        
        int odd_count=0;
        int even_count=0;
        int remove=0;
        for(auto p:h){
           if(p.second%2!=0){
               odd_count+=p.second-1;
               remove=1;
               }
            else{
                even_count+=p.second;
            }
        }
        return odd_count+even_count+remove;
    }
    
    //using set
        int count=0;
        unordered_set<int> m;
        for(auto p:s){
            if(m.find(p)!=m.end()){
                count++;
                m.erase(p);
            }
            else m.insert(p);
        }
        if(!m.empty())return 2*count+1;
        else return 2*count;
    }
};