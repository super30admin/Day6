// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Below is the appproach using the hashMap
class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        int countOne=0;
        HashMap<Character,Integer> hash=new HashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
            }else{
                hash.put(s.charAt(i),1);
            }
        }
        // if(hash.size()==1){
        //     return s.length();
        // }
        // for(Character ch:hash.keySet()){
        //     //System.out.println(ch+","+hash.get(ch));
        //     count=count+((hash.get(ch)/2)*2);
        //     if((hash.get(ch)%2==1)){
        //         countOne=countOne+1;
        //     }
        // }
        for(Integer ch:hash.values()){
            //System.out.println(ch+","+hash.get(ch));
            count=count+((ch/2)*2);
            if((ch%2)==1){
                countOne=countOne+1;
            }
        }
        if(countOne>0){
            count=count+1;
        }
        return count;
    }
}

// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :


// Below is the appproach using the hashset
class Solution {
    public int longestPalindrome(String s) {
        int count=0;
        HashSet<Character> hash=new HashSet<Character>();
        for(int i=0;i<s.length();i++){
            if(hash.contains(s.charAt(i))){
                hash.remove(s.charAt(i));
                count=count+2;
            }else{
                hash.add(s.charAt(i));
            }
            
        }
        if(hash.size()>0){
            count=count+1;
        }
        return count;
    }
}