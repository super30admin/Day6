import java.util.HashMap;
import java.util.HashSet;
//Time Complexity :O(n)
//Passed all the test cases on Leet Code
// Solved using a HashSet using the property that it can store only the unique values.
//We have iterated over the string and if HashSet already contains the letter we have removed it from the hashSet and added rest of the unique values
// Woul like to discuss the HashMap solution offline .
public class longestpallindrome {
    public static int longestPalindrome(String s) {
        /*//base case check
        if(s.length()< 1 || s == null)
            return 0;
        HashSet hashset = new HashSet();
        //iterated till the length of the string
        for(int i =0;i<s.length();i++){
            //if the hashmap already contains the value we have removed it from the HashSet
            if(hashset.contains(s.charAt(i))){
                hashset.remove(s.charAt(i));
            }
            else{
                //else we have added the unique values into my hashset which indicates the count of odd times occurring letters.
                hashset.add(s.charAt(i));
            }
        }

        if(hashset.size()>1){
            return s.length() -hashset.size() +1;
        }
        else{
            return s.length();
        }*/

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            char key = s.charAt(i);

            if(map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else{
                map.put(key,1);
            }
        }

        int answer =0;
        for(int value : map.values()){
            //even count -> directly add all those characters to the answer
            if(value%2 ==0){
                answer += value;
                //in case of odd count
                // pair everyone of those, leaving behind exactly 1 lone unique character

                // factor in the unique single character only once (if not done before for any other character)
            }else{
                answer += value/2*2;
                if(answer % 2== 0)
                    answer +=1;
            }
        }

        return answer;


    }

    public static void main (String[] args) {

        String s = "aacdbb";
        System.out.println(longestPalindrome(s));

    }
}
