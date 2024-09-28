public class Solution{
     public int longestSeqBinaryArr(int[] intArr){
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int maxLength =0;
        map.put(0,-1);
        for(int i=0;i<intArr.length;i++){
            if(intArr[i]==1){
                sum++; 
            }else{
                sum--; 
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }else{
                maxLength = Math.max(maxLength,i- map.get(sum) );
            }
        }
     return maxLength;
    }
    
}
