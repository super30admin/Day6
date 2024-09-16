//time complexity : O(n) n=length of s
//space complexity ; O(n)
//I don't face any problems
//runs successfully on leetcode


import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome409LeetCode {

    public int longestPalindrome(String s) {

        Map<Character, Integer> map = new HashMap<>();                      //creating the hashmap
        for(int i=0;i<s.length();i++){                                      //putting each character frequency and character in hashmap
            char temp = s.charAt(i);
            map.put(temp, map.getOrDefault(temp, 0) +1);
        }

        boolean oddFrequency= false;
        int count = 0;

        for(int i:map.values()){                                        //iterating the hashmap values

            if(i%2 == 0){                                           //if frequency is even the simply add to the count
                count = count + i;
            }
            else{                                               //if odd then get the nearest even value and add to the count
                count = count + (i-1);
                oddFrequency = true;                            //and set oddFrequency to true
            }
        }

//             for(Map.Entry<Character, Integer> entry: map.entrySet()){
//                 int val = entry.getValue();
//                 if(val %2 ==0){
//                     count = count + val;
//                 }
//                 else{
//                     count = count + (val - 1);
//                     oddFrequency = true;
//                 }
//             }


        if(oddFrequency){                               //check is there is odd frequency present then return count+1
            return count+1;
        }
        return count;                                   // else return count

    }






//     public int longestPalindrome(String s) {

//         Set<Character> set = new HashSet<>();
//         int count = 0;
//         for(int i=0; i<s.length();i++){

//             char temp = s.charAt(i);
//             if(set.contains(temp)){
//                 count = count+2;
//                 set.remove(temp);
//             }
//             else{
//                 set.add(temp);
//             }
//         }

//         if(set.isEmpty()){
//             return count;
//         }
//         else{
//             return count+1;
//         }

//     }

}
