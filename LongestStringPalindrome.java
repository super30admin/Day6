//Two Pass Solution
//Time Complexity: O(N);
//Space Complexity: O(1); // coz of the finite number of characters
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap();
        int count =0;
        for(char c : s.toCharArray()){
            int freq = map.getOrDefault(c,0);
            map.put(c,freq+1);
        }
       for (Map.Entry<Character,Integer> entry : map.entrySet()) {
                  if (entry.getValue()>=2 && entry.getValue() % 2 == 0){
                      count =count + (entry.getValue());
                      map.put(entry.getKey(),0);
                  } else if(entry.getValue()>=2 && entry.getValue() % 2 == 1){
                      count =count + (entry.getValue()-1);
                      map.put(entry.getKey(),1);
                  }
       }

           if(map.containsValue(1)){
               return count+1;
           }else{
               return count;
           }

        }
    }

//One Pass Solution
//Time Complexity: O(N);
//Space Complexity: O(1); // coz of the finite number of characters
class Solution {
    public int longestPalindrome(String s) {
        Set<Character> set = new HashSet<>();
        int count =0;
        for(char c : s.toCharArray()){
            if(set.contains(c)){
                count = count + 2;
                set.remove(c);
            }else{
                set.add(c);
            }
        }
      return set.size()>0?count+1:count;
        }
    }
