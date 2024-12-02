class FindMaxLength {
    public int findMaxLength(int[] a) {
        //Time Compexity - O(n) Space COmplexity - O(n)
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        map.put(0,-1);
        int count = 0;
        int sum = 0;
        
        for(int j=0;j<a.length;j++){
            if(a[j] == 0){
                 sum = sum+(a[j]-1);
            }
            else{
                sum = sum+a[j];
            }
           
             if(map.containsKey(sum)){ //  0,1,0,1
                count = Math.max(count,j- map.get(sum)) ; //2, 4, 4, 6, 7
            } else{
                map.put(sum,j); //[1,0][2,1][0,3] === [-1,0]
            }
            
        }
        return count;
      
    }
}