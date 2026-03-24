import java.util.*;
public class StringBlddr {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Mohit");
        System.out.println(sb);

        // sb.insert(0, 'Y');
        // System.out.println(sb);


        sb.insert(2, 'o');
        System.out.println(sb);

        //delete the xtra o

        sb.delete(2, 3);
        System.out.println(sb);


        //char at index 0

        // System.out.println(sb.charAt(0));



        //set char at index 0

        // sb.setCharAt(0, 'R');
        // System.out.println(sb);
    }
    
}
