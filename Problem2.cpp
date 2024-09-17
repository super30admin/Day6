//
// Created by shazmaan on 7/9/2019.
//

#include <iostream>
#include <algorithm>
#include <set>
#include <map>
#include <vector>

using namespace std;

class Solution{
public:
    int findMaxLength(vector<int>& nums){
        int counter = 0; int maxVal = 0;
        map<int,int> hashmap; hashmap.insert(pair<int,int>(0,0));
        for(int x = 0 ; x<nums.size(); x++){
            if(nums[x]==1){
                counter+=1;
            }else{
                counter-=1;
            }
           if(counter == 0 || (hashmap.find(counter)!=hashmap.end() && (x-hashmap[counter])>maxVal)){
                maxVal = (x-hashmap[counter]);
                if(counter == 0){maxVal++;}
            }
            hashmap.insert(pair<int,int>(counter,x));
//            cout<<maxVal<<" maxVal "<<counter<<" couter\n";
        }
        return maxVal;
    }
//    int findMaxLength(vector<int>& nums) {
//        int counter = 0; int ret = 0; int lastIndex = 0;
//        map<int,int> hashmap; int index =0;
//        for(int x : nums){
//            if(x==0){
//                counter ++;
//            }else{counter--;}
//            cout<<counter<<" counter\n";
//            if((counter == 0)){
//                ret+=2; lastIndex = index;
//            }else if(hashmap.find(counter)!=hashmap.end()){
//                cout<<(lastIndex)<<" lastIndex>(nums[hashmap[counter]]-abs(counter))\n";
//                if(nums[hashmap[counter]]!=x && lastIndex>(hashmap[counter]-abs(counter))){
//                    ret+=2; lastIndex = index;
//                }
//            }else{
//                hashmap.insert(pair<int,int>(counter,index));
//            }
//            cout<<ret<<" ret\n---------\n";
//            index++;
//        }
//        return ret;
//    }
};

int main(){
    Solution s;
    vector<int> vec{0,1,1,0,1,1,1,0};
    vector<int> vec2{0,0,1,0,0,0,1,1};
    cout<<s.findMaxLength(vec2)<<endl;
    return 0;
}

//array = {0,0,1,1,0,1,0,1,1}
//index =  0,1,2,3,4,5,6,7,8
//sum = 0; max =0; pointer = 0;
////we check even only if pointer is even. i.e every 2 elements.
//Iteration:
//index = 8: sum+= array[8]*2^pointer = 0; pointer =1;
//index = 7: sum+= array[7]*2^pointer = 0; pointer =2; sum!=odd ->max=0; sum = array[7]; pointer=1;
//index = 6: sum+= array[6]*2^pointer = 1; pointer =2; sum==odd ->max=2;
//index = 5: sum+= array[5]*2^pointer = 5; pointer =3;
//index = 4; sum+= array[4]*2^pointer = 5; pointer =4; sum==odd ->max=4;
//index = 3; sum+= array[3]*2^pointer = 21; pointer =5;
//index = 2; sum+= array[2]*2^pointer = 21; pointer =6; sum==odd ->max=6;
//index = 1; sum+= array[1]*2^pointer = ; pointer = 7;
//index = 0; sum+= array[0]*2^pointer = 44+2^7+2^8; pointer = 8;