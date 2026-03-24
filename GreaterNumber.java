import java.util.*;
public class GreaterNumber {

    public static int getGreater(int a, int b){
        if (a > b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        int num1= sc.nextInt();
        int num2= sc.nextInt();

        int Greater= getGreater(num1, num2);

        System.out.println("the greater number is: " +Greater);
    }
    
}
