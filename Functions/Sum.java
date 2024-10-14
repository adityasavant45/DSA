import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {
    
      sum();   
    }
static void sum(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your First Number:");
        int a=sc.nextInt();
        System.out.println();
        System.out.print("Enter Your Second Number:");
        int b=sc.nextInt();
        int result=a+b;
        System.out.println("The Sum Of Given Number is "+result);


    }
}