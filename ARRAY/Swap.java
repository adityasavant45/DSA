package ARRAY;
import java.util.*;
public class Swap {
    public static void main(String args[]){
        int[] arr={12,34,5,6,14,35,67};
        swap(arr,3,5);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] newarray,int index1,int index2){
         int temp=newarray[index1];
         newarray[index1]=newarray[index2];
         newarray[index2]=temp;
    }
}
