//Not sure if all test cases will pass. Gave it a try
f//irst replaced all 0 with -1. Now we have to find subarrays which have sum =0
//if sum =0 and it is not already present in the hashmap , we add that index as value  at which sum becomes 0 and sum as key. size in this case will be 0->index
//if we again get sum =0 at new index and sum=0 is already present in map(let this be y). suppose old index at which sum=0 was x,
//this means array from 0 to x has sum=0 and 0 to y also has sum which implies x+1 to y is also 0. Therefore we iterate entire arraylist at this key and form subarray combinations with old indexes already in hashmap and the new index 

import java.util.*;

public class IsoMorphic {

    public static void Equalnumbers(int[] nums) {

        Map<Integer,ArrayList<Integer>> map= new HashMap<>();
        ArrayList<Integer> ar= new ArrayList<>();

        int starting = 0;
        int ending =0;

        for(int i =0 ; i<nums.length; i++)
        {
            if(nums[i]== 0)
                nums[i]=-1;
        }

        int sum=0;

        for(int i =0 ; i<nums.length;i++)
        {
                sum+=nums[i];

            if(!map.containsKey(sum)&&sum==0)
            {
                ArrayList<Integer> a=new ArrayList<>();
                map.put(sum,a);
                map.get(sum).add(i);
                ar.add(i+1);

            }

            else if(map.containsKey(sum))
            {
                ArrayList<Integer> b;
                b = map.get(sum);
                for (int j = 0; j < b.size(); j++)
                {
                   int size= i + (b.get(j)) ;
                   ar.add(size);

                }
                b.add(i);
                map.put(sum,b);
            }


        }
    System.out.println(ar);

    }


    public static void main(String[] args) {

        int[] arr= {0,1,1,0,1};

        Equalnumbers(arr);

    }
}
