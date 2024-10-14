/*
 * Q.Letters lettersay is given in non-decreasing order and a character target ,return the smallest character in the array which is larger than target itself 
 * NOTE: That the letters wraps around
 * Example:
 *    if target=="z"  and letters=={'a','b','c'} then the answer is 'a'
 * if target=="a" and letters=={'c','y','z'} then answer is 'c'
 */

package BinarySearch;

import java.util.Scanner;

public class peakCharacter {


     public static void main(String args[]) {
      char letters[] = {'c','f','j'};
      Scanner sc = new Scanner(System.in);
      
      char answer = peak(letters);
      System.out.println(answer);
   }

   static char peak(char[] letters) {
      Scanner sc = new Scanner(System.in);
      int start = 0;
      int end = letters.length - 1;
      char target='e';
      System.out.println("Enter the element you wanna find:");
      
      while (start <= end) {
        int mid = (start + end) / 2;
        if (letters[mid] < target) {
            start = mid + 1;
            break;
         } else {
            end = mid - 1;
         }

      }
      return letters[start%letters.length];
   }
    
}

// we find e  start=0 end=2 mid=1 letters[mid]='f' end=0 start=1