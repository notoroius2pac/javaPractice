package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArray {
    public static void main(String []args){
        int[] arr= new int[]{1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;++i){
            list.add(arr[i]);
        }
        Collections.reverse(list);
           System.out.println(list);
    }
}
