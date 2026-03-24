import java.util.*;
public class FindxinArray {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take dimensions
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // declare 2D array
        int [][] numbers = new int[rows][cols];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        int x= sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){

                //comparing with x

                if(numbers[i] [j] == x){
                    System.out.println("x is found at locations ("+ i +" , "+ j +")");
                }
            }
        }
}

}
