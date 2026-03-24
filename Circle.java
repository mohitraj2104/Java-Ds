// import java.util.*;

// public class Circle {

//     // function to return circumference
//     public static double getCircumference(double radius) {
//         return 2 * Math.PI * radius;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         double radius = sc.nextDouble();
//         double circumference = getCircumference(radius);

//         System.out.println("Circumference of circle: " + circumference);
//     }
// }

import java.util.*;

public class Circle{
    public static double getCircumference(double radius){
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        double radius =sc.nextDouble();
        double circumference =getCircumference(radius);
        System.out.println("Circumference of Circle:" +circumference );
    }

}