//o(nlogn)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null||strs.length==0)return new ArrayList<>();
        
        HashMap<String,String> map=new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            String str=strs[i];
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String stored = String.valueOf(charArray);
            if(!map.containsKey(stored)){
                map.put(stored, new ArrayList<>());
                
            }
            map.get(stored).add(str);
            
        }
        return new ArrayList<>(map.values());
    }
}
