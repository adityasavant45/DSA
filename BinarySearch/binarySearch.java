package BinarySearch;
import java.util.Scanner;

public class binarySearch{
  
   public static void main(String args[]){
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    Scanner sc=new Scanner(System.in);
    
    // for(int i=0;i<arr.length;i++){
    //     arr[i]=sc.nextInt();
    // }
    int answer=peak(arr);
 System.out.println(answer);
   } 
   static int peak(int[] arr){
    Scanner sc=new Scanner(System.in);
     int start=0;
     int end=arr.length-1;
     int target=0;
     int mid=0;
     System.out.println("Enter the element you wanna find:");
     target=sc.nextInt();
     while(start<=end){
        mid=(start+end)/2;
        if(arr[mid]==target){
            
             return mid;
        }
        else if(arr[mid]<target){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
       
     }
     return -1;
   }
}