package ARRAY;
import java.util.*;;
public class ReverseArray {
    public static void main(String args[]){
        int[] arr={0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reverse(arr)));
    }

        static int[] reverse(int[] orginal){
            int[] reversearr=orginal;
            int count=orginal.length;
             for(int i=0;i<10;i++){
                count--;
                   reversearr[i]=orginal[count];   
                       
                }         
             
          
             return reversearr;
        }
}

