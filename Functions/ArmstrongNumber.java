import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number:");
        int num=sc.nextInt();
        System.out.println(isArmstrong(num));

    }
    static boolean isArmstrong(int num){
        int sum=0;
        int storeNum=num;
          while(num>0){
            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
          }
          if(sum==storeNum){
            
            return true;
          }
          else{
           return false;
          }

    }
}

