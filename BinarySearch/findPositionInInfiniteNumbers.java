/*
 * Q.Find Position Of An Element in sorted array Of infinite Numbers.
 */

package BinarySearch;

public class findPositionInInfiniteNumbers {
    public static void main(String[] args) {
       int arr[]={2,3,7,10,12,17,19,20,24,27,28,30,32,42,46,48,80} ;
       int target=42;
       System.out.println(findingRange(arr, target));
    }
    static int findingRange(int[] arr,int target ){
        int start=0;
        int end=1;
        while (target>arr[end]) {
            int newStart=end+1;
            end=end+(end-start+1)*2;
            start=newStart;
        }
        return search(arr, target, start, end);
    }
    static int search(int[] arr,int target,int start ,int end){
        while (start <= end) {
            
         int  mid = (start + end) / 2;
            if (arr[mid] > target) {
              end=mid-1;
            } else if(target>arr[mid]){
               start= mid + 1;
           } 
           else{
            //Potential answer is found and we have stored it to check
              return mid;
           }
  
        }
        return -1;
    }
}
