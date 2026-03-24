import java.util.*;

public class numbrfunc {

    public static void printAverage(int a, int b, int c) {
        double avg = (a + b + c) / 3.0;
        System.out.println("Average: " + avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        printAverage(num1, num2, num3);
    }
}
