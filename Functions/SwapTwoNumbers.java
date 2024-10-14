public class SwapTwoNumbers {
    public static void main(String ars[]){
   int a=90;
   int b=340;
   swap(a,b);
    }
    static void swap(int a,int b){
      int temp=a;
      a=b;
      b=temp;
      System.out.println("a = "+a);
      System.out.println("b = "+b);
    }



}
