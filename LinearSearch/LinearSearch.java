package LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String args[]){
      int[]arr={23,53,56,32,68,74,80,32,67,89,655};
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the item you are finding:");
      int item=sc.nextInt();
      int ans=getItemIndex(arr, item);
      if(ans==ans){
        System.out.println("Element found at index [number]"+ans);
      }
      else{
        System.out.println("Element Not Found");
      }
    }
    static int getItemIndex(int[] arr,int item){
        int i=0;
          for( i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }

          }
          return -1;
       
    }
}
