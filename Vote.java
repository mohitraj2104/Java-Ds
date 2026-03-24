import java.util.*;
public class Vote {

    public static boolean IsEligibletoVote(int age){
        if(age > 18){
            return true;
        }else{
            return false;
        }
    }

        public static void main(String args[]){
            Scanner sc= new Scanner(System.in);

            int age = sc.nextInt();

            if(IsEligibletoVote(age)){
                System.out.println("Eligible to vote");
            }else{
                System.out.println("Not Eligible to vote");
            }
    }
    
}
