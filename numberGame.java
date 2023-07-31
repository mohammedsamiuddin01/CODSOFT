import java.util.*;
public class numberGame{
    public static void main(String args[])
    {
        Random rand =new Random();
        Scanner sc=new Scanner(System.in);
        int compnum=rand.nextInt(101);
        int count=0;
        while(true){
            System.out.println("Enter your guess from 1 to 100");
            int userguess=sc.nextInt();
            count++;
            if(userguess==compnum){
                System.out.println("Correct! You guessed it right.");
                System.out.println("You guessed in "+count+" tries");
                break;
            }
            else if(compnum>userguess){
                System.out.println("Guessed number is low than computer number.Try Again");
            }
            else{
                System.out.println("Guessed number is Higher than computer number.Try Again");
            }
        }
    }
}