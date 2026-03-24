import java.util.*;
public class Function4 {

    public static void printFactorial(int n){
        int factorial= 1;
    //loops
    // if (n < 0) {
    //     System.out.println("invalid number");

    //     return;
    // }
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }

        System.out.println(factorial);

        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        printFactorial(n);
    }
    
}
