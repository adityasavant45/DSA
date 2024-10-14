import java.util.*;
public class PrimeNumber {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter The Number To Check Whether It is Prime Or Not?");
       int num=sc.nextInt();
       prime(num);

    }
    static void prime(int number){
        int flag=0;
        for(int i=2;i<=number/2;i++){
            if(number%2==0){
               flag=1;
               break;
            }
        }
        if(flag==0){
     System.out.println("The Number is prime");
        }
        else{
            System.out.println("Number is not prime");
        }
    }
}
