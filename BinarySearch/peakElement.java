package BinarySearch;

import java.util.Scanner;

public class peakElement {

   public static void main(String args[]) {
      int arr[] = { 23, 45, 67, 90, 190, 670, 890, 895, 897, 900 };
      Scanner sc = new Scanner(System.in);
      int answer = peak(arr);
      System.out.println(answer);
   }

   static int peak(int[] arr) {
      Scanner sc = new Scanner(System.in);
      int start = 0;
      int end = arr.length - 1;
      int target = 0;
      int mid = 0;
      System.out.println("Enter the element you wanna find:");
      target = sc.nextInt();
      while (start <= end) {
         mid = (start + end) / 2;
         if (arr[mid] == target) {

            return mid;
         } else if (arr[mid] < target) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }

      }
      return start;
   }
}

// 23 45 67 90 190 670 890 895 897 900
// start=0 end=9 mid=4 value=190
// start=0 end=3 mid=1 value=45
// start=2 end=3 mid=2 value=67
