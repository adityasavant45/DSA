public class Greeting {
    public static void main(String args[]){
        int result=greeting();

        System.out.println(result);
    }
    public static int greeting(){
        System.out.println("Hello World!!");
        return 6;
    }

//  Here return type of function greeting is int cause we are sending return value as integer 6
//  The code after return keyword will not execute.
}
