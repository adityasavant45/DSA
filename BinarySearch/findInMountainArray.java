package BinarySearch;

public class findInMountainArray {
    public static void main(String[] args) {
        int arr[]={0,1,2,4,3,2,1};
        int target=3; 
       System.out.println(peakIndexInMountainArray(arr,target));
    }
    static int peakIndexInMountainArray(int[] arr,int target){
        int peak=ascendingRange(arr);
        int firstTry=orderAgnosticsBinarySearch(arr, target, 0, peak);
        if(firstTry!=-1){
            return firstTry;
        }
        return orderAgnosticsBinarySearch(arr, target, peak+1, arr.length-1);
    }
    static int orderAgnosticsBinarySearch(int[]arr,int target,int start,int end){
          boolean isAsc=arr[start]<arr[end];
          while (start<=end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
          }
          return -1;
    }
    static int ascendingRange(int[] arr){
        int start=0;
        int end=arr.length-1;
       
        while (start<end) {
          int mid=(start+end)/2;
            
            if(arr[mid]<arr[mid+1]){
                    start=mid+1;
            }
            else { 
                end=mid;
            }
        }
        return end;
    }
}
