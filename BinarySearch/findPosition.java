/*FaceBook Question
 * Q.Find First And Last Position Of element in sorted array
 * Example Input: [5,7,7,8,810],target=8 then Output should be [3,3]
 */

package BinarySearch;

import java.util.*;

public class findPosition {
    public static void main(String args[]) {
        int arr[] = {5,7,7,7,7,8,8,10,11,11,12};
        int answer[]=searchRange(arr, 7);
        System.out.println(answer[0]+" "+answer[1]);

    }

    static int[] searchRange(int[] arr, int target) {
        int ans[]={-1,-1};
        ans[0]=search(arr, target, true);
        ans[1]=search(arr, target, false);
        return ans;
    }

    //This returns the index value of exact poition of target
    static int search(int[] arr,int target,boolean findStartIndex){
        int start = 0;
        int ans=-1;
        int end = arr.length - 1;
        int mid = 0;
        while (start <= end) {
            
           mid = (start + end) / 2;
            if (arr[mid] > target) {
              end=mid-1;
            } else if(target>arr[mid]){
               start= mid + 1;
           } 
           else{
            //Potential answer is found and we have stored it to check
            ans=mid;
            if(findStartIndex){       
                end=mid-1;
           
            }
            
            else{
                start=mid+1;
            }
           }
  
        }
        return ans;
    }
}

/*
 * 5,7,7,8,8,10
 * start=0 end=5 mid=2 answer=7 < target=8
 * start=3 end=5 mid=4 answer=0 target=8
 * start=
 */
