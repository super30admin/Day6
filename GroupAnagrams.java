import java.util.*;

public class GroupAnagrams {
    /**
     Create hashmap
     Approach - Iterate through strs and
     for each string create char array.
     Sort the char array.
     convert array back to string
     if map doesnt contain this string as key, add the key and create new arraylist as the value
     in map get the sorted string key's vauye and add a original string in the value arraylist.
     At the end create arraylist and add all the values og map in it and return the list of lists.
     time - nklogk  n -strings, each string length is K.
     space - constant



     */
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String s: strs){
            // Make array of chars
            char[] arr = s.toCharArray();
            // sort the array
            Arrays.sort(arr);
            // Convert the array back to string
            String sortedString = String.valueOf(arr);
            // if map doesnt contain sorted string as key
            if(!map.containsKey(sortedString)) {
                map.put(sortedString, new ArrayList<>());
            }
            map.get(sortedString).add(s);
        }
        return new ArrayList<>(map.values());


    }
}
