// //Brute Force Hashing
// class Solution {
//     //Time Complexity:O(n)
//     //Space Complexity: O(1)
//     public int longestPalindrome(String s) {
//         if(s.length()<2)
//             return s.length();
//         HashMap<Character,Integer> map=new HashMap<Character,Integer>();
//         int count=0;
//         for(int i=0;i<s.length();i++){
//             map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
//             if(map.get(s.charAt(i))>1){
//                 count+=2;
//                 map.put(s.charAt(i),map.get(s.charAt(i))-2);
//             }
//         }
//         if(count<s.length()){
//             count++;
//         }
//         return count;
//     }
// }
//HashSet Approach
//Time Complexity: O(n)
// Space Complexity:O(1)
class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> set=new HashSet<Character>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            }
            else {
                count+=2;
                set.remove(s.charAt(i));
            }
        }
        if(!set.isEmpty())
            count+=1;
        return count;
    }
}
//using boolean array theoritcally it stores less space as boolean is 1 bit and int is 4 bits
//Time Complexity: O(n)
// Space Complexity:O(1)
class Solution {
    public int longestPalindrome(String s) {
        boolean[] flag=new boolean[58];
        int count=0;
        int trueCount=0;
        for(int i=0;i<s.length();i++) {
            int num=(int)s.charAt(i)-(int)('A');
            if(flag[num]) {
                flag[num]=false;
                count+=2;
                trueCount--;
            }
            else {
                flag[num]=true;
                trueCount++;
            }
        }
        if(trueCount>0)
            count++;
        return count;                                                               
    }
}