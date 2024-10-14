package ARRAY;

public class Max {
    public static void main(String args[]){
        int[] arr={1,2,3,74,5,6,7,8,59,10};
        System.out.println(max(arr,6,9));
    }
    static int max(int[]newarray,int start,int end){
        int maxNumber=0;
        if(end>start){
            return -1;
        }
        if(newarray.length==0){
            return -1;
        }
        for(int i=start;i<=end;i++){
            if(maxNumber<newarray[i]){
                maxNumber=newarray[i];
            }

        }
        return maxNumber;
    }
}
