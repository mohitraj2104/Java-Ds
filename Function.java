import java.util.*;

public class Function {

    // function definition
    public static void printMyName(String name) {
        System.out.println(name);
        return;  // this "return;" is optional here
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // input scanner
        String name = sc.next();               // reads input (only 1 word, stops at space)
        
        printMyName(name);                     // function call
    }
}
