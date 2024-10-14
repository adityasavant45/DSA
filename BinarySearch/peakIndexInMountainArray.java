/*
 * Q.You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.
Example 1:
Input: arr = [0,5,2,0]
Output: 1
 */
package BinarySearch;
public class peakIndexInMountainArray {
    public static void main(String[] args) {
       int arr[]={0,2,3,5,7,8,4,1}; 
       System.out.println(peakIndexInMountain(arr));
    }
    static int peakIndexInMountain(int[] arr){
        int start=0;
        int end=arr.length-1;
       
        while (start<end) {
          int mid=(start+end)/2;
            
            if(arr[mid]<arr[mid+1]){
                    start=mid+1;
            }
            else{
                end=mid;
            }
           
        }
        return start;

    }
}

/*
 * here condition is start<end cause if start<=end then nothing will be return cause at the end start=mid=end
 */
