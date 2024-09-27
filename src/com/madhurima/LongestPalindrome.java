/*
    Time Complexity = O(N)
    Space Complexity = O(1) as number of characters can be max 26 (if all small letters) and 52 if uppercase also allowed
    Did this code successfully run on Leetcode : yes
 */


package com.madhurima;

import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

public class LongestPalindrome {
}


//using hashset
class SolutionA1 {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        HashSet<Character> hset = new HashSet<>();

        char[] letters = s.toCharArray();

        int len = 0;

        for(char each: letters){
            if(hset.contains(each)){
                len = len + 2;
                hset.remove(each);
            }else{
                hset.add(each);
            }
        }

        if(!hset.isEmpty()){
            len++;
        }

        return len;

    }

    public static void main(String[] args) {
        SolutionA1 s = new SolutionA1();
        String str = "abccccdd";
        System.out.println(s.longestPalindrome(str));
    }
}

//using hashmap {two pass}
class SolutionA2 {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        ConcurrentHashMap<Character, Integer> hmap = new ConcurrentHashMap<>();

        char[] letters = s.toCharArray();

        int len = 0;

        for(char each: letters){
            if(hmap.containsKey(each)){
                hmap.put(each, hmap.get(each)+1);
            }else{
                hmap.put(each, 1);
            }
        }

        for(char key: hmap.keySet()){
            int val = hmap.get(key);

            if(val % 2 == 0){
                len = len + val;
                hmap.remove(key);
            }else{
                len = len + val -1;
                hmap.put(key, 1);
            }

        }

        if(!hmap.isEmpty()){
            len++;
        }

        return len;

    }

    public static void main(String[] args) {
        SolutionA2 s = new SolutionA2();
        String str = "abccccdd";
        System.out.println(s.longestPalindrome(str));
    }
}