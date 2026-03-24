import java.util.*;

public class pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            
            // print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print 5 stars
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}
