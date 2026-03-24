import java.util.*;

public class Function3 {

    // function definition
    public static int calculateProduct(int a, int b){

        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();


        System.out.println("Product of 2 Num: "+calculateProduct(a,b));
    }
}