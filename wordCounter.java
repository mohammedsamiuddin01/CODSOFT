import java.util.Scanner;
public class wordCounter {
    public static void main(String [] args)
    {
        System.out.println("Enter A String:");
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        int c=1;
    for(int i=0;i<s.length()-1;i++)
    {
        if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' '))
        {
            c++;
        }
    }
    System.out.println("Number of words in given string are: "+c);
}
}