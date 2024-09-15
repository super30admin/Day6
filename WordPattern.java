// Time Complexity :O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach

import java.util.HashMap;
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        if(pattern.length()==0 || pattern==null) return false;
        HashMap<String,Character> smap=new HashMap<>();
        HashMap<Character,String> cmap=new HashMap<>();
        String [] strarr=s.split(" ");
        if(strarr.length!=pattern.length()){
            return false;
        }
        else{
            for(int j=0;j<pattern.length();j++){
                char c=pattern.charAt(j);
                String stemp=strarr[j];
                if(smap.containsKey(stemp)){
                    if(!smap.get(stemp).equals(c)){
                        return false;
                    }
                    
                }
                else{
                    smap.put(stemp,c);
                }
                if(cmap.containsKey(c)){
                    
                    if(!cmap.get(c).equals(stemp)){
                        return false;
                    }
                }
                else{
                    cmap.put(c,stemp);
                }
            }
        }
        return true;
        
    }
    public static void main(String[] args) {
        WordPattern obj = new WordPattern();
        String pattern = "abba"; 
        String s = "dog cat cat dog";
        System.out.println(obj.wordPattern(pattern, s));
    }
}
