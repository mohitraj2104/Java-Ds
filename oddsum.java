import java.util.*;
public class oddsum {

    public static void printoddsum(int n){

        int sum= 0;

        for(int i=1; i<=n; i++){

            if(i % 2 != 0){

                sum += i;
            }
        }

        System.out.println("Sum of odd numbers from 1 to"+n+"="+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();

        printoddsum(n);
    }
    
}
