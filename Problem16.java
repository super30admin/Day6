public class solution{
  public  int noOfSubArraysTarget(int[] intArr,  int target){
        int sum=0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int count =0;
        map.put(0,1);
        for(int i=0;i<intArr.length;i++){
           sum+=intArr[i];
            if(!map.containsKey(sum)){
                map.put(sum, 1);
            }else{
                map.put(sum,map.get(sum)+1);
            }
            int bal= sum-target;
            if(map.containsKey(bal)) count=count+map.get(bal);
            
        }
     return count;
    }
}
