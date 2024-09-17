// longestPalindrome
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on GeeksforGeeks : yes
// Any problem you faced while coding this : no

// This File Contains Three solutions done in different ways with optimization decreasing with each attempt

class Solution {
    public int longestPalindrome(String s) {
        
        Set<Character> hSet = new HashSet();
        int sum = 0;
        for(int i = 0; i< s.length() ; i++) {
            
            if(!hSet.contains(s.charAt(i))) 
                hSet.add(s.charAt(i));
            else {
                sum += 2;
                hSet.remove(s.charAt(i));   
            }
            
        }
        
        if(!hSet.isEmpty())  sum++;
             
        return sum;
           
    }
}

class Solution {
    public int longestPalindrome(String s) {
        
        HashMap<Character,Integer> hMap = new HashMap();
        Boolean FlagCheck = false;
        
        for(int i = 0; i<s.length(); i++) {
            
            if(hMap.get(s.charAt(i)) == null) {
                hMap.put(s.charAt(i),1);
            } else {
                hMap.put(s.charAt(i), hMap.get(s.charAt(i)) + 1);  
            }  
        }
        
        int sum = 0;
        
        for (Character key: hMap.keySet()) {
            if(hMap.get(key) % 2 == 0) {
                sum = sum + hMap.get(key);
            } else {
                if(FlagCheck == false) {
                    sum = sum + hMap.get(key);
                    FlagCheck = true;
                } else {
                    sum = sum + hMap.get(key) - 1;
                }
            }
        }
        
        
        return sum;
        
        
    }
}

class Solution {
    public int longestPalindrome(String s) {
        
        int stringLen = s.length();
        char tempArray[] = s.toCharArray();
        Arrays.sort(tempArray);
        s  = String.valueOf(tempArray);
        
        int Sum = 0;
        Boolean FlagCheck = false;
        
        
        for(int i = 0; i< stringLen ; i++) {
            char tempChar = s.charAt(i);
            String tempString = "";
            while(i< stringLen && tempChar == s.charAt(i)  ) {
                tempString = tempString + tempChar;
                i = i+1;  
            }
            i = i - 1;
            
            if (tempString.length() % 2 == 0) {
                Sum = Sum + tempString.length(); 
            }
           else { 
                if(FlagCheck == false) {
                    Sum = Sum + tempString.length();
                    FlagCheck = true;
                } else {
                    Sum = Sum + tempString.length() - 1;
                }
            
             }
        }
        
        return Sum;
        
        
    }
}