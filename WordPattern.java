import java.util.HashMap;

public class WordPattern {
    /***
     * Approach -
     *  Split pattern into string array.
     *  Convert String s into char array.
     *  if two arrays are of not same length return false
     *  because for word patern to match they should be of equal lenth
     *  create two hashmaps
     *  one for pattern as key and string chars as value for the same index
     *  another for string char a key and pattern word as value for the same index
     *
     *  interate through pattern  arrays and  check
     *  if pattern at that index exists in map as key
     *  and value for that key is same as the char at that index from string.
     *  if above is not true at any point return false.
     *
     *  if pattern doesnt exist, add the key and corresponding char from string in the map.
     *
     *  repeat same for String map and pattern as value.
     *  after existing through for loop, retrun true.
     *
     *  TIme - o(m+n) Split operation goes over every word in string
     *  Space - constant
     *
     *
     *
     *
     */
    public boolean wordPattern(String pattern, String s) {

        String[] stringArray = s.split(" ");
        char[] patternArray = pattern.toCharArray();
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        if (stringArray.length != patternArray.length) {
            return false;
        }

        for (int i = 0; i < patternArray.length; i++) {
            if (pMap.containsKey(patternArray[i])) {
                if (!pMap.get(patternArray[i]).equals(stringArray[i])) {
                    return false;
                }
            } else {
                pMap.put(patternArray[i], stringArray[i]);
            }

            if (sMap.containsKey(stringArray[i])) {
                if (!sMap.get(stringArray[i]).equals(patternArray[i])) {
                    return false;
                }
            } else {
                sMap.put(stringArray[i], patternArray[i]);
            }
        }
        return true;
    }

}
