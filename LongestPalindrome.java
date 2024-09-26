//Time Complexity -> o(n)
//Space Complexity -> o(n
import java.util.*;
class LongestPalindrome {

 public int longestPalindrome(String s) {
HashSet <Character> set = new HashSet<>();
int count = 0;
for(int i = 0; i < s.length(); i++){
char c =  s.charAt(i);
if(set.contains(c)){
set.remove(c);
count += 2;
} else {
set.add(c);
 }
 }
 if(!set.isEmpty()){
count++;
 }

 return count;

 }
public static void main(String args[]) {
	LongestPalindrome ob=new LongestPalindrome();
	int count=ob.longestPalindrome("abccccdd");
	System.out.print(count);
}
}